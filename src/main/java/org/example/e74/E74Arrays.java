package org.example.e74;

import java.util.Scanner;

public class E74Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Create an array of integers with a size of 5
        int [] arr = new int[5];
        // Use a loop to read 5 integers from the user and store them in the array
        for (int i = 0; i < arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]*10);
        }


        // Use another loop to multiply each element of the array by 10 and print the result

    }
}
