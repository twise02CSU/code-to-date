/*
Tiarna Wise
COSC 220
4/18/19

Write code that creates an ArrayList that can hold String objects. 
Add the names of three cars to the ArrayList, and then display the contents of the ArrayList.

Problem 11
*/

public class ArrayList
{
   public static void main(String[] args)
   {
   String[] names = { "Honda Accord", "Jeep Cherokee", "Benz" };
   
   int[] cars = { 1, 2, 3 };
   
   for(int i = 0; i < names.length; i++)
   {
      System.out.println(names[i] + " is the " + cars[i] + " car.");
   }
}
}
   
   
   
   