/*
	This program calculates shipping charges.

	Shawn Witter

*/

import javax.swing.*;

public class ShippingCharges
{
	public static void main(String[] args)
	{
		//variables
		String inputString;
		double pounds;
		double twoOrLess = 1.10;
		double between2Or6 = 2.20;
		double between6Or10 = 3.70;
		double over10 = 3.80;

		//input weight into dialog box and format to string.
		inputString = JOptionPane.showInputDialog("How heavy is your package(in pounds)?");
		pounds = Double.parseDouble(inputString);

		//Dtermine how much the shipping charge is and displays it.
		if(pounds <= 2)
		{
			System.out.println("You must pay an additional $" + twoOrLess + " to ship this package.");
			JOptionPane.showMessageDialog(null, "You must pay an additional $" + twoOrLess + " to ship this package.");
		}
		else if(pounds > 2 && pounds < 6)
		{
			System.out.println("You must pay an additional $" + between2Or6 + " to ship this package.");
			JOptionPane.showMessageDialog(null, "You must pay an additional $" + between2Or6 + " to ship this package.");
		}
		else if(pounds > 6 && pounds < 10)
		{
			System.out.println("You must pay an additional $" + between6Or10 + " to ship this package.");
			JOptionPane.showMessageDialog(null, "You must pay an additional $" + between6Or10 + " to ship this package.");
		}
		else
		{
			System.out.println("You must pay an additional $" + over10 + " to ship this package.");
			JOptionPane.showMessageDialog(null, "You must pay an additional $" + over10 + " to ship this package.");
		}
		//System exit.
		System.exit(0);
	}
}