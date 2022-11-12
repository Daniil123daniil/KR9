package com.company.RightTriangle;

public class RightTriangle {

    public int katet1;
    public int katet2;
    public int hipotinuza;

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
    }

    public int A() {
        return hipotinuza = (int) Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }
}
