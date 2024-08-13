package org.example.e63;

import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a value for x
        System.out.println("In: ");
        int x = scan.nextInt();

        // Use a for loop that starts with i = 0 and continues while i < x
        for (int i =0; i<x; i++){
            System.out.print(i + " ");
        }
        scan.close();
    }
}
