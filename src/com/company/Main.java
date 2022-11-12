package com.company;

import com.company.Chelovek.Human;
import com.company.PotEnergy.PotEnergy;
import com.company.RightTriangle.RightTriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//4.1
        Scanner scanner = new Scanner(System.in);
        Human human = new Human();

        human.name = scanner.next();
        human.surname = scanner.next();
        human.yearOfRozhdenie = scanner.nextInt();

        human.A();
//4.2

        RightTriangle rigthTriangle = new RightTriangle(scanner.nextInt(), scanner.nextInt());

        System.out.println(rigthTriangle.A());
//4.3

        PotEnergy potEnergy = new PotEnergy();

        potEnergy.A1(scanner.nextInt());
        potEnergy.B1(scanner.nextInt());

        System.out.println(potEnergy.E());
    }

}

