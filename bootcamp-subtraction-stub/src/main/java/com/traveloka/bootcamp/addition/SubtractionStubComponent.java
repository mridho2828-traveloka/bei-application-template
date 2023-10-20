package com.traveloka.bootcamp.addition;

import com.traveloka.bootcamp.subtraction.SubtractionComponent;
import com.traveloka.bootcamp.subtraction.SubtractionService;

public class SubtractionStubComponent implements SubtractionComponent {
    private final SubtractionService subtractionService;

    public SubtractionStubComponent() {
        this.subtractionService = new SubtractionStubService();
    }

    @Override
    public SubtractionService getSubtractionService() {
        return subtractionService;
    }
}
