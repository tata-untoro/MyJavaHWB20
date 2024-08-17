package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        dog1.breed = "Hasky";
        dog1.name = "Spike";
        dog1.color = "Black";

        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dog2 = new Dog();
        dog2.breed = "Bulldog";
        dog2.name = "Robert";
        dog2.color = "White";

        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dog3 = new Dog();
        dog3.breed = "Labrador";
        dog3.name = "John";
        dog3.color = "Grey";

        // Call the methods 'bark()', 'run()', and 'play()' for each object
        dog1.bark();
        dog1.run();
        dog1.play();
        dog2.bark();
        dog2.run();
        dog2.play();
        dog3.bark();
        dog3.run();
        dog3.play();



    }
}
