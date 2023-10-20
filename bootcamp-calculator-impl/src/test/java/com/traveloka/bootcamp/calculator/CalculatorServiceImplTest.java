package com.traveloka.bootcamp.calculator;

import com.traveloka.bootcamp.addition.AdditionComponent;
import com.traveloka.bootcamp.addition.AdditionStubComponent;
import com.traveloka.bootcamp.addition.SubtractionStubComponent;
import com.traveloka.bootcamp.subtraction.SubtractionComponent;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = "small")
public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService;

    public CalculatorServiceImplTest() {
        // creates stub components
        AdditionComponent additionComponent = new AdditionStubComponent();
        SubtractionComponent subtractionComponent = new SubtractionStubComponent();

        calculatorService = new CalculatorServiceImpl(
                additionComponent.getAdditionService(),
                subtractionComponent.getSubtractionService()
        );
    }

    @Test
    public void testAdd_WithIntegers_ReturnCorrectResult() {
        assertEquals(calculatorService.add(1, 2), 3);
    }

    @Test
    public void testSubtract_WithIntegers_ReturnCorrectResult() {
        assertEquals(calculatorService.subtract(2, 1), 1);
    }
}