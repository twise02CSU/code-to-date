import java.util.Scanner;

public class FibonacciSequencesALGO1andALGO2
{
   public static void main(String[] args)
   {
   
      System.out.println("Welcome to the Fibonacci Sequence!"); // introduction 
   
      Scanner keyboard = new Scanner(System.in); // saves in the system, the users input.
      
      System.out.println("Enter a number of which range in the Fibonacci Sequence you wish to see...");
      int userInput = keyboard.nextInt(); // saves the userInput in the Scanner of keyboard
      
      long[] arrNum = new long [userInput]; // stores the number of elements in an array
      
      arrNum[0] = 0; // intialized first element equal to 0
      arrNum[1] = 1; // intialized second element equal to 1
      
      System.out.print("Fibonacci Sequence Algorithm #1: " + "\n");
        
      getValues1(arrNum);
      showArray1(arrNum);
     
      System.out.print("\n" + "Fibonacci Sequence Algorithm #2: " + "\n");

      getValues2(arrNum);
      showArray2(arrNum);
   }

   private static void getValues1(long[] arrNum)
   {             
      for(int i = 2; i < arrNum.length; i++) 
      {
         arrNum[i] = arrNum[i-1] + arrNum[i-2]; // this line commands to start at 2 then add the two previous numbers then output the total, moving first
      }
   }
         
     
   public static void showArray1(long[] arrNum)
   {
      for(int i = 0; i < arrNum.length; i++)
      {
         System.out.print(arrNum[i] + " "); // prints the total of user's input
      }
   }

   private static void getValues2(long[] arrNum)
   {
      for(int i = 1; i < (arrNum.length - 1); i++)
      {
         arrNum[i + 1] = arrNum [i] + arrNum[i - 1]; // this line prompts the total to add to the previous num - 1, while equaling the total + 1 
      }
   }
     
   public static void showArray2(long[] arrNum)
   {
      for (int i = 0; i < arrNum.length; i++)
      {
         System.out.print(arrNum[i] + " "); // this line outputs the total as well as the spaces needed with the printing of the Fibonacci Sequence 
      }
   }
}