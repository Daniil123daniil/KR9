package com.company.Chitalos;

import java.util.Scanner;

public class Archive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Reader reader = new Reader("Петров В.В.");

        int A = scanner.nextInt();

        System.out.println(reader.takeBook(A));
        System.out.println(reader.returnBook(A));

        String[] B = {"Мёртвые души", "Му-Му", "Собачье сердце"};

        reader.takeBook(B);
        reader.returnBook(B);

        Book[] C = {new Book("Гоголь", "Мёртвые души"), new Book("Тургенев", "Му-Му"), new Book("Тургенев", "Собачье сердце")};

        reader.takeBook(C);
        reader.returnBook(C);

    }

}
