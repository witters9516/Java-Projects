/*
	This program calculates the area of a trapezoid.

	Shawn Witter

*/

import java.util.Scanner;
public class AreaOfACircle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//Area of a trapezoid = ((aBase+bBase)/2) * height

		//Get input for aBase
		System.out.print("Please enter the base of a:\t");
		double aBase = keyboard.nextDouble();

		//Get input for bBase
		System.out.print("Please enter the base of b:\t");
		double bBase = keyboard.nextDouble();

		//Get input for height
		System.out.print("Please enter the height:\t");
		double height = keyboard.nextDouble();

		//Calculate area and display answer to the screen.
		double area = ((aBase + bBase) / 2) * height;
		System.out.println("The area of this trapezoid is " + area + ".");
	}
}