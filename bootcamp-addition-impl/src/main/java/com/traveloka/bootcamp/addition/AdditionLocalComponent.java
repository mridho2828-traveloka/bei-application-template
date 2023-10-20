package com.traveloka.bootcamp.addition;

public class AdditionLocalComponent implements AdditionComponent {
    private final AdditionService additionService;

    public AdditionLocalComponent() {
        this.additionService = new AdditionServiceImpl();
    }

    @Override
    public AdditionService getAdditionService() {
        return additionService;
    }
}
