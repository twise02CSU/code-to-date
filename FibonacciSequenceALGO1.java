import java.util.Scanner;

public class FibonacciSequenceALGO1
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Fibonacci Sequence"); // introduction 
   
      Scanner keyboard = new Scanner(System.in); // saves in the system, the users input.
      
      System.out.println("Enter the array of which value in the fibonacci sequence you wish to see...");
         int userInput = keyboard.nextInt(); // saves the userInput in the Scanner of keyboard
      
      int[] arrNum = new int [userInput]; // stores the number of elements in an array
      
      arrNum[0] = 0; // intialized first element equal to 0
      arrNum[1] = 1; // intialized second element equal to 1
   
      for(int i = 2; i < userInput; i++) 
      {
         arrNum[i] = arrNum[i-1] + arrNum[i-2]; // this line commands to start at 2 then add the two previous numbers then output the total, moving first
      }
      
      System.out.println("Fibonacci Seriesyou preferred: ");
	
	   for(int i = 0; i < userInput; i++)
	   {
          System.out.print(arrNum[i] + " " ); // prints the total of user's input
	   }
      
   }
}