/**
* This program prompts the user to input either A, B, or C. A switch statement is then executed and calculated the total price of the bill(including the extra charges)
* and determines savings for if they had purchased the following packages.
* 2/27/17
* CSC 151 Tutorial 3 - Time Calculator Problem
* Shawn Witter
*/
import java.util.Scanner;

public class DistanceTraveled_ShawnWitter
{
	public static void main(String[] args)
	{
		//Create Scanner.
		Scanner keyboard = new Scanner(System.in);

		//Variables
		int speed; //User input for loop
		int hours;	//To hold a number the series starts at 1.
		int distance;	//Accumulator
		int period = 1;

			//Ask the user to input a number greater than 0.
			System.out.println("Please enter the speed:");
			//Input
			speed = keyboard.nextInt();
			while(speed <= 0)
			{
				System.out.println("Please enter a value of 1 or greater for speed:");
				speed = keyboard.nextInt();

			}
			//Ask the user to input a number greater than 0.
			System.out.println("Please enter the number of hours traveled:");
			//Input
			hours = keyboard.nextInt();
			while(hours <= 0)
			{
				System.out.println("Please enter a value of 1 or greater for hours:");
				hours = keyboard.nextInt();

			}


			System.out.println("Hours\t\t\tDistance Traveled");
			System.out.println("------------------------------------");
			while(period <= hours)
			{
				distance = speed * period;
				System.out.println(period + "\t\t\t" + distance);
				period++;

			}
	}	//End of Main()
}	//End of Class