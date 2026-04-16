package junitlab;

import java.util.Scanner;

public class PrimeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Prime obj = new Prime();

        System.out.println("Enter a number:");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Enter integer only.");
            return;
        }

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Negative numbers are not valid for prime check.");
            return;
        }

        System.out.println("\n--- OUTPUT ---");

        if (obj.isPrime(n))
            System.out.println(n + " is a Prime Number");
        else
            System.out.println(n + " is NOT a Prime Number");

        sc.close();
    }
}