/** Area of a Trapezoid
*
*
*
*/

import java.util.Scanner;
public class AreaTrapezoidErr
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);

		System.out.println("You want to calculate the area of a trapezoid?");

		System.out.print("How long is the top edge of the trapezoid? ");
		double top = keyboard.nextDouble();

		System.out.print("How long is the bottom edge of the trapezoid? ");
		double bottom = keyboard.nextDouble();

		System.out.print("How tall is the trapezoid? ");
		double height = keyboard.nextDouble();

		double trapezoid = ((top + bottom)/2) * height;
		System.out.println("The area of the trapezoid is " + trapezoid + ".");
	}
}