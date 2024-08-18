package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("In: ");
        String input = scan.nextLine();

        // Initialize variable to store value
        String result = "";

        // Loop
        for (int i=0; i<input.length(); i+=2){
            result += input.charAt(i);
        }

        System.out.println(result);
        scan.close();

    }
}
