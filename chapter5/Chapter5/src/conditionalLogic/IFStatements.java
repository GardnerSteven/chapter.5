package conditionalLogic;

import java.util.Scanner;

public class IFStatements 
{

	public static void main(String[] args) 
	{
		int age; //
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age? >>>>>");
		age = input.nextInt();
		if(age <= 18)
		{
				System.out.println("User is less than 18.");
		}
		if(age >= 23 & age <= 30)
		{
			System.out.println("User is 23 or older, and 30 or younger");
		}
		if(age >= 31 & age <= 50)
		{
			System.out.println("User is 31 or older, and 50 or younger");
		}
		if(age >= 50 & age <= 65)
		{
			System.out.println("User is 50 or older, and 65 or younger");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("User is 66 or older, and 100 or younger");
		}
		
		
		
	}
}
