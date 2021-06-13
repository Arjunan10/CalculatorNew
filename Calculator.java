package com.calculator;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("ENTER A NUMBER : ");

            int firstValue = in.nextInt();

            System.out.print("ENTER NEXT NUMBER : ");

            int secondValue = in.nextInt();
        

        System.out.println("      1. ADDITION (+)      ");
        System.out.println("      2. SUBRACTION (-)     ");
        System.out.println("      3. DIVISION (/)       ");
        System.out.println("      4. MULTIPLICATION(*)     ");

        System.out.println(" Select What You Want To Perform : ");
        int choice = in.nextInt();

        if (choice == 1) {
            int sum = firstValue + secondValue;
            System.out.println(" It's " + sum);
        }else if (choice == 2) {
            int sum = firstValue - secondValue;
            System.out.println(" It's " + sum);
        }else if (choice == 3) {
            int sum = firstValue / secondValue;
            System.out.println(" It's " + sum);
        }else if (choice == 4) {
            int sum = firstValue * secondValue;
            System.out.println(" It's " + sum);
        }
    }
}