package com.mohamedkaba;

import java.util.Scanner;

public class MilesToKilometre {

    static final double ML2KL = 0.453592;

    public static void main(String[] args) {

	Scanner scan = new Scanner (System.in);
    double inputMiles = 0.0;
    double resultKilometre = 0.0;

        System.out.println("Miles To Kilogram");
        System.out.print("How many Pounds? ");
        resultKilometre = scan.nextDouble();

        resultKilometre =  inputMiles * ML2KL;

        System.out.print    ("Converted: " + resultKilometre + " kg" + " = ");
        System.out.println  (resultKilometre + " kilometre");






    }
}
