package org.eagle;

public class Main {
    public static void main(String[] args) {

        //Method Overloading Example:
        Calculator calculator = new Calculator();

        int addInt = calculator.add(3, 5);
        double addDouble = calculator.add(8.15, 5.25);

        System.out.println("addInt: " + addInt);
        System.out.println("addDouble: " + addDouble);


        //Method OverridingExample:
        Animal animal = new Dog();
        animal.loudlyGive();
    }
}