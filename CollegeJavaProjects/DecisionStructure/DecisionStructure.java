/*
	This program calculates the volume of a circle.

	Shawn Witter

*/

import javax.swing.*;

public class DecisionStructure
{
	public static void main(String[] args)
	{
		String inputString;
		String name;
		double length;
		double width;
		double area;


		inputString = JOptionPane.showInputDialog("What is your name:\t");
		name = inputString;

		System.out.println("Hello, " + name + ".");

		inputString = JOptionPane.showInputDialog("What is the length of the rectangle:\t");
		length = Double.parseDouble(inputString);

		inputString = JOptionPane.showInputDialog("What is the width of the rectangle:\t");
		width = Double.parseDouble(inputString);

		area = length * width;

		if(length == width)
		{
			System.out.printf("This rectangle has an area of %.1f.", area);
			System.out.println("\nThis rectangle is actually a square because both sides are the same length.");
			JOptionPane.showMessageDialog(null, "This rectangle has an area of " + area + ".");
			JOptionPane.showMessageDialog(null, "\nThis rectangle is actually a square because both sides are the same length.");
		}
		else
		{
			System.out.printf("This rectangle has an area of %.1f.", area);
			System.out.println("\n");
			JOptionPane.showMessageDialog(null, "This rectangle has an area of " + area + ".");
		}
	}
}