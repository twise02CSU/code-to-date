/**
Tiarna Wise
COSC 221
Dr. Hatley
Sep 5, 2019
*/

import java.util.Scanner;

public class FibonacciSequenceALGO2
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to the Fibonacci Sequence"); // introduction 
   
      Scanner keyboard = new Scanner(System.in); // saves in the system, the users input.
      
      System.out.println("Enter the array of which value in the fibonacci sequence you wish to see...");
       int userInput = keyboard.nextInt(); // saves the userInput in the Scanner of keyboard
      
      int[] arrNum = new int [userInput]; // stores the number of elements in an array
      
      arrNum[0] = 0; //intialized first element equal to 0
      arrNum[1] = 1; // intialized second element equal to 1
   
      for(int i = 1; i < (userInput - 1); i++) // this line commands variable i equal to one since you cant have more elements in an array that are already intialized, 
                                               //then having the userInput - 1, indicates when i is less then that the output would remain 0, as well as the incrementation of the i variable 
      {
         arrNum[i + 1] = arrNum [i] + arrNum[i - 1]; // this line prompts the total to add to the previous num - 1, while equaling the total + 1 
      }
      
      System.out.println("This is the Fibonacci Sequence you preferred: "); // officially prints the fibonacci sequence
      
      for (int i = 0; i < userInput; i++)
      {
         System.out.print(arrNum[i] + " "); // this line outputs the total as well as the spaces needed with the printing of the Fibonacci Sequence 
      }
   }
}