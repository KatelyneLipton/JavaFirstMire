package ru.mirea.task1;

public class Summa {
    public static void main(String[] args) {
        System.out.println("Задание 1. Сумма элементов целочисленного массива");
        int[] array = {3, 16, 4, 41, 32};
        int sum = 0;
        int i = 0;
        for (i = 0; i < array.length; ++i)
            sum += array[i];
        System.out.println("1. Сумма = " + sum + " (с помощью цикла for)");

        sum = 0;
        i = 0;
        while (i < array.length) {
            sum += array[i];
            ++i;
        }
        System.out.println("2. Сумма = " + sum + " (с помощью цикла while)");

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            ++i;
        } while (i < array.length);
        System.out.println("3. Сумма = " + sum + " (с помощью цикла do while)");
    }
}
