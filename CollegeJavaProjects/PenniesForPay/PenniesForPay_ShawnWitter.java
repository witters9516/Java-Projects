/**
* This program prompts the user to input a number that is greater than 0.(An error will be thrown otherwise.) A nested loop will then calculate the number of days and how much the user will earn that day
* While also keeping a running total. In the end it will print out the total.
* 3/13/17
* CSC 151 Tutorial 4 - PennysForPay
* Shawn Witter
*/

import javax.swing.*;
import java.util.Scanner;

public class PenniesForPay_ShawnWitter
{
	public static void main(String[] args)
	{
		double MULTIPLIER = 2;


		//Variables
		String inputString;
		double days_In_Period = -1;
		double salary_for_day = .01;
		double total_Salary_For_Period = 0.0;


		//Create Scanner
		Scanner keyboard = new Scanner(System.in);

		//Nested While loop
		while(days_In_Period < 1)
		{
			//Ask for input
			System.out.println("Enter the the number of days until the end of the period?");
			days_In_Period = keyboard.nextDouble();

			//If input is less than 1, an error message is thrown and the loop will repeat
			if(days_In_Period < 1)
			{
				System.out.println("You must enter a number that is greater than 1! Please try again.\n");
				days_In_Period = -1;
			}
			else
			{
				//Calculates the salary each day.
				for (int i = 0; i < days_In_Period; i++)
				{
					if (i == 0)
					{
						total_Salary_For_Period += salary_for_day;
						System.out.printf("Day " + (i+1) + "\t$%.2f\n", salary_for_day);
					}
					else if (i > 0)
					{
						salary_for_day *= MULTIPLIER;
						total_Salary_For_Period += salary_for_day;
						System.out.printf("Day " + (i+1) + "\t$%.2f\n", salary_for_day);

					}
					//Displays the total after the loop is finished.
					if(i == (days_In_Period - 1))
					{
						System.out.printf("After " + (i+1) + " days, you have made $%.2f.\n", total_Salary_For_Period);
					}
				}
			}
		}
	}
}