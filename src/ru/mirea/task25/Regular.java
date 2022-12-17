package ru.mirea.task25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            try{
                System.out.print("Enter expression: ");
                Pattern pattern = Pattern.compile(in.nextLine());
            }catch (PatternSyntaxException pse){
                System.out.println("Mes: " + pse.getMessage() + " index: " +pse.getIndex());
            }
        }
    }
}