package com.company.AreasThreeFiguresContinue;

public class Circle implements Area {

    private final static float Pi = (float) Math.PI;
    private float R;

    @Override
    public float calculateArea() {
        return Pi * (float) Math.pow(R, 2);
    }

    public Circle(float r) {
        R = r;
    }

    @Override
    public String toString() {
        return ("Круг" + R);
    }
}
