package org.example.e62;

public class E62ForLoop {
    public static void main(String[] args) {
        // Use a for loop that starts with i = 1 and continues while i <= 10
        for(int i = 1; i<=10; i++){
            if (i!=5 && i!=6){
                System.out.println(i);
            } else {
                i+=1;
            }
        }
    }
}
