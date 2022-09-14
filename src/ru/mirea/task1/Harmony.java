package ru.mirea.task1;

public class Harmony {
    public static void main(String[] args) {
        System.out.println("\nЗадание 3. Гармонический ряд.");
        for (int i = 1; i <= 10; ++i)
            System.out.print(String.format("%.3f  ", 1.0 / i));
        System.out.println();
    }
}
