package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String originalStr = scan.nextLine();

        // Remove all spaces and convert to lower case
        String formattedStr = originalStr.replaceAll("\\s","").toLowerCase();

        // Check if the string is a Palindrome
        StringBuilder reverseStr = new StringBuilder(formattedStr);
        reverseStr.reverse();

        // Compare original string to reverse string
        boolean isPalindrome = formattedStr.equals(reverseStr.toString());

        // Print out
        if (isPalindrome){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Close scanner
        scan.close();

    }
}
