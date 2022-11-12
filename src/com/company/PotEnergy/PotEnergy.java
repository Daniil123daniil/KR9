package com.company.PotEnergy;

public class PotEnergy {

    public static final int g = 10;
    private int h;
    private int m;
    public int E;

    public PotEnergy() {

    }

    public void A1(int h) {
        this.h = h;
    }

    public int A2() {
        return h;
    }

    public void B1(int m) {
        this.m = m;
    }

    public int B2() {
        return m;
    }

    public int E() {
        return E = m * g * h;
    }
}
