package junitlab;

import java.util.Scanner;

public class ArithmeticMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Arithmetic obj = new Arithmetic();

        int a, b;

        System.out.println("Enter first number:");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        a = sc.nextInt();

        System.out.println("Enter second number:");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter an integer.");
            return;
        }
        b = sc.nextInt();

        System.out.println("\n--- OUTPUT ---");

        System.out.println("Addition: " + obj.add(a, b));
        System.out.println("Subtraction: " + obj.sub(a, b));
        System.out.println("Multiplication: " + obj.mul(a, b));

        if (b == 0)
            System.out.println("Division: Cannot divide by zero");
        else
            System.out.println("Division: " + obj.div(a, b));

        System.out.println("Square: " + obj.square(a));

        sc.close();
    }
}