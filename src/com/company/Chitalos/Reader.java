package com.company.Chitalos;

public class Reader {

    private String FIO;
    private String numberOfTicket;
    private String fackultet;
    private String birthOfYear;
    private String telephone;

    public String takeBook(int n) {
        return (FIO + " взял " + n + " книгу(и)");
    }

    public void takeBook(String[] a) {
        System.out.println(FIO + " взял книгу(и): ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void takeBook(Book[] name) {
        System.out.println(FIO + " взял книгу(и): ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].getNameBook());
        }
    }

    public String returnBook(int n) {
        return (FIO + " вернул " + n + " книгу(и)");
    }

    public void returnBook(String[] a) {
        System.out.println(FIO + " вернул книгу(и): ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public void returnBook(Book[] name) {
        System.out.println(FIO + " вернул книгу(и): ");
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].getNameBook());
        }
    }

    public Reader(String FIO) {
        this.FIO = FIO;
    }
}
