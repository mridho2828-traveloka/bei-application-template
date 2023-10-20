package com.traveloka.bootcamp.subtraction;

public class SubtractRequest {
    private int a;
    private int b;

    public SubtractRequest() {
    }

    public SubtractRequest(int a, int b) { // bad practice, especially for a lot of arguments, use @Builder instead
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
