package junitlab;

import java.util.Scanner;

public class PalindromeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Palindrome obj = new Palindrome();

        System.out.println("Enter a string:");

        if (!sc.hasNext()) {
            System.out.println("Invalid input!");
            return;
        }

        String str = sc.next();

        if (str.length() == 0) {
            System.out.println("Empty string not allowed.");
            return;
        }

        System.out.println("\n--- OUTPUT ---");

        if (obj.isPalindrome(str))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is NOT a Palindrome");

        sc.close();
    }
}