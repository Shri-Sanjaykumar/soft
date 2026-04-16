package junitlab;

import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Factorial obj = new Factorial();

        System.out.println("Enter a number:");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter integer only.");
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers.");
            return;
        }

        System.out.println("\n--- OUTPUT ---");
        System.out.println("Factorial of " + n + " = " + obj.fact(n));

        sc.close();
    }
}