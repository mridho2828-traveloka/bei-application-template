package com.traveloka.bootcamp.calculator;

import com.traveloka.bootcamp.addition.AdditionComponent;
import com.traveloka.bootcamp.subtraction.SubtractionComponent;

public class CalculatorLocalComponent implements CalculatorComponent {
    private final CalculatorService calculatorService;

    public CalculatorLocalComponent(AdditionComponent additionComponent,
                                    SubtractionComponent subtractionComponent) {
        calculatorService = new CalculatorServiceImpl(
                additionComponent.getAdditionService(),
                subtractionComponent.getSubtractionService());
    }

    @Override
    public CalculatorService getCalculatorService() {
        return calculatorService;
    }
}
