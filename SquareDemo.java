/*
Tiarna Wise
COSC 220
4/6/19
*/

import java.util.Scanner;

public class SquareDemo
{
   public static void main(String [] args)
   {
   
   double sideLength;
   
   Square r = new Square(); // calls the no-arg constrctor
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.println("Please enter the side of the square: ");
   sideLength = keyboard.nextDouble();
   
   Square side = new Square(sideLength);
   
   System.out.println();
   System.out.println("Here is the data that was attained by the computer: ");
   System.out.println("The side of the square " + side.getsideLength());
   System.out.println("The area of the both sides of the square is " + side.getArea());
   }
   }