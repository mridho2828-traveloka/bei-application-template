package com.traveloka.bootcamp.addition;

public class AdditionStubComponent implements AdditionComponent {
    private final AdditionService additionService;

    public AdditionStubComponent() {
        this.additionService = new AdditionStubService();
    }

    @Override
    public AdditionService getAdditionService() {
        return additionService;
    }
}
