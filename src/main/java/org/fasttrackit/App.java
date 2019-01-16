package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Calculations calculations = new Calculations();
        System.out.println("add: " + calculations.add(2.54, 1.31));
        System.out.println("substract: " + calculations.substract(7.64, 4.38));
        System.out.println("multiply: " + calculations.multiply(2.75, 3.97));

        System.out.println("add: " + calculations.add(32, 13));
        System.out.println("substract: " + calculations.substract(45, 12));
        System.out.println("multiply: " + calculations.multiply(21, 48));
    }
}
