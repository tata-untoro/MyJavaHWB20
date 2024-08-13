package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a value for end
        System.out.println("Int:");
        int end = scan.nextInt();

        // Use a for loop that starts with i = 0 and continues while i < 2 * end
        for (int i = 0; i<2*end; i++){
            System.out.print(i + " ");
        }

    }
}
