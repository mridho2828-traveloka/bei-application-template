package com.traveloka.bootcamp.subtraction;

public class SubtractionLocalComponent implements SubtractionComponent {
    private final SubtractionService subtractionService;

    public SubtractionLocalComponent() {
        this.subtractionService = new SubtractionServiceImpl();
    }

    @Override
    public SubtractionService getSubtractionService() {
        return subtractionService;
    }
}
