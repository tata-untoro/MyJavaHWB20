package org.example.e34;

import java.util.Scanner;

public class E34NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter 3 distinct numbers separated by spaces
        System.out.println("Please enter 3 distinct numbers separated by spaces");

        // Capture the three numbers input
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // Use nested if-else statements to find the largest number
        if (num1 >= num2) {
            if (num1 == num3) {
                System.out.println("None are the largest, three numbers are same");
            } else if (num1 >= num3) {
                System.out.println("The largest number is " + num1);
            }
            else {
                System.out.println("The largest number is " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("The largest number is " + num2);
            } else if (num2 == num3) {
                System.out.println("num2 and num3 are same, so the largest number is " + num2 + " and " + num3);
            }
            else {
                System.out.println("The largest number is " +num3);
            }
        }
        scan.close();
    }
}




