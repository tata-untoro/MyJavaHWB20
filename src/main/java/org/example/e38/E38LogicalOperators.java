package org.example.e38;

import java.util.Scanner;

public class E38LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to answer if it is the weekend
        System.out.println("Is it weekend? (true/false)");

        // Capture the weekend input
        boolean isWeekend = scan.nextBoolean();

        // Print prompt for user to answer if available or not
        System.out.println("Are you available? (true/false)");

        // Capture the available input
        boolean isAvailable = scan.nextBoolean();

        // Determine the subject based on the input
        String subject;

        if (isWeekend && isAvailable) {
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else if (!isAvailable) {
            subject = "no subject";
        } else {
            subject = "unknown";
        }

        System.out.println("Today you will be learning " + subject);
        scan.close();

    }
}
