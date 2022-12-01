package com.company.Months;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println(Months.January.getTranslation());
                break;
            case 2:
                System.out.println(Months.February.getTranslation());
                break;
            case 3:
                System.out.println(Months.March.getTranslation());
                break;
            case 4:
                System.out.println(Months.April.getTranslation());
                break;
            case 5:
                System.out.println(Months.May.getTranslation());
                break;
            case 6:
                System.out.println(Months.June.getTranslation());
                break;
            case 7:
                System.out.println(Months.July.getTranslation());
                break;
            case 8:
                System.out.println(Months.August.getTranslation());
                break;
            case 9:
                System.out.println(Months.September.getTranslation());
                break;
            case 10:
                System.out.println(Months.October.getTranslation());
                break;
            case 11:
                System.out.println(Months.November.getTranslation());
                break;
            case 12:
                System.out.println(Months.December.getTranslation());
                break;


        }


    }

}
