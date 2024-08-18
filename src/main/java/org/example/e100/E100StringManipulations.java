package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);

        // Prompt user and read scanner
        System.out.println("In: ");
        String input = scan.nextLine();

        // Initialize reverse string
        String reverseStr = "";

        // Loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reverseStr += input.charAt(i);
        }

        System.out.println(reverseStr);

        scan.close();
    }
}
