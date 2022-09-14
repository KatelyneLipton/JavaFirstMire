package ru.mirea.task2;

public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name ='" + name + '\'' +
                '}';
    }
}

class TestShape {
    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        System.out.println(circle.toString());
    }
}