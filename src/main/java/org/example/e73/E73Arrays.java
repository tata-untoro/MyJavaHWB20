package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Create an array of integers that will store 5 elements
        int [] arr = new int[5];

        // Use a loop to read 5 integers from the user and store them in the array
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        for (int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
