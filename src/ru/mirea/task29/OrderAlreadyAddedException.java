package ru.mirea.task29;

public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException() {
        super("OrderAlreadyAddedException");
    }
}