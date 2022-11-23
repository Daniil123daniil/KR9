package com.company.Telephone;

public class Phone {

    private String number;
    private String model;
    private float weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public float getWeight() {
        return weight;
    }

    public String receiveCall(String a) {
        return ("Звонит " + a);
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public String receiveCall(String a, String number) {
        return ("Звонит " + a + number);
    }

    public void sendMassage(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
