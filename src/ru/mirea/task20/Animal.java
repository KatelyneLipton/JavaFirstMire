package ru.mirea.task20;


public class Animal {
    private String name, kind;
    Animal(){
        name = "Agar";
        kind = "delphin";
    }

    @Override
    public String toString() {
        return "Это животное является: " + kind + ". Его имя: " + name;
    }
}