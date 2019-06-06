/**
* This program creates 3 instances of the person class and gets and sets the values of those instances.
* These values are displayed to the screen.
* 4/24/17
* CSC 151 Tutorial 6 - Personal Information Class Problem
* Shawn Witter
*/

public class PersonalInformation_ShawnWitter
{
	public static void main(String[] args)
	{
		//Create the Objects
		Person me = new Person();
		Person myFriend1 = new Person();
		Person myFriend2 = new Person();

		//Set my info
		me.setName("Shawn Witter");
		me.setAddress("724 22nd Street");
		me.setAge(22);
		me.setPhone("(555)-555-5555");

		//Set Friend 1's info
		myFriend1.setName("Ashley Scott");
		myFriend1.setAddress("123 45th Street");
		myFriend1.setAge(22);
		myFriend1.setPhone("(910)-555-4321");

		//Set Friend 2's info
		myFriend2.setName("Nick Keffer");
		myFriend2.setAddress("943 99th Street");
		myFriend2.setAge(24);
		myFriend2.setPhone("(431)-555-7812");

		//Display my info
		System.out.println("My Information:");
		System.out.println("Name: " + me.getName());
		System.out.println("Age: " + me.getAge());
		System.out.println("Address: " + me.getAddress());
		System.out.println("Phone: " + me.getPhone());

		//Display Friend 1 info
		System.out.println("Friend 1 Information:");
		System.out.println("Name: " + myFriend1.getName());
		System.out.println("Age: " + myFriend1.getAge());
		System.out.println("Address: " + myFriend1.getAddress());
		System.out.println("Phone: " + myFriend1.getPhone());

		//Display Friend 2 info
		System.out.println("Friend 2 Information:");
		System.out.println("Name: " + myFriend2.getName());
		System.out.println("Age: " + myFriend2.getAge());
		System.out.println("Address: " + myFriend2.getAddress());
		System.out.println("Phone: " + myFriend2.getPhone());
	}
}