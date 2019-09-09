/*
Tiarna Wise
COSC 220
4/6/19

Consider	the following class declaration: 

public class Square 
{   
   private double sideLength;   
   public double getArea()   
   {      
      return sideLength * sideLength;   
   }  
   public double getSideLength()   
   {      
      return sideLength;   
   } 
} 
a. Write a no-arg constructor for this class. It should assign the sideLength field the value 0.0. 
b. Write an overloaded constructor for this class.
   It should accept an argument that is copied into the sideLength field.
*/

public class Square
{
   private double sideLength;   
   
public Square() // no arg constructor
{
   sideLength = 0.0;
}

public Square(double siLe) // overloaded constructor
{
   sideLength = siLe;
}

public void setsideLength(double side)
{
   sideLength = side;
}

public double getsideLength()
{
   return sideLength;
}

public double getArea()
{
   return sideLength * sideLength;
}
}