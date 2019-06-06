/** Land Calculation
*	This program determines how many acres of land are in a specific tract of land.
*
*
*/

public class Chp2_06_ShawnWitter
{
	public static void main(String[] args)
	{
		//Variables for dertermining acre amount
		double acre = 43560;
		double tract_of_Land = 389767;

		//Calculate Acre amount.
		double how_Many_Acres = tract_of_Land / acre;

		//Display the answer to the screen.
		System.out.println("A tract of land stretching to 389,767 acres has " + how_Many_Acres + " acres.");

	}
}