package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Cities {
    private String name;
    private int population;

    public Cities(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cities city = (Cities) o;
        return population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "Город {" +
                " Название = '" + name + '\'' +
                ", Население = " + population +
                '}';
    }

    public static void cityInfo (HashMap<University,Cities> a, Cities city){
        int stud = 0;

        for (Map.Entry<University,Cities> b : a.entrySet()) {
            if (b.getValue().equals(city)){
                stud += b.getKey().getStudentsNumber();
            }
        }
        System.out.println(city.name + ": " + " на " + city.population + " житилей приходится " + stud + " студентов");
    }
}