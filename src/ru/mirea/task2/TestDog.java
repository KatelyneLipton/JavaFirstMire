package ru.mirea.task2;
import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Lolita", 4);
        Dog d2 = new Dog("Jassi", 8);
        Dog d3 = new Dog("Poppi", 12);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.HumanAge();
        d2.HumanAge();
        d3.HumanAge();
    }
}
