/**
* A brief description of the project
* 2/27/17
* CSC 151 Tutorial 3 - Time Calculator Problem
* Shawn Witter
*/

import javax.swing.*;

public class TimeCalculator_ShawnWitter
{
	public static void main(String[] args)
	{
		//Variables
		String inputString;
		double seconds;
		double minutes;
		double hours;
		double days;

		//Input string and store into quantity as int and bill as a double.
		inputString = JOptionPane.showInputDialog("Enter any number of seconds?");
		seconds = Double.parseDouble(inputString);

		//Determine Discount and Calculate total; then displays to screen.
		if(seconds >= 60)
		{
			minutes = seconds / 60;


			System.out.printf("%.2f minutes is equal to %.0f seconds.\n", minutes, seconds);
			JOptionPane.showMessageDialog(null, minutes + " minutes is equal to " + seconds + " seconds.\n");
		}
		else if(seconds > 3600)
		{
			hours = seconds / 3600;


			System.out.printf("%.2f hours is equal to %.0f seconds.\n", hours, seconds);
			JOptionPane.showMessageDialog(null, hours + " minutes is equal to " + seconds + " seconds.\n");
		}
		else if(seconds >= 86400)
		{
			days = seconds / 86400;


			System.out.printf("%.2f days is equal to %.0f seconds.\n", days, seconds);
			JOptionPane.showMessageDialog(null, days + " minutes is equal to " + seconds + " seconds.\n");
		}
		else
		{
			System.out.println("There is no equivalent to this amount of seconds.");
			JOptionPane.showMessageDialog(null, "There is no equivalent to this amount of seconds.");
		}

	}
}