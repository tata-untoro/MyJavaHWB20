package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a browser name
        System.out.println("Please input a browser name");

        // Read the input string
        String str = scan.nextLine();

        // Use conditional statements to print the message based on the input
        if (str.equalsIgnoreCase("chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (str.equalsIgnoreCase("firefox")){
            System.out.println("Proceed with Firefox browser");
        } else if (str.equalsIgnoreCase("Ie")){
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }
        scan.close();
    }
}
