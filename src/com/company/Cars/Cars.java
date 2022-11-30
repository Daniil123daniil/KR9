package com.company.Cars;

import java.util.function.BinaryOperator;

public enum Cars {

    Car1(Marka.BMW.getInomarka(), "X5", 240, 7000000, Color.Black.getColor()),
    Car2(Marka.Audi.getInomarka(), "A8",280, 8051000, Color.Grey.getColor()),
    Car3(Marka.Toyota.getInomarka(), "Camry 3.5",220, 3601000, Color.Brown.getColor()),
    Car4(Marka.Lada.getInomarka(), "Vesta",193, 1122000, Color.White.getColor()),
    Car5(Marka.Mercedes.getInomarka(),"E320",230, 3750000, Color.SilverMetallic.getColor());


    private String model;
    private int maxspeed;
    private int price;
    private String inomarka;
    private String color;

    Cars(String inomarka, String model, int maxspeed, int price, String color) {
        this.inomarka = inomarka;
        this.model = model;
        this.maxspeed = maxspeed;
        this.price = price;
        this.color = color;
    }

    public String getInomarka() {
        return inomarka;
    }

    public String getModel() {
        return model;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Машина: " +
                "иномарка = " + inomarka +
                ", модель = " + model +
                ", Макс.скорость = " + maxspeed + " км/ч" +
                ", цена = " + price + " ₽ " +
                ", цвет = " + color;
    }
}
