//Create the person class
public class Payroll
{
	//Variables
	private String eName;		//Employee's name
	private int idNumber;		//ID Number
	private int hourlyPayRate;	//Hourly Pay Rate
	private int numHoursWorked;	//Number of Hours Worked

	//The no-arg constructor initializes an empty object.
	public Person()
	{
		eName = "";
		idNumber = "";
		hourlyPayRate = 0;
		numHoursWorked = 0;
	}
	//Th parameterized constructor accepts arguments for the objects fields.
		//@param myName	A person's name
		//@param myAddress	A person's address
		//@param myAge	A person's age
		//@param myPhone	A person's phone number

	public Person(String employeeName, String IDNumber, int PayRate, String numberHoursWorked)
	{
		eName = employeeName;
		idNumber = IDNumber;
		hourlyPayRate = PayRate;
		numHoursWorked = numberHoursWorked;
	}

	//The setName method sets the person's name
		//@param myName - the person's name
	public void setName(String myName)
	{
		name = myName;
	}
	//The setAddress method sets the person's address
		//@param myAddress - the person's address
	public void setAddress(String myAddress)
	{
		address = myAddress;
	}
	//The setAge method sets the person's age
		//@param myAge - the person's age
	public void setAge(int myAge)
	{
		age = myAge;
	}
	//The setPhone method sets the person's phone number
		//@param myPhone - the person's phone number
	public void setPhone(String myPhone)
	{
		phone = myPhone;
	}


	//The getName method returns the person's name
		//@Return the person's name
	public String getName()
	{
		return name;
	}
	//The getAddress method returns the person's address
		//@Return the person's address
	public String getAddress()
	{
		return address;
	}
	//The getAge method returns the person's age
		//@Return the person's age
	public int getAge()
	{
		return age;
	}
	//The getPhone method returns the person's phone number
		//@Return the person's phone
	public String getPhone()
	{
		return phone;
	}
}