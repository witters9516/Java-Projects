/*
Description: This program calculates the retail price of an item and displays it to the user.
Date: 4-7-17
Assignment: CSC 151 Tutorial 5 - RetailPrice Calculator
Name: Shawn Witter
*/

//Needed for Creating Scanners
import java.util.Scanner;
//Needed for File reading and writing
import java.text.DecimalFormat;

public class RetailPriceCalculator_ShawnWitter
{
	public static void main(String[] args)
	{
		//Variables
		double wholesaleCost;
		double markupPct;
		double retailPrice;

		//Create Scanner for keyboard input
		Scanner keyboard = new Scanner(System.in);

		//Ask for the cost of an item and set it to wholesaleCost
		System.out.println("What is the whole sale cost of the item?");
		wholesaleCost = keyboard.nextDouble();

		//Ask for markepPct and set it to markupPct
		System.out.println("What is the markup percentage of the item?");
		System.out.println("(Enter 50 for 50%)");
		markupPct = keyboard.nextDouble();

		//set markupPct to markupPct/100.0
		markupPct /= 100.0;

		//Call calculateRetail to get retailPrice.
		retailPrice = calculateRetail(wholesaleCost, markupPct);

		//Create a DollarFormat object named dollar.
		DecimalFormat dollar = new DecimalFormat("#.00");

		//Print out results to the screen.
		System.out.println("The retail price of the item is $" + dollar.format(retailPrice));

	}

	//calculateRetail method
	public static double calculateRetail(double wholesale, double markup)
	{
		double retail = wholesale +(wholesale * markup);
		return retail;
	}
}



