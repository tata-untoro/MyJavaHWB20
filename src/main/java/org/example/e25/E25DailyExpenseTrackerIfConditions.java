package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense = 25.25;
        double afternoonExpense = 26.0;
        double eveningExpense = 25.0;

        // Calculate total expense
        double totalExpense = morningExpense + afternoonExpense + eveningExpense;
        System.out.println("Your total daily expense is: " + totalExpense);

        // Define a budget
        double budget = 100.0;

        // Check if within budget

        if (totalExpense <= budget) {
            System.out.println("You are within the budget.");
        } else {
            System.out.println("Your daily expense is over the budget");
        }
    }
}
