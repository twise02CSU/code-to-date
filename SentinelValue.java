/**

Chapter 4 Section 4.6 Checkpoints 4.13-4.15

Write a for loop that repeats seven times, asking the user to enter a number. The loop should also calculate the sum of the numbers entered. 

This program calculates the 7 times the user entered a random number. 

The user enters a series of point values, then 0 when finished.

*/

import java.util.Scanner;

public class SentinelValue
{
   public static void main(String[] args)
   {
   
    int randomNumbers;
    int totalNumber = 0;
    
    Scanner keyboard = new Scanner(System.in);
    
    // general instructions
    System.out.println("Enter 7 random numbers,");
    System.out.println("Enter 0 when finished.");
    System.out.println();
    
    // first random number
    System.out.print("Enter a random number or 0 to end: ");
    randomNumbers = keyboard.nextInt();
    
    // record random numbers until 0 is entered.
    while (randomNumbers != 0)
    {
        // add random numbers.
        totalNumber += randomNumbers;
        
        // get next set of numbers.
        System.out.print("Enter a random number or 0 to end: ");
        randomNumbers = keyboard.nextInt();
    }
    
    // sum of the numbers
    System.out.println("The total number of numbers you typed in are " + totalNumber);
    }
    }

/*
In the following program segment, 
which variable is the loop control variable (also known as the counter variable) and which is the accumulator? 

int a, x = 0, y = 0; 
while (x < 10) 
{   
   a = x * 2;   
   y += a;   
   x++; 
   } 
   System.out.println("The sum is " + y);
   
The part where it's "(x < 10)" is the loop control variable, while the accumulator is "y += a;"

You should be careful when choosing a sentinel value because it should not be a potential entry from the user or included in the running total.