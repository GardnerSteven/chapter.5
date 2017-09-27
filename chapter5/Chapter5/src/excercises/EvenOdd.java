package excercises;

import javax.swing.JOptionPane;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		int response;
		int one;
		String str;
		while(response == 1)
		{	
		
		str = JOptionPane.showInputDialog(null,"Enter an integer");
		one = Integer.parseInt(str);

		if ( one % 2 == 0 )
			JOptionPane.showInputDialog(null,"You entered an even number");
		else
		{
			JOptionPane.showInputDialog(null,"You entered an odd number");
		}
			System.out.println("Would you like to enter another number? 1 for yes 2 for no>>>");
			response = input.nextInt();
		}				
		System.out.println("have a nice day");		
	}
}
