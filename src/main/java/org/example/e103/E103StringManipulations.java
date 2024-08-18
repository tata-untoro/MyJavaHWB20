package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        // Create Scanner
        Scanner scan = new Scanner(System.in);

        // Prompt and read
        System.out.println("In:");
        String input = scan.nextLine();

        // String builder
        StringBuilder output = new StringBuilder();

        // Loop
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(i));
            if (i < input.length() - 1) {
                output.append(" ");
            }
        }
        System.out.println(output.toString().trim());
        scan.close();
    }
}
