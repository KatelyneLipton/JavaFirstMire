package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball a = new Ball(1,2);
        System.out.println(a.toString());
        a.move(3,4);
        System.out.println(a.toString());
        a.setXY(20,20);
        System.out.println(a.toString());
    }
}
