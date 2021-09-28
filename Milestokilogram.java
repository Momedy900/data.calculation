package com.mohamedkaba;

import java.util.Scanner;

public class Milestokilogram {

    static final double ML2KL = 1.60935;

    public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    double inputMiles = 0.0;
    double resultKilogram = 0.0;

        System.out.println("Miles To Kilogram");
        System.out.print("How many litres? ");
        inputMiles = scan.nextDouble();

        resultKilogram =  inputMiles * ML2KL;

        System.out.print    ("Converted: " + inputMiles + " kg" + " = ");
        System.out.println  (resultKilogram + " kilogram");






    }
}
