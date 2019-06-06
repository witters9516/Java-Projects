/*
Description: This program reads from one file and converts the text found to all caps. That information is then pasted to to another File.
Date: 3-27-17
Assignment: CSC 151 Homework 4 - Uppercase File Converter
Name: Shawn Witter
*/

//Needed for Creating Scanners
import java.util.Scanner;
//Needed for File reading and writing
import java.io.*;

public class Chp4_15_UppercaseFileConverter_ShawnWitter
{
	public static void main(String[] args) throws IOException
	{
		//Variables
		String readingFileName;		//variable to hold reading file
		String writingFileName;		//variable ot hold writing file
		String string_ToUpperCase;	//Variable string that will be changed and sent to writing file.

		//Create Scanner For Keyboard
		Scanner keyboard = new Scanner(System.in);

		//Ask for the names of two files(One for Reading and one for Writing)
		//Reading
		System.out.print("What is the name of the file you are reading from (Reading.txt):\t");
		readingFileName = keyboard.nextLine();
		//Writing
		System.out.print("What is the name of the file you are writing to (Writing.txt):\t");
		writingFileName = keyboard.nextLine();

		//Create new file to read from.
		File file = new File(readingFileName);
		//Create a new scanner for that file.
		Scanner inputFile = new Scanner(file);

		//Set up PrintWriter for the outputFile
		PrintWriter outputFile = new PrintWriter(writingFileName);

		//While loop(inputFile has more information)
		while(inputFile.hasNext())
		{
			//Reads first/next line of Reading.txt
			string_ToUpperCase = inputFile.nextLine();
			//Changes the casing to uppercasing.
			string_ToUpperCase = string_ToUpperCase.toUpperCase();
			//Writes that info to Writing.txt
			outputFile.println(string_ToUpperCase);
		}
		//Output telling user the data has been written to the file.
		System.out.println("The Data has been written to the file.");

		//inputFile.close();
		outputFile.close();

	}
}