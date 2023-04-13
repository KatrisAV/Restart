package HW;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first variable");
        double num1 = input.nextDouble();

        System.out.println("Enter second variable");
        double num2 = input.nextDouble();

        System.out.println(" Select the mathematical operation you want to perform: ");
        System.out.println("For Amount enter 1");
        System.out.println("For Average value enter 2");
        System.out.println("For Matching enter 3");

        byte choice = input.nextByte();

        switch (choice) {
            case 1:
                double sum = num1 + num2;
                System.out.println("Amount : " + sum);
                break;
            case 2:
                double average = (num1 + num2) / 2;
                System.out.println("Average value: " + average);
                break;
            case 3:
                if (num1 == num2) {
                    System.out.println("The numbers are equal");
                } else if (num1 > num2) {
                    System.out.println("First variable is greater than second");
                } else {
                    System.out.println("Second variable is greater than first");
                }
                break;


        }
    }
}
