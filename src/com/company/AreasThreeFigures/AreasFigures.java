package com.company.AreasThreeFigures;

import java.util.Scanner;

public class AreasFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String figure = scanner.next();


        switch (figure) {
            case "Круг":
                Circle circle = new Circle(scanner.nextFloat());
                System.out.println(circle.calculateArea());
                break;
            case "Треугольник":
                RightTriangle rightTriangle = new RightTriangle(scanner.nextFloat(), scanner.nextFloat());
                System.out.println(rightTriangle.calculateArea());
                break;
            case "Квадрат":
                Square square = new Square(scanner.nextFloat());
                System.out.println(square.calculateArea());
                break;
            default:
                System.out.println("Пизда вам!");
        }

    }

}
