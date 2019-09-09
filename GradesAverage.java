/*
Tiarna Wise
COSC 220
4/13/19

Declare a two-dimensional int array named grades. 
It should have 30 rows and 10 columns.

Write code that calculates the average of all the elements 
in the grades array that you declared in Question 6.

Problem 6&7
*/

import java.util.Scanner;
import java.util.Random;
public class GradesAverage
{
   public static void main(String[] args)
   {
      
   final int theTestScores = 30; // rows
   final int theStudents = 10; //columns
   double average = 0.0; // average
   double sum = 0.0;
   
   double[][] grades = new double[theTestScores][theStudents];
   Scanner keyboard = new Scanner(System.in);
   Random randomNumbers = new Random();
   
   
   System.out.println("This program will average the grades of all the students tests, throughout the school year.");
   System.out.println("Please enter the test scores for each student below:");
   
   for(int r = 0; r < theTestScores; r++)
   {
      for(int c = 0; c < theStudents; c++)
      {
         System.out.printf("Test Score %d, Student %d : ", (r + 1), (c + 1));
         grades[r][c] = randomNumbers.nextInt(5);
         
         System.out.print(theTestScores+"\n");
      }
      System.out.println();
   }
   
   for(int r = 0; r < theTestScores; r++)
   {
      for(int c = 0; c < theStudents; c++)
      {
        sum += grades[r][c];
        average = sum/(r*c);
      }
   }
   
   System.out.println("The average of grades = " + average);
  }
}