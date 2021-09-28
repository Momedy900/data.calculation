package com.mohamedkaba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Name - Mohamed Kaba
        // Student ID - T00690092
        // Purpose of Program - Calculation in Java
        // I did encounter some precision errors
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter two values");

        float valueA, valueB = 0;
        System.out.print("Value A: ");
        valueA = scan.nextFloat();
        System.out.print("Value B: ");
        valueB = scan.nextFloat();

        float sum = valueA + valueB;
        float difference = valueA - valueB;
        float multiplication = valueA * valueB;
        float quotient = valueA / valueB;
        float remainder = valueA % valueB;

        System.out.println("Calculation for " + valueA + " and " + valueB);
        System.out.println("\t" + valueA + " + " + valueB + " = " + sum);
        System.out.println("\t" + valueA + " - " + valueB + " = " + difference);
        System.out.println("\t" + valueA + " * " + valueB + " = " + multiplication);
        System.out.println("\t" + valueA + " / " + valueB + " = " + quotient);
        System.out.println("\t" + valueA + " % " + valueB + " = " + remainder);
    }
}
