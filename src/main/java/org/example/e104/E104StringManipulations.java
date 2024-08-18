package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("In:");
        
        String [] name = new String[5];

        for (int i=0; i<name.length; i++){
            name[i] = scan.nextLine();
        }
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i].substring(0,3));
        }
        scan.close();

    }
}


