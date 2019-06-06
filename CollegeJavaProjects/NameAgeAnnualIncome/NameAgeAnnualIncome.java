
//Needed for using input scanners!
import java.util.Scanner;

public class NameAgeAnnualIncome
{
	public static void main(String[] args)
	{
		//Variables
		//Name
		String name;
		//Age
		int age;
		//Annual Pay
		double annualPay;

		//initialize Scanner for input
		Scanner keyboard = new Scanner(System.in);
		//Ask for name input and input.
		System.out.print("Enter your name:\t");
		name = keyboard.nextLine();
		//Ask for age input and input.
		System.out.print("Enter your age:\t");
		age = keyboard.nextInt();
		//Ask for annual pay input and input.
		System.out.print("Enter your annual income:\t");
		annualPay = keyboard.nextDouble();

		//Output Sentence results.
		System.out.println("My name is " + name +
			", my age is " + age +
			" and I hope to earn $" +
			annualPay + " per year.");

	}
}