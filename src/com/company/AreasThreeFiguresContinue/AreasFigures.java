package com.company.AreasThreeFiguresContinue;

import java.util.Arrays;
import java.util.Scanner;

public class AreasFigures {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a;

        Area[] figure2 = new Area[scanner.nextInt()];
        float[] result = new float[figure2.length];

        for (int i = 0; i < figure2.length; i++) {
            a = scanner.next();
            if (a.equals("Круг")) {
                figure2[i] = new Circle(scanner.nextFloat());
                result[i] = figure2[i].calculateArea();
            }
            else if (a.equals("Треугольник")) {
                figure2[i] = new RightTriangle(scanner.nextFloat(), scanner.nextFloat());
                result[i] = figure2[i].calculateArea();
            }
            else if (a.equals("Квадрат")) {
                figure2[i] = new Square(scanner.nextFloat());
                result[i] = figure2[i].calculateArea();
            }
        }

        System.out.println(Arrays.toString(figure2));
        System.out.println(Arrays.toString(result));

    }

}
