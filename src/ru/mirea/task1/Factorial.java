package ru.mirea.task1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("\nЗадание 5. Факториал");
        System.out.println("Факториал (4) = " + fac(4));
    }

    static long fac(int num) {
        long fac = 1;
        for (int i = 1; i <= num; i++)
            fac *= i;
        return fac;
    }
}

