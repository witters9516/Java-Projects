/**
* This program prompts the user to input either A, B, or C. A switch statement is then executed and calculated the total price of the bill(including the extra charges)
* and determines savings for if they had purchased the following packages.
* 2/27/17
* CSC 151 Tutorial 3 - Time Calculator Problem
* Shawn Witter
*/
import java.util.Scanner;

public class SumOfNumbers_ShawnWitter
{
	public static void main(String[] args)
	{
		//Create Scanner.
		Scanner keyboard = new Scanner(System.in);

		//Variables
		int maxNumber = -1; //User input for loop
		int minNumber = 1;	//To hold a number the series starts at 1.
		int totalSum = 0;	//Accumulator

		while(maxNumber < 1)
		{
			//Ask the user to input a number greater than 0.
			System.out.println("Please enter a number above zero:");
			//Input
			maxNumber = keyboard.nextInt();

			//Check For number less than 1
			if(maxNumber <= 0)
			{
				//Error Message
				System.out.println("Invalid Entry! The number must be higher than zero!");
			}
			else
			{
				while(minNumber <= maxNumber)
				{
					totalSum += minNumber;
					minNumber++;
				}
				/*
				//For loop that keeps the running total.
				for(int i = 0; i < maxNumber ; i++)
				{
					totalSum += minNumber;
					minNumber++;
				}
				*/
				//Print out TotalSum
				System.out.println("The sum of all of the numbers is " + totalSum + ".");
			}
		}	//End of while
	}	//End of Main()
}	//End of Class