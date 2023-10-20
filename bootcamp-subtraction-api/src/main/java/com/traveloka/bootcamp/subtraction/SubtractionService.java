package com.traveloka.bootcamp.subtraction;

public interface SubtractionService {
    /**
     * Calculate a - b.
     *
     * @param a The first digit.
     * @param b The second digit.
     *
     * @return The result of a - b.
     */
    int subtract(int a, int b);

    /**
     * Calculate a - b within the request object.
     *
     * @param request The request containing the two digits.
     * @return The response containing the result.
     */
    SubtractResponse subtract(SubtractRequest request);
}
