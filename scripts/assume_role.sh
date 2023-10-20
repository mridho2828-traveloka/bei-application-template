assume BeiartfReader@tvlk-build-special

eval "aws configure --profile beiartf set aws_access_key_id ${AWS_ACCESS_KEY_ID}"
eval "aws configure --profile beiartf set aws_secret_access_key ${AWS_SECRET_ACCESS_KEY}"
eval "aws configure --profile beiartf set aws_session_token ${AWS_SESSION_TOKEN}"

# login to codeartifact
CODEARTIFACT_AUTH_TOKEN=$(aws --region ap-southeast-1 --profile beiartf codeartifact get-authorization-token --domain org-codeartifact-domain-015110552125-242c507c3f --domain-owner 015110552125 --query authorizationToken --output text)

# insert / update codeartifact token in the machine's gradle.properties
mkdir -p ~/.gradle/ && touch ~/.gradle/gradle.properties
grep -q "^external_cache_codeartifact_token" ~/.gradle/gradle.properties && sed -i.bak "s/^external_cache_codeartifact_token.*/external_cache_codeartifact_token=$CODEARTIFACT_AUTH_TOKEN/" ~/.gradle/gradle.properties || echo "external_cache_codeartifact_token=$CODEARTIFACT_AUTH_TOKEN" >> ~/.gradle/gradle.properties

aws --region ap-southeast-1 --profile beiartf ecr get-login-password | docker login --username AWS --password-stdin 015110552125.dkr.ecr.ap-southeast-1.amazonaws.com
aws --region ap-southeast-1 --profile beiartf ecr get-login-password | docker login --username AWS --password-stdin 745412875337.dkr.ecr.ap-southeast-1.amazonaws.com
