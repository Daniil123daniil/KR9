package com.company.Cars;

public enum Marka {

    BMW("БМВ"), Audi("Ауди"), Toyota("Тойота"), Lada("Лада"), Mercedes("Мерседес");


    private String inomarka;

    Marka(String inomarka) {
        this.inomarka = inomarka;
    }

    public String getInomarka() {
        return inomarka;
    }

}
