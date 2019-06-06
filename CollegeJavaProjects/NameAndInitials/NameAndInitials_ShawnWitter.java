/**
* A brief description of the project
* 2/27/17
* CSC 151 Homework 1 - Name and Initials
* Shawn Witter
*/

import javax.swing.*;

public class NameAndInitials_ShawnWitter
{
	public static void main(String[] args)
	{
		//Variables
		String firstName = "Shawn";
		String middleName = "Lester";
		String lastName = "Witter";
		char firstInitial = 'S';
		char middleInitial = 'L';
		char lastInitial = 'W';

		//Print to window
		System.out.println(firstName + " " +  middleName + " " +  lastName);
		System.out.println(firstInitial + ". " + middleInitial + ". " + lastInitial + ". ");

		//Print out on TextBoxes
		JOptionPane.showMessageDialog(null, firstName + " " +  middleName + " " +  lastName);
		JOptionPane.showMessageDialog(null, firstInitial + " " +  middleInitial + " " +  lastInitial);

	}
}