package com.company.Cars;

public enum Color {

    Black("Черный"), Grey("Серая"), Brown("Коричневая"), White("Белая"), SilverMetallic("Серебристый металик");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
