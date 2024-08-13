package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double activity1 = 45.5;
        double activity2 = 30.2;
        double activity3 = 60.7;

        // Calculate total time
        double totalTime = activity1 + activity2 + activity3;

        // Type cast the total time to an int to get total minutes
        int convertedTime = (int) totalTime;

        // Calculate hours and remaining minutes
        int hours = convertedTime / 60;
        int minutes = convertedTime % 60;

        // Print the results
        System.out.println("The original total time is " + totalTime + " minutes.");
        System.out.println("The converted time is " + hours + " hours and " + minutes + " minutes.");
    }
}
