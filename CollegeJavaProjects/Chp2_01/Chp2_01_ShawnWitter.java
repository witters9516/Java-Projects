/** Name, Age, and Annual Income
*
*
*
*/

import java.util.Scanner;
public class Chp2_01_ShawnWitter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.println("What is your name, age, and annual income?");

		//Input name
		System.out.print("What is your name? ");
		String name = keyboard.nextLine();

		//Input Age
		System.out.print("What is your age? ");
		int age = keyboard.nextInt();

		//Input Annual Income
		System.out.print("What is your annual income? ");
		double annualIncome = keyboard.nextDouble();

		//Display string to the screen.
		System.out.println("My name is " + name +
		", my age is " + age + " and \nI hope to earn $" +
		annualIncome + " this year.");
	}
}