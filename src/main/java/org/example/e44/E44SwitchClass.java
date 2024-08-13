package org.example.e44;

import java.util.Scanner;

public class E44SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        // Capture the meal type input
        int mealType = scan.nextInt();
        double result;

        switch (mealType){
            case 1:
                result = mealType * 5.00;
                break;
            case 2:
                result = mealType * 5.00;
                break;
            case 3:
                result = mealType * 5.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
                return;
        }
        System.out.println("The price of your meal is $" + result);
        scan.close();

    }
}
