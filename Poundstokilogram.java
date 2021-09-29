package com.mohamedkaba;

import java.util.Scanner;

public class Poundstokilogram {

    static final double ML2KL = 0.453592;

    public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    double inputPounds = 0.0;
    double resultKilogram = 0.0;

        System.out.println("Miles To Kilogram");
        System.out.print("How many Pounds? ");
        resultKilogram = scan.nextDouble();

        resultKilogram =  inputPounds * ML2KL;

        System.out.print    ("Converted: " + resultKilogram + " kg" + " = ");
        System.out.println  (resultKilogram + " kilogram");






    }
}
