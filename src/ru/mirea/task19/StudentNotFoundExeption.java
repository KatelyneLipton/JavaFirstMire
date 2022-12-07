package ru.mirea.task19;

public class StudentNotFoundExeption extends Exception{
    public StudentNotFoundExeption(String errorMessage){
        super(errorMessage);
    }
}