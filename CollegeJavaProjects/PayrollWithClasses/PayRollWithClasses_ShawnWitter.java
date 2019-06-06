/**
* This program creates 3 instances of the person class and gets and sets the values of those instances.
* These values are displayed to the screen.
* 4/24/17
* CSC 151 Tutorial 6 - Personal Information Class Problem
* Shawn Witter
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PayRollWithClasses_ShawnWitter
{
	public static void main(String[] args)
	{
		String input;
		String inputName;	//Holds Employee name
		int inputID;		//Holds Employee ID
		float inputHPR;		//Holds Hourly Pay Rate
		float inputNHW;		//Holds Number hours Worked
		float outputGrossPay;	//Holds Gross Pay(Calculated)

		//Create Scanner
		Scanner keyboard = new Scanner(System.in);

		//Create the Objects
		PayrollClass employee1 = new PayrollClass();

		//Ask for input for each field in Employee1
		//eName
		input = JOptionPane.showInputDialog("What is the name of this employee?");
		inputName = input;

		//idNumber
		input = JOptionPane.showInputDialog("What is the ID number for this employee?");
		inputID = Integer.parseInt(input);

		//hourlyPayRate
		input = JOptionPane.showInputDialog("What is the Hourly Pay Rate for this employee?");
		inputHPR = Float.parseFloat(input);

		//numHoursWorked
		input = JOptionPane.showInputDialog("What is the Number of Hours Worked for this employee?");
		inputNHW = Float.parseFloat(input);


		//Set Employee1 info
		employee1.setEName(inputName);
		employee1.setIDNumber(inputID);
		employee1.setPayRate(inputHPR);
		employee1.setNumHoursWorked(inputNHW);
		outputGrossPay = employee1.getGrossPay(inputHPR, inputNHW);


		//Display Employee1 info
			//System.out.println("Employee1 Information:");
			//System.out.println("Employee Name: " + employee1.getEName());
			//System.out.println("ID Number: " + employee1.getIDNumber());
			//System.out.println("Hourly Pay Rate: " + employee1.getPayRate());
			//System.out.println("Number Hours Worked: " + employee1.getNumHoursWorked());
			//System.out.printf("\nGross Pay: $%.2f.\n", outputGrossPay);
		JOptionPane.showMessageDialog(null, "Employee Name: " + employee1.getEName() + "\n" +
		"ID Number: " + employee1.getIDNumber() + "\n" +
		"Hourly Pay Rate: " + employee1.getPayRate()  + "\n" +
		"Number Hours Worked: " + employee1.getNumHoursWorked()  + "\n" +
		"\nGross Pay: $%.2f.\n", outputGrossPay);
	}
}