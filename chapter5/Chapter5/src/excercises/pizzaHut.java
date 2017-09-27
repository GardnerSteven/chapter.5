package excercises;

import java.util.Scanner;

public class pizzaHut 
{
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) 
	{

		String choiceYes;
		String toppingsChoice;
		String size;
		String pizzaKind;
		String choiceHotDog;
		double mediumCost;
		double large;
		double smallCost;
		
		System.out.print("Would you like a pizza? Yes or No?>>>>>>");
		choiceYes = input.nextLine();
		
		if("Yes".equals(choiceYes)|| "yes".equals(choiceYes)||"Y".equals(choiceYes)||"y".equals(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
				System.out.print("Please choose a size small, medium or large? >>>>>>");
				size = input.nextLine();
				if("small".equalsIgnoreCase(size)||"medium".equalsIgnoreCase(size)|| "large".equalsIgnoreCase(size))
				{
				if("medium".equals(size)|| "Medium".equals(size))
				{
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
				}
				if("large".equals(size)|| "Large".equals(size))
				{
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
				}
				if("small".equals(size)|| "Small".equals(size))
					displayPizzaSize(size);
					displayPizzaType();
					displayPrice(size);
		}
	}		
	else
		displayHotDog();

	}
	public static void displayPizzaSize(String size)
{
	System.out.println("You said" + size + "pizza size.");
}
	public static void displayPizzaType()
	{			
			System.out.print("What kind of Pizza do you want? Peperoni, Sausage, Cheese?");
			String pizzaKind = input.nextLine();	
			System.out.print("You want " + pizzaKind +" $");
	
		}
		public static void displayPrice(String size)
		{
			double mediumCost = 9.99;
			double largeCost = 12.99;
			double smallCost = 6.99;	
			
			if("small".equalsIgnoreCase(size))
				System.out.print(smallCost);
			if("medium".equalsIgnoreCase(size))
				System.out.print(mediumCost);
			if("large".equalsIgnoreCase(size))
				System.out.println(largeCost);
		}
		public static void displayHotDog()
		{
			System.out.println("Mmmmm Hot dogs");
	}
}
