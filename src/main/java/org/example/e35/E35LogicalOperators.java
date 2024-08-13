package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");

        // Capture the loan requirement input
        boolean needsLoan = scan.nextBoolean();

        // Check if the user needs a loan
        String eligibility;

        if (needsLoan){
            System.out.println("What is your credit score?");
            int creditScore = scan.nextInt();

            if (creditScore < 600){
                eligibility = "Not eligible";
            } else if (creditScore >= 600 && creditScore <= 700){
                eligibility = "Maybe eligible";
            } else if (creditScore >= 701 && creditScore <= 800){
                eligibility = "Eligible";
            } else if (creditScore > 800){
                eligibility = "Definitely eligible";
            } else{
                eligibility = "Unknown";
            }
        } else {
            eligibility = "Unknown";
        }
        System.out.println("The eligibility is " + eligibility);
        scan.close();
    }
}
