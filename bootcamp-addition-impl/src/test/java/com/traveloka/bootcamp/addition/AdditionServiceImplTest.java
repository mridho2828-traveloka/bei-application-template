package com.traveloka.bootcamp.addition;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = "small")
public class AdditionServiceImplTest {
    private AdditionService additionService;

    @BeforeClass
    public void setUp() {
        additionService = new AdditionServiceImpl();
    }

    @Test
    public void testAdd_WithIntegers_ReturnsCorrectResult() {
        assertEquals(additionService.add(1, 2), 3);
    }

    @Test
    public void testAdd_WithAddRequest_ReturnsCorrectAddResponse() {
        AddResponse addResponse = additionService.add(new AddRequest(1, 2));
        assertEquals(addResponse.getResult(), 3);
    }
}