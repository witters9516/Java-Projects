// Needed for keyboard input
import java.util.Scanner;

public class LargestAndSmallest_ShawnWitter
{
	public static void main(String[] args)
	{
		//(Remember -99)
		int EXIT_NUMBER = -99;
		// A number
		int inputNumber;
		// Largest number
		int largestNumber;
		// Smallest number
		int smallestNumber;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the first number.
		System.out.printf("What is the first number:\t");
		inputNumber = keyboard.nextInt();
		largestNumber = inputNumber;
			// ~~ Since this is the only number we have,~~
		smallestNumber = inputNumber;
			// ~~ it is the both the largest and the smallest... so far.~~

		if(inputNumber == EXIT_NUMBER)
		{
			System.out.print("You did not enter any numbers other than -99.\n");
		}
		else
		{
			// Get the rest of the numbers.~(While Loop)
			while(inputNumber != EXIT_NUMBER)
			{
				// Ask for another number.
				System.out.printf("Type '-99' to exit.\nWhat is the next number:\t");
				inputNumber = keyboard.nextInt();
				if(inputNumber != EXIT_NUMBER)
				{
					// Determine whether this is now the largest.~(If)
					if (inputNumber > largestNumber)
					{
						largestNumber = inputNumber;
					}
					// Determine whether this is now the smallest.~(If)
					if (inputNumber < smallestNumber)
					{
						smallestNumber = inputNumber;
					}
				}
			}
			// Display the largest and smallest numbers.~(If Else)
			System.out.printf("The Smallest number is %d.\nThe Largest number is %d.\n", smallestNumber, largestNumber);
		}

	}
}
