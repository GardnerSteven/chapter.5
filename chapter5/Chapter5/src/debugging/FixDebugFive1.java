package debugging;
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import javax.swing.JOptionPane;
public class FixDebugFive1
{
   public static void main(String args[]) throws Exception
   {
      final double HIGH_PRICE = 2.59;
      final double MED_PRICE = 1.99;
      final double LOW_PRICE = 0.89;
      String usersChoiceString;
      int usersChoice1;
      double bill = 0.0;
      usersChoiceString = JOptionPane.showInputDialog(null,
         "Order please\n1 - Burger\2 - Hotdog" +
         "\n3 - Grilled cheese\n4 - Fish sandwich");
      usersChoice1= Integer.parseInt(usersChoiceString);
      if(usersChoice1 == 1 | usersChoice1 == 2)
         bill = bill + HIGH_PRICE;
      else
         bill = bill + MED_PRICE;
      usersChoiceString = JOptionPane.showInputDialog(null,
          "Fries with that?\n1 - Yes\n2 - No");
      usersChoice1 = Integer.parseInt(usersChoiceString);
      if (usersChoice1 == 3)
          bill = bill + LOW_PRICE;
      JOptionPane.showMessageDialog(null,"Bill is " + bill);
   }
}
