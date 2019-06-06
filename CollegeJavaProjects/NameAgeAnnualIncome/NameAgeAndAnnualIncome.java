/** Area of a Trapezoid
*
*
*
*/

import java.util.Scanner;
public class NameAgeAndAnnualIncome
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.println("What is your name, age, and annual income?");

		System.out.print("What is your name? ");
		String name = keyboard.nextLine();

		System.out.print("What is your age? ");
		int age = keyboard.nextInt();

		System.out.print("What is your annual income? ");
		double annualIncome = keyboard.nextDouble();

		System.out.println("My name is " + name + ", my age is " + age + " and I hope to earn $" + annualIncome + " this year.");
	}
}