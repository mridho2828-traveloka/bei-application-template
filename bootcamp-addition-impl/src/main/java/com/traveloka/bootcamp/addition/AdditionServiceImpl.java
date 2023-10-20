package com.traveloka.bootcamp.addition;

public class AdditionServiceImpl implements AdditionService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public AddResponse add(AddRequest addRequest) {
        int result = add(addRequest.getA(), addRequest.getB());
        return new AddResponse(result);
    }
}
