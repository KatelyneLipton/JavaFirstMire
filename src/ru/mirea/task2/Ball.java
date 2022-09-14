package ru.mirea.task2;

public class Ball {
    private int size;
    private String color;

    public Ball(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Ball(int size) {
        this.size = size;
        this.color = "red";
    }

    public Ball(String color) {
        this.color = color;
        this.size = 10;
    }
    public Ball() {
        this.color = "red";
        this.size = 10;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size = " + size +
                ", color = '" + color + '\'' +
                '}';
    }
}

class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        System.out.println(ball.toString());
    }
}
