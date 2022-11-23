package com.company.AreasThreeFigures;

public class RightTriangle implements Area{

    private float a;
    private float h;

    @Override
    public float calculateArea() {
        return 0.5f * a * h;
    }

    public RightTriangle(float a, float h) {
        this.a = a;
        this.h = h;
    }
}
