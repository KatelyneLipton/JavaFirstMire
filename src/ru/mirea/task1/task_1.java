package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class task_1 {
    static void sortArray(int[] a) {
        for(int k=0; k < a.length-1; ++k) {
            for(int i=0; i < a.length-k-1; ++i) {
                if(a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1. Сумма элементов целочисленного массива");
        int[] array = {1, 3, 13, 23, 5};
        int sum = 0;
        int i = 0;
        for(i=0; i < array.length; ++i)
            sum += array[i];
        System.out.println("1. Сумма = " + sum + " (с помощью цикла for)");

        sum = 0; i = 0;
        while(i < array.length) {
            sum += array[i];
            ++i;
        }
        System.out.println("2. Сумма = " + sum + " (с помощью цикла while)");

        sum = 0; i = 0;
        do {
            sum += array[i];
            ++i;
        } while(i < array.length);
        System.out.println("3. Сумма = " + sum + " (с помощью цикла do while)");


        System.out.println("\nЗадание 2. Аргументы командной строки");
        for(i=0; i < args.length; ++i) {
            System.out.println("Аргумент = " + args[i]);
        }

        System.out.println("\nЗадание 3. Гармонический ряд.");
        for (i = 1; i <= 10; ++i)
            System.out.print(String.format("%.3f  ", 1.0 / i));
        System.out.println();


        System.out.println("\nЗадание 4. Генерация массива целых чисел случайным образом");
        System.out.println(" 1 подход");
        for(i=0; i < array.length; ++i)
            array[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));


        Random rand = new Random();
        System.out.println(" 2 подход");
        for(i=0; i < array.length; ++i)
            array[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));


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


