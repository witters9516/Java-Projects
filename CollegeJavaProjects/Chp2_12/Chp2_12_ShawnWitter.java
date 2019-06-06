/** String Manipulator
*	This program prints out a city name that the user input in the following ways:
*		- Number of characters
*		- Uppercase
*		- Lowercase
*		- First letter
*/

import java.util.Scanner;
public class Chp2_12_ShawnWitter
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		//input city
		System.out.print("What is your favorite city? ");
		String city = keyboard.nextLine();

		//Variables that will change the string to each required form.
		int city_length = city.length();
		String city_Upper = city.toUpperCase();
		String city_Lower = city.toLowerCase();
		char city_FirstLetter = city.charAt(0);

		//Display the forms of the string to the screen.
		System.out.println(city_length);
		System.out.println(city_Upper);
		System.out.println(city_Lower);
		System.out.println(city_FirstLetter);

	}
}