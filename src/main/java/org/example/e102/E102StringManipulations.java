package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and read
        System.out.println("In:");
        String input = scan.nextLine();

        // Loop
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        scan.close();
    }
}
