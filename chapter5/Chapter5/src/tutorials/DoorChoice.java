package tutorials;

import javax.swing.JOptionPane;

public class DoorChoice 
{
	
	public static void main(String[] args) 
	{
		String choiceString;
		int doorChoice;
		int response =1;
		while(response == 1)
		{
			choiceString = JOptionPane.showInputDialog(null, "Pick a door any door, 1, 2, or 3.",
			"Door Choice", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choiceString);	
		
		
		
		if(doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null,"You Win Nothing!! HAHAHAHAHAHAHAH!");
		}
		if (doorChoice == 2)
		{
			JOptionPane.showMessageDialog(null,"You Still Win Nothing!! LOLOLOLOLOL!");
		}
		if (doorChoice >= 4)
		{
			JOptionPane.showMessageDialog(null,"Hey thats not an option, i said 1-3.");
		}
		if (doorChoice == 3)
		{
			JOptionPane.showMessageDialog(null,"You won a... stick of.. gum.");
		}
		
		}
	
	}

}
