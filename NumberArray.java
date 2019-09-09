/*
Tiarna Wise
COSC 220
4/15/19

Look at the following array declaration: 
int[][] numberArray = new int[9][11];
a. Write a statement that assigns 145 to the first column of the first row of this array. 
b. Write a statement that assigns 18 to the last column of the last row of this array.

Problem 8
*/

public class NumberArray
{
   public static void main(String[] args)
   {
   
   int[][] numberArray = new int[9][11];
   
    numberArray[0][0] = 145; // a.
   
    numberArray[8][10] = 18; // b.
   
System.out.println("The first column and first row holds the value 145."); 
System.out.println("The last column and last row holds the value 18.");  
   }
}