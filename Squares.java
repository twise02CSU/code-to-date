/*
Tiarna Wise
Dr. Hatley
COSC 220 001
02/26/2019

Squares 

This program demonstrates the for loop. 
*/

public class Squares 
{ 
   public static void main(String [] args)
   {
   
    int number; // Loop control variable
    
     System.out.println("Number Number Squared");
     System.out.println("------------------------"); 
     
    for (number = 1; number <= 10; number++)     
    {            
    
    System.out.println(number + "\t\t" + number * number); 
    }
   }
  }