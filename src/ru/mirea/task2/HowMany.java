package ru.mirea.task2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        String[] splitted=line.split("\\s+");
        System.out.println(splitted.length);
    }
}