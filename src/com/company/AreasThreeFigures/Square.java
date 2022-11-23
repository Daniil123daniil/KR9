package com.company.AreasThreeFigures;

public class Square implements Area{

    private float a;

    @Override
    public float calculateArea() {
        return a * a;
    }

    public Square(float a) {
        this.a = a;
    }
}
