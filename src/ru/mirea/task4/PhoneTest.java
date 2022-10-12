package ru.mirea.task4;

public class PhoneTest {
    public static void main(String[] args) {
        Phone obj1 = new Phone();
        obj1.setNumber(681233);
        obj1.setModel("X");
        obj1.setWeight(235);
        System.out.println(obj1.toString());
        obj1.receiveCall(234512);

        System.out.println();

        Phone obj2 = new Phone(123443,"Y");
        System.out.print(obj2.getNumber() + " " + obj2.getModel());

        System.out.println();

        Phone obj3 = new Phone(738212,265,"Z");
        System.out.println(obj3.toString());
        obj3.receiveCall(124623,"Jane");
        obj3.sendMessage(672395);
    }
}
