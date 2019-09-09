/* 
Tiarna Wise
Dr.Hatley 
COSC 220 
10 February 2019
Write an input validation loop that asks the user to enter “Yes” or “No”.
*/

import java.util.Scanner;

public class InputValidation3
{
   public static void main(String[] args)
   {
   
   String input;
   
        Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter Yes or No: ");
   
   input = keyboard.nextLine();
   
   while (! input.equals("Yes") && ! input.equals("No"))
   {
         System.out.println("Try Again.");
         
         System.out.println("Enter Yes or No: ");
         
         input = keyboard.nextLine();
         
   }
         System.out.print("Good Job!");
         
         System.exit(0);
   }
  }