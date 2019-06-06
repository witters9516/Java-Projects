/** Cookie Colories
*	This program Calculates how much cookies the user has eaten and determines how many calories they consumed.
*
*
*/

import java.util.Scanner;
public class Chp2_08_ShawnWitter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		double bag_of_Cookies = 40;
		double cookies_per_serving = 4;
		double colories_Per_Serving = 300;

		System.out.println("Calculating Miles per Gallon.");

		//Input Cookies eaten
		System.out.println("How many cookies did you eat? ");
		int cookies_Eaten = keyboard.nextInt();

		//Calculate the amount of calories consumed
		double calories_Consumed = (cookies_Eaten * (colories_Per_Serving / cookies_per_serving));

		//Display cookies eaten and calories consumed.
		System.out.println("You consumed " + cookies_Eaten + " cookie(s) which contains " + calories_Consumed + " calories.");
	}
}