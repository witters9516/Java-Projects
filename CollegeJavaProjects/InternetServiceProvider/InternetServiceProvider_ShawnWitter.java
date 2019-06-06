/**
* This program prompts the user to input either A, B, or C. A switch statement is then executed and calculated the total price of the bill(including the extra charges)
* and determines savings for if they had purchased the following packages.
* 2/27/17
* CSC 151 Tutorial 3 - Time Calculator Problem
* Shawn Witter
*/

import javax.swing.*;

public class InternetServiceProvider_ShawnWitter
{
	public static void main(String[] args)
	{
		//Variables
		String inputString;
		String purchased_package;
		double pricePerMonth;
		double hoursProvided;
		double extraHours;
		double totalHours;
		double extraHoursAddedPrice;
		double totalBill;
		double hoursUsed;
		//for Savings Calculations
		double pricePerMonthTemp;
		double hoursProvidedTemp;
		double extraHoursTemp;
		double totalSavings;

		//Input string and store into specific packages and hours.
		inputString = JOptionPane.showInputDialog("Enter the letter of your purchased package?");
		purchased_package = inputString;
		System.out.println(purchased_package);
		inputString = JOptionPane.showInputDialog("How many hours did you use this month?");
		hoursUsed = Double.parseDouble(inputString);

		//switch statement to operate based on what was entered.
		switch(purchased_package)
		{
			case "A":
			case "a":
				//Package A Variables
				pricePerMonth = 9.95;
				hoursProvided = 10;
				extraHours = 2.00;
				System.out.println(pricePerMonth);
				System.out.println(hoursProvided);
				System.out.println(extraHours);

				//Determine if there is an extra charge
				totalHours = hoursUsed - hoursProvided;
				if (totalHours <= 0)
				{
					//Calculate Bill
					extraHours = 0.0;
					totalBill = pricePerMonth + (extraHours * totalHours);
				}
				else
				{
					//Calculate Bill
					extraHoursAddedPrice = totalHours * extraHours;
					totalBill = pricePerMonth + extraHoursAddedPrice;
				}
				//Display TotalBill
				System.out.println(totalBill);
				JOptionPane.showMessageDialog(null, "Your total bill for this month is $" + totalBill + ".");

				//Calculate And Display Savings.
				//Temp Variable assignment for Package B
				pricePerMonthTemp = 13.95;
				hoursProvidedTemp = 20;
				extraHoursTemp = 1.00;

				totalSavings = (pricePerMonthTemp - pricePerMonth) + ((hoursProvidedTemp - hoursProvided) * extraHoursTemp) - totalBill;
				System.out.printf("You would save $%.2f if you had purchased Package B.\n", totalSavings * -1);
				JOptionPane.showMessageDialog(null, String.format("You would save $%,.2f if you had purchased Package C.\n", totalSavings * -1));

				//Temp Variable assignment for Package C
				pricePerMonthTemp = 19.95;
				hoursProvidedTemp = 0;
				extraHoursTemp = 0.00;

				totalSavings = (pricePerMonthTemp - pricePerMonth) + ((hoursProvidedTemp - hoursProvided) * extraHoursTemp) - totalBill;
				System.out.printf("You would save $%.2f if you had purchased Package C.\n", totalSavings * -1);
				JOptionPane.showMessageDialog(null, String.format("You would save $%,.2f if you had purchased Package C.\n", totalSavings * -1));
				break;

			case "B":
			case "b":
				//Package B Variables
				pricePerMonth = 13.95;
				hoursProvided = 20;
				extraHours = 1.00;

				//Determine if there is an extra charge
				totalHours = hoursUsed - hoursProvided;
				if (totalHours <= 0)
				{
					//Calculate Bill
					extraHours = 0.0;
					totalBill = pricePerMonth + (extraHours * totalHours);
				}
				else
				{
					//Calculate Bill
					extraHoursAddedPrice = totalHours * extraHours;
					totalBill = pricePerMonth + extraHoursAddedPrice;
				}
				//Display TotalBill
				System.out.println(totalBill);
				JOptionPane.showMessageDialog(null, "Your total bill for this month is $" + totalBill + ".");

				//Calculate And Display Savings.
				//Temp Variable assignment for Package B
				pricePerMonthTemp = 19.95;
				hoursProvidedTemp = 0;
				extraHoursTemp = 0.00;

				totalSavings = (pricePerMonthTemp - pricePerMonth) + ((hoursProvidedTemp - hoursProvided) * extraHoursTemp) - totalBill;
				System.out.printf("You would save $%.2f if you had purchased Package C.\n", totalSavings * -1);
				break;

			case "C":
			case "c":
				//Package C Variables
				pricePerMonth = 19.95;
				hoursProvided = 0;
				extraHours = 0.00;

				//Determine if there is an extra charge
				totalHours = hoursUsed - hoursProvided;
				if (totalHours <= 0)
				{
					//Calculate Bill
					extraHours = 0.0;
					totalBill = pricePerMonth + (extraHours * totalHours);
				}
				else
				{
					//Calculate Bill
					extraHoursAddedPrice = totalHours * extraHours;
					totalBill = pricePerMonth + extraHoursAddedPrice;
				}
				//Display TotalBill
				System.out.println(totalBill);
				JOptionPane.showMessageDialog(null, "Your total bill for this month is $" + totalBill + ".");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Invalid Choice!");
				break;
		}
	}
}