package com.company.LoginAndPassword;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите логин(Логин должен содержать латинские буквы, цифры и знак подчёркивания): ");
            String login = scanner.next();
            long a = 20;

            if (login.length() > a) {
                throw new WrongLoginException("В логине больше 20 символов");
            }
            else if (!login.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=.*[0-9]).+")) {
                throw new WrongLoginException("Логин не соответствует требованию");
            }
            else {
                System.out.print("Введите пароль(Пароль должен содержать латинские буквы, цифры и знак подчёркивания): ");
                String Password = scanner.next();

                if (Password.length() > a) {
                    throw new WrongPasswordException("В пароле больше 20 символов");
                }
                else if (!Password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[_])(?=.*[0-9]).+")) {
                    throw new WrongPasswordException("Пароль не соответствует требованию");
                }
                else {
                    System.out.print("Подтвердите пароль: ");
                    String ConfrimPassword = scanner.next();

                    if (!Password.equals(ConfrimPassword)) {
                        throw new WrongPasswordException("Пароли не совпадают");
                    }
                    else {
                        System.out.println("Пароли совпадают");
                    }
                }
            }
        }
        catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }

    }

}
