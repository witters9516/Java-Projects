/*
	This program calculates the volume of a circle.

	Shawn Witter

*/

import java.util.Scanner;

public class VolumeOfACircle
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		//Volume of a circle = (4/3) * Math.PI
		//Get input for raduis of sphere
		System.out.print("Please enter the radius of the sphere:\t");
		double radius = keyboard.nextDouble();

		//Calculate volume and display answer to the screen.
		double volume = (4.0f/3.0f) * Math.PI * (Math.pow(radius, 3.0));
		System.out.printf("The Volume of this Sphere is %.2f.", volume);
		System.out.println("\n\n");
	}
}