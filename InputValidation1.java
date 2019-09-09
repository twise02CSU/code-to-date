/**
Tiarna Wise
Dr.Hatley 
COSC 220 
10 February 2019

InputValidation Code

Write an input validation loop that asks the user to enter a number in the range of 10 through 24.
*/

import javax.swing.JOptionPane;

public class InputValidation1
{ 
   public static void main(String[] args)
   {
   
   String input;
   int number;
   
   input = JOptionPane.showInputDialog("Enter a number " +
                         "in the range of 10 through 24.");
   number = Integer.parseInt(input);
   
          // Validate the input.
     while (number < 10 || number > 24)
     {   
        input = JOptionPane.showInputDialog("Invalid input. " + 
                            "Enter a number in the range of 10 through 24.");
        number = Integer.parseInt(input);
     }
     
      JOptionPane.showMessageDialog(null, "The number entered was valid, good job.");
      
      System.exit(0);
  }
}