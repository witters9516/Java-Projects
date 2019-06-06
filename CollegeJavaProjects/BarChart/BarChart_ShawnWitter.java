// Needed for keyboard input
import java.util.Scanner;

public class BarChart_ShawnWitter
{
	public static void main(String[] args)
	{
		String barChartTitle = "SALES BAR CHART";		// Line for bar chart
		String numStarsToDisplay = "*";					// Number of stars to display
		int store1Sales;								// Store 1's sales
		int store2Sales;								// Store 2's sales
		int store3Sales;								// Store 3's sales
		int store4Sales;								// Store 4's sales
		int store5Sales;								// Store 5's sales
		int storeSales = 0;								// Variable to use in the nested for loops

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the sales for store 1.
		System.out.printf("What are the sales for store 1:\t");
		store1Sales = keyboard.nextInt();

		// Get the sales for store 2.
		System.out.printf("What are the sales for store 2:\t");
		store2Sales = keyboard.nextInt();

		// Get the sales for store 3.
		System.out.printf("What are the sales for store 3:\t");
		store3Sales = keyboard.nextInt();

		// Get the sales for store 4.
		System.out.printf("What are the sales for store 4:\t");
		store4Sales = keyboard.nextInt();

		// Get the sales for store 5.
		System.out.printf("What are the sales for store 5:\t");
		store5Sales = keyboard.nextInt();

		// Display the bar chart heading.
		System.out.println(barChartTitle);

		for(int i = 0; i < 5; i++)
		{
			if(i == 0)
				storeSales = store1Sales;
			else if(i == 1)
				storeSales = store2Sales;
			else if(i == 2)
				storeSales = store3Sales;
			else if(i == 3)
				storeSales = store4Sales;
			else if(i == 4)
				storeSales = store5Sales;

			System.out.printf("\nStore " + (i+1) + " Sales: ");

			for(int j = 0; j < (storeSales/100); j++)
			{
				System.out.printf(numStarsToDisplay);
			}
		}

		System.out.println();
	}
}
