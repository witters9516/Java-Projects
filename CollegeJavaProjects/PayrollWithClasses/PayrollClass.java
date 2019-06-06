//Create the person class
public class PayrollClass
{
	//Variables
	private String eName;		//Employee's name
	private int idNumber;		//ID Number
	private float hourlyPayRate;	//Hourly Pay Rate
	private float numHoursWorked;	//Number of Hours Worked

	//The no-arg constructor initializes an empty object.
	public PayrollClass()
	{
		eName = "";
		idNumber = 0;
	}
	//Th parameterized constructor accepts arguments for the objects fields.
		//@param myName	A person's name
		//@param myAddress	A person's IDnumber
	public PayrollClass(String employeeName, int IDNumber)
	{
		eName = employeeName;
		idNumber = IDNumber;
	}

	//The setName method sets the person's name
		//@param eName - the person's name
	public void setEName(String employeeName)
	{
		eName = employeeName;
	}
	//The setAddress method sets the person's address
		//@param idNumber - the person's ID Number
	public void setIDNumber(int IDNumber)
	{
		idNumber = IDNumber;
	}
	//The setAge method sets the person's PayRate
		//@param hourlyPayRate - the person's Payrate
	public void setPayRate(float PayRate)
	{
		hourlyPayRate = PayRate;
	}
	//The setPhone method sets the person's phone number
		//@param myPhone - the person's phone number
	public void setNumHoursWorked(float numberHoursWorked)
	{
		numHoursWorked = numberHoursWorked;
	}

	//The getName method returns the person's name
		//@Return the person's name
	public String getEName()
	{
		return eName;
	}
	//The getAddress method returns the person's IDNumber
		//@Return the person's IDNumber
	public int getIDNumber()
	{
		return idNumber;
	}
	//The getAge method returns the person's PayRate
		//@Return the person's PayRate
	public float getPayRate()
	{
		return hourlyPayRate;
	}
	//The getPhone method returns the person's Number of Hours Worked
		//@Return the person's Number of Hours Worked.
	public float getNumHoursWorked()
	{
		return numHoursWorked;
	}

	//The getGrossPay method returns the person's gross pay.
		//@return the person's gross pay
	public float getGrossPay(float hourlyPayRate, float numHoursWorked)
	{
		return numHoursWorked * hourlyPayRate;
	}
}