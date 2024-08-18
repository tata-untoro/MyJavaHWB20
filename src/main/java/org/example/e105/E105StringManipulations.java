package org.example.e105;


import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("In:");
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if(x == 'a' || x == 'i' || x == 'u' || x == 'e' || x == 'o'){
                System.out.print(x);
            }
        }
        System.out.println();
        scan.close();
    }
}
