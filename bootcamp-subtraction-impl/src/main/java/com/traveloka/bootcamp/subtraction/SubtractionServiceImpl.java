package com.traveloka.bootcamp.subtraction;

public class SubtractionServiceImpl implements SubtractionService {
    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public SubtractResponse subtract(SubtractRequest request) {
        return new SubtractResponse(subtract(request.getA(), request.getB()));
    }
}
