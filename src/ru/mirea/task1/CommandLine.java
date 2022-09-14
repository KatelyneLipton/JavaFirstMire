package ru.mirea.task1;

public class CommandLine {
    public static void main(String[] args) {
        System.out.println("\nЗадание 2. Аргументы командной строки");
        for(int i=0; i < args.length; i++) {
            System.out.println("Аргумент = " + args[i]);
        }
    }
}
