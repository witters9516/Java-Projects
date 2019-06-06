/*
	This program calculates the volume of a circle.

	Shawn Witter

*/

import java.util.Scanner;

public class Witters_Chp2_19_StockTransactionProgram
{
	public static void main(String[] args)
	{
		//initialize Scanner for input
		Scanner keyboard = new Scanner(System.in);
		//Variables
		int shares = 1000;
		double priceOfShare = 32.87;
		double commission = .02;
		double soldSharePrice = 33.92;
		double amountPaid = priceOfShare * shares;
		double commissionGivenToBroker1 = amountPaid * commission;
		double amountSold = soldSharePrice * shares;
		double commissionGivenToBroker2 = amountSold * commission;
		double profit = (amountSold - commissionGivenToBroker2) - (amountPaid + commissionGivenToBroker1);


		//Input string and store into quantity as int and bill as a double.
		System.out.printf("Joe bought %d shares for $%.2f.\n", shares, amountPaid);
		System.out.printf("Joe paid his broker his commission of $%.2f.\n", commissionGivenToBroker1);
		System.out.printf("Joe sold the shares for $%.2f.\n", amountSold);
		System.out.printf("Joe paid his broker his commission of $%.2f.\n", commissionGivenToBroker2);
		System.out.printf("Joe lost a profit of $%.2f.\n", profit);
	}
}