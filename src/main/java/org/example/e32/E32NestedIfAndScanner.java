package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner genScan = new Scanner(System.in);

        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F");

        // Capture the gender input
        char gender = genScan.next().charAt(0);

        // Print prompt for user to enter age
        System.out.println("Please enter your age");

        // Capture the age input
        int age = genScan.nextInt();

        // Classify based on gender and age
        if (age > 25 ){
            if (gender=='F'){
                System.out.println("Woman");
            } else if (gender=='M'){
                System.out.println("Man");
            } else {
                System.out.println("Unknown gender");
            }
        } else if (age <= 25) {
            if (gender=='F'){
                System.out.println("Girl");
            } else if (gender=='M') {
                System.out.println("Boy");
            } else {
                System.out.println("Unknown gender");
            }
            genScan.close();
        }
    }
}
