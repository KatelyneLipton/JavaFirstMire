package ru.mirea.task1;
import java.util.Arrays;

public class RandomArray {
    static void sortArray(int[] a) {
        for (int k = 0; k < a.length - 1; ++k) {
            for (int i = 0; i < a.length - k - 1; ++i) {
                if (a[i] > a[i + 1]) {
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("\nЗадание 4. Генерация массива целых чисел случайным образом");
        int[] array = {1, 2, 457, 678, 789};
        System.out.println(" 1 подход");
        for (int i = 0; i < array.length; ++i)
            array[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));


        java.util.Random rand = new java.util.Random();
        System.out.println(" 2 подход");
        for (int i = 0; i < array.length; ++i)
            array[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

}
