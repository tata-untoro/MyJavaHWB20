package org.example.e85;

public class E85NestedForLoops {
    public static void main(String[] args) {
        // Outer loop controls the number of lines in the upper part of the pattern
        int x = 7;
        // Use a loop that starts from 1 and goes up to 7 (inclusive)
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = x-1; i >=1 ; i--) {
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}

