/*
	This program calculates the volume of a circle.

	Shawn Witter

*/

import java.util.Scanner;

public class Witters_Chp2_9_MilesPerGallon
{
	public static void main(String[] args)
	{
		//initialize Scanner for input
		Scanner keyboard = new Scanner(System.in);
		//Variables
		String inputString;
		double milesDriven;			//Miles Driven
		double gallonsOfGasUsed;	//Gallons Used
		double MPG;					//Miles-Per-Gallon

		//Input string and store into quantity as int and bill as a double.
		System.out.print("How many miles did you drive? ");
		milesDriven = keyboard.nextDouble();
		System.out.print("How many gallons of gas did you use? ");
		gallonsOfGasUsed = keyboard.nextDouble();
		MPG = milesDriven / gallonsOfGasUsed;

		System.out.printf("Your current MPG is %.2f.\n", MPG);

	}
}