package excercises;

public class RockPaperScissors 
{

	public static void main(String[] args) 
	{
		String userEntryString;
		String result = null;
		int userEntry;
		Random rand = new Random();
		int r = rand.nextInt(3) + 1;
		userEntryString = JOptionPane.showInputDailog(null, "Welcome to rock, paper, scissors.\n1 = Rock\n2 = Paper\n3 = Scissors");
		userEntry = Integer.parseInt(userEntryString);
		
		if(userEntery == 1)
		{
			if(r == 3)
				result = "You Won";
			
			if(r == 2)
				result = "You Lose";
			
		}
		
	}

}
