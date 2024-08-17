package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a string value
        System.out.println("Please input a string value");

        // Read the input string
        String input = scan.nextLine();
        String originalInput = input;

        // Extract the first 3 letters using the substring() method
        input = input.substring(0,3);

        // Print the result in the specified format
        System.out.println("The first 3 letters of " + originalInput + " is " + input);

        scan.close();
    }
}
