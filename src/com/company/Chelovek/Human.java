package com.company.Chelovek;

public class Human {

    public String name;
    public String surname;
    public int yearOfRozhdenie;

    public static int year = 2022;

    public void A() {
        System.out.println(name + " " + surname + " " + B());
    }

    public int B() {
        return year - yearOfRozhdenie;
    }
}
