package GallonsToLitres;
//Name - Mohamed Kaba
// Student ID - T00690092 
import java.util.Scanner;

public class gallonstolitres {
static final double GAL2LT = 3.78541;
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		double inputGallons = 0.0;
		double resultlitres = 0.0;
		
		System.out.println ("Gallons to Litres converter");
		System.out.print ("How many gallons");
		inputGallons = scan.nextDouble();
		
		resultlitres = inputGallons * GAL2LT;
		
		System.out.print ("convertered: " + inputGallons + " Gal" + "=");
		System.out.println (resultlitres +"litre");
		
		
				
		

	}

}
