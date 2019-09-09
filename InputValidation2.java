/**
Tiarna Wise
Dr.Hatley 
COSC 220 
10 February 2019
Write an input validation loop that asks the user to enter ‘Y’, ‘y’, ‘N’, or ‘n’. 
*/

import java.util.Scanner;

public class InputValidation2
{
   public static void main(String[] args)
   {
   
   String input;
   char letter;
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Enter Y, y, N or n.");
   
   input = keyboard.nextLine();
   letter = input.charAt(0);
    
   while (letter != 'Y' && letter != 'y' && letter != 'N' && letter != 'n')
   {
        System.out.println("Try Again.");
        
              System.out.println("Enter Y, y, N, n: ");
              
        input = keyboard.nextLine();
        
              letter = input.charAt(0);
   }
   
      System.out.print("Good job!");
      
      System.exit(0);

  }
 }
   


   
    