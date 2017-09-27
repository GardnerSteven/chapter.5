package excercises;

import javax.swing.JOptionPane;

public class AsendingAndDescending 
{

	public static void main(String[] args) 
	{
		int one, two, three;
		String str, output = null;
		
		str = JOptionPane.showInputDialog(null,"Enter an integer");
	      one = Integer.parseInt(str);
	      str = JOptionPane.showInputDialog(null,"Enter an integer");
	      two = Integer.parseInt(str);
	      str = JOptionPane.showInputDialog(null,"Enter an integer");
	      three = Integer.parseInt(str);
	      
	      if (one > two & two > three) {
	    	  output = (one + ", " + two + ", " + three);
	    	  JOptionPane.showMessageDialog(null, output);
	      }
	      else
	    	  if (three > one & one > two) {
	    		  output = (three + ", " + one + ", " + two);
	    		  JOptionPane.showMessageDialog(null, output);}
	    	  else
	    		  if (two > three & three > one) {
	    			  output = (two + ", " + three + ", " + one);
	      				JOptionPane.showMessageDialog(null, output);}
	    		  else
	    	    	  if (three > two & two > one) {
	    	    		  output = (three + ", " + two + ", " + one);
	    	    		  JOptionPane.showMessageDialog(null, output);}
	      
	    	    	  else
	    		    	  if (two > one & one > three) {
	    		    		  output = (two + ", " + one + ", " + three);
	    		    		  JOptionPane.showMessageDialog(null, output);}
	      
	    		    	  else
	    			    	  if (one > three & three > two) {
	    			    		  output = (one + ", " + three + ", " + two);
	    			    		  JOptionPane.showMessageDialog(null, output);}
	}

}
