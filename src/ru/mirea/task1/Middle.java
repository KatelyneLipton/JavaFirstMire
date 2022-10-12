package ru.mirea.task1;

public class Middle {
    public static void main(String[] args) {
        int[] num = new int[]{23, 56, 2, 3, 7, 12, 66, 20, 1, 10};
        int sum = 0;
        int middleA;
        for (middleA = 0; middleA < num.length; middleA++) {
            sum+= num[middleA];
        }
        middleA = sum / num.length;
        System.out.println(middleA);
    }
}
