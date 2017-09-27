package excercises;

import javax.swing.JOptionPane;

public class CellPhoneService 
{

	public static void main(String[] args) 
	{
		int minutes;
		int texts;
		int data;
		String minutesString, textString, dataString;
		
		
		
		
		
		minutesString = JOptionPane.showInputDialog(null, "Please enter the amount of minutes you use.");
			minutes = Integer.parseInt(minutesString);
		
		textString = JOptionPane.showInputDialog(null, "Please enter the amount of text you send.");
			texts = Integer.parseInt(textString);
		
			dataString = JOptionPane.showInputDialog(null, "Please enter the amount of gigabytes you use.");
			data = Integer.parseInt(dataString);	
			
			if(minutes <= 500 & texts <= 0 & data <= 0)	
  			{
				System.out.println("choose option A. It costs $49 a month.");
  			}
			if(minutes < 500 & texts <= 999999999 & data == 0)
			{
				System.out.println("choose option B. It costs $55 a month.");
			}
			if(minutes >= 500 & texts <= 100 & data == 0)
			{
				System.out.println("choose option C. It costs $61 a month.");
			}
			if(texts >= 100)
			{
				System.out.println("choose option D. It costs $70 a month.");
			}
			if(data <= 2)
			{
				System.out.println("choose option E. It costs $79 a month.");
			}
			if(data >= 2)
			{
				System.out.println("choose option F. It costs $89 a month.");
			}
	}

}
