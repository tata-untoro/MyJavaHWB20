package org.example.e27;

public class E27GradeCalculatorElseIf {
    public static void main(String[] args) {
        // Hint: Declare 'score' as an int and assign 85 to it
        int score = 85;

        // Hint: Use if-else if statements to check grades A, B, C, D, F in order

        if(score >= 90 && score <= 100){
            System.out.println("Your grade is: A");
        } else if (score >= 80 && score <= 89){
            System.out.println("Your grade is: B");
        } else if (score >= 70 && score <=79){
            System.out.println("Your grade is: C");
        } else if (score >= 60 && score <=69){
            System.out.println("Your grade is: D");
        } else if (score <= 59 && score >=0){
            System.out.println("Your grade is: F");
        } else{
            System.out.println("Score must be in range 0-100!");
        }
    }
}