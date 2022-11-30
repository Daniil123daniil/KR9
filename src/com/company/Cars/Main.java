package com.company.Cars;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int h = 0;

        for (Cars c : Cars.values()) {
            if (a >= c.getPrice()) {
                h += 1;
            }
        }

        Cars[] v = new Cars[h];

        h = 0;
        for (Cars c : Cars.values()) {
            if (a >= c.getPrice()) {
                v[h] = c;
                h++;
            }
        }

        for (int i = 0; i < v.length - 1; i++) {
            for (int j = v.length - 1; j > i; j--) {
                if (v[j - 1].getMaxspeed() > v[j].getMaxspeed()) {
                    Cars tmp = v[j - 1];
                    v[j - 1] = v[j];
                    v[j] = tmp;
                }
            }
        }

        for (int i = 0; i < h; i++) {
            System.out.println(v[i].toString());
        }
    }
}
