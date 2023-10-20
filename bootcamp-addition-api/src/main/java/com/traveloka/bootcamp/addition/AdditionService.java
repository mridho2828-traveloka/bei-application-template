package com.traveloka.bootcamp.addition;

public interface AdditionService {
    /**
     * Calculate a + b.
     *
     * @param a First Digit.
     * @param b Second Digit.
     * @return Result of a + b.
     */
    int add(int a, int b);


    AddResponse add(AddRequest addRequest);
}
