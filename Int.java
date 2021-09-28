package com.mohamedkaba;

import java.util.Scanner;

public class Int {
    public static void main(String[] args) {
        // Name - Mohamed Kaba
        // Student ID - T00690092
        // Purpose of Program - Calculation in Java
        // I did encounter some precision errors
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter two values");

        int valueA, valueB = 0;
        System.out.print("Value A: ");
        valueA = scan.nextInt();
        System.out.print("Value B: ");
        valueB = scan.nextInt();

        int sum = valueA + valueB;
        int difference = valueA - valueB;
        int multiplication = valueA * valueB;
        int quotient = valueA / valueB;
        int remainder = valueA % valueB;

        System.out.println("Calculation for " + valueA + " and " + valueB);
        System.out.println("\t" + valueA + " + " + valueB + " = " + sum);
        System.out.println("\t" + valueA + " - " + valueB + " = " + difference);
        System.out.println("\t" + valueA + " * " + valueB + " = " + multiplication);
        System.out.println("\t" + valueA + " / " + valueB + " = " + quotient);
        System.out.println("\t" + valueA + " % " + valueB + " = " + remainder);
    }
}
