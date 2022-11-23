package com.company.Telephone;

public class Operator {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+79328129436", "Xiaomi", 34);
        Phone phone2 = new Phone("+79802738172", "Huawei", 56);
        Phone phone3 = new Phone("+79302839212", "IPhone", 74);
        String[] arr = {"+79328129436", "+79802738172", "+79302839212"};

        System.out.println(phone1.getNumber());
        System.out.println(phone1.receiveCall("Макс"));
        System.out.println(phone2.getModel());
        System.out.println(phone2.receiveCall("Коля"));
        System.out.println(phone3.getWeight());
        System.out.println(phone3.receiveCall("Ваня"));

        phone1.sendMassage(arr);
        phone2.sendMassage(arr);
        phone3.sendMassage(arr);

    }

}
