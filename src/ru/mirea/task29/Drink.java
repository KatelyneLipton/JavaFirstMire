package ru.mirea.task29;

public class Drink extends MenuItem implements Item {

    public Drink(int cost, String name, String description){
        super(cost, name, description);
        if(cost < 0 || name == null || description == null) throw new IllegalArgumentException();
    }
}