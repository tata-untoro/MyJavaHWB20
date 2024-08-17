package org.example.e98;

public class E98StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "Hello Syntax friends" to it
        String given = "Hello Syntax friends";

        // Manipulate the string to create a new string "Welcome Syntax family"
        String hello = given.substring(0,5);
        String welcome = hello.replace("Hello", "Welcome");
        String syntax = given.substring(6,12);
        String friends = given.substring(13);
        String family = friends.replace("friends", "family");

        // Print the new string
        System.out.println(welcome.concat(" " + syntax + " " +family));


    }
}
