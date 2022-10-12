package ru.mirea.task2;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj1 = new Circle(8);
        System.out.println(obj1.getLength());
        System.out.println(obj1.getSquare());
        Circle obj2 = new Circle(4);
        Circle obj3 = new Circle(10);
        obj1.compare(obj2);
        obj1.compare(obj3);
    }
}