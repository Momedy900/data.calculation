package com.mohamedkaba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Name - Mohamed Kaba
        // Student ID - T00690092
        // Purpose of Program - Calculation in Java
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter two values");

        Float valueA, valueB = 0.0f;
        System.out.print("Value A: ");
        valueA = scan.nextFloat();
        System.out.print("Value B: ");
        valueB = scan.nextFloat();

        Float sum = valueA + valueB;
        Float difference = valueA - valueB;
        Float multiplication = valueA * valueB;
        Float quotient = valueA / valueB;
        Float remainder = valueA % valueB;

        System.out.println("Calculation for " + valueA + " and " + valueB);
        System.out.println("\t" + valueA + " + " + valueB + " = " + sum);
        System.out.println("\t" + valueA + " - " + valueB + " = " + difference);
        System.out.println("\t" + valueA + " * " + valueB + " = " + multiplication);
        System.out.println("\t" + valueA + " / " + valueB + " = " + quotient);
        System.out.println("\t" + valueA + " % " + valueB + " = " + remainder);
    }
}
