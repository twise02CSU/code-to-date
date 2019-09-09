/*
Tiarna Wise
COSC 220
4/26/19

Write a class named Month. 

The class should have an int field named monthNumber that holds the number of the month. 
For example, January would be 1, February would be 2, and so forth. 

In addition, provide the following methods: 
•	A	no-arg	constructor	that	sets	the	monthNumber field to 1. 
•	A	constructor	that	accepts	the	number	of	the	month	as	an	argument.	
It	should	set	the	monthNumber field to the value passed as the argument. 

If a value less than 1 or greater than 12 is passed, the constructor should set monthNumber to 1. 
•	A	constructor	that	accepts	the	name	of	the	month,	such	as	“January”	or	“February”	as	an argument. 

It should set the monthNumber field to the correct corresponding value. 
•	A	setMonthNumber method that accepts an int argument, which is assigned to the monthNumber field. 

If a value less than 1 or greater than 12 is passed, the method should set monthNumber to 1. 
•	A	getMonthNumber method that returns the value in the monthNumber field. 
•	A	getMonthName method that returns the name of the month. 

For example, if the monthNumber field contains 1, then this method should return “January”. 
•	A	toString method that returns the same value as the getMonthName method. 
•	An	equals method that accepts a Month object as an argument. 
If the argument object holds the same data as the calling object, this method should return true. 
Otherwise, it should return false.

•	A	greaterThan method that accepts a Month object as an argument. 
If the calling object’s monthNumber field is greater than the argument’s monthNumber field, this method should return true. 
Otherwise, it should return false. 
•	A	lessThan method that accepts a Month object as an argument. 
If the calling object’s monthNumber field is less than the argument’s monthNumber field, this method should return true. 
Otherwise, it should return false.
*/

public class Month
{
   /**
      monthNumber The number of the month
   */
   
   private int monthNumber = 0;
   
   /**
      monNum The initialization of number of months
   */
   
   private int monNum = 0;
   
   /**
      name The name of months
   */
   
   private String name;
   
   /**
      monthNumber The value of the number of months
      num++ The number incremented
   */
   
   public Month()
   {
      monNum++;
      monthNumber = 1;
   }
   
   /**
      @return monthNumber gets the number of the month entered
   */
   
   public int getMonthNumber()
   {
      return monthNumber;
   }
   
   public void setmonthNumber(int m)
   {
      monthNumber = m;
   }
   
   /**
      @param m holds the length of which the months are measured 
   */
   
   public Month(int m)
   {
      if (m < 1 || m > 12)
         monthNumber = 1;
      else 
         monthNumber = m;
   }
   
   /**
   Holds the format for all info received
   toString method
   @param name Holds the name of the month
   */
   
   public Month (String name)
   {
      if (name.equals("January."))
         monthNumber = 1;
      else if (name.equals("February."))
         monthNumber = 2;
      else if (name.equals("March."))
         monthNumber = 3;
      else if (name.equals("April."))
         monthNumber = 4;
      else if (name.equals("May."))
         monthNumber = 5;
      else if (name.equals("June."))
         monthNumber = 6;
      else if (name.equals("July."))
         monthNumber = 7;
      else if (name.equals("August."))
         monthNumber = 8;
      else if (name.equals("September."))
         monthNumber = 9;
      else if (name.equals("October."))
         monthNumber = 10;
      else if (name.equals("November."))
         monthNumber = 11;
      else if (name.equals("December."))
         monthNumber = 12;
      else
         monthNumber = 0;
   }
    
   public void setMonthNumber(int m)
   {
      if ( m < 1 || m > 12)
         monthNumber = 1;
      else
         monthNumber = m;
   }
    
   public String getnameMonth()
   {       
      String name; 
       
      switch (monthNumber) 
      { 
         case 1: name = "January."; 
            break; 
         case 2: name = "February."; 
            break; 
         case 3: name = "March."; 
            break; 
         case 4: name = "April."; 
            break; 
         case 5: name = "May."; 
            break; 
         case 6: name = "June."; 
            break; 
         case 7: name = "July."; 
            break; 
         case 8: name = "August."; 
            break; 
         case 9: name = "September."; 
            break; 
         case 10: name = "October."; 
            break; 
         case 11: name = "November."; 
            break; 
         case 12: name = "December."; 
            break; 
         default: name = "Unknown..."; 
      } 
      return name; 
   }    
    
   public String toString()
   {
      return getnameMonth();
   }
    
    /**
   Holds the value of the month 
   @param month2 Holds the portion of the 2nd pair of responses
   @return The monthNumber equal the 2nd monthNumber and Name
   */
   
   public boolean equals(Month month2)
   {
      return this.monthNumber == month2.monthNumber;
   }
   
   public boolean greaterThan(Month month2)
   {
      return this.monthNumber == month2.monthNumber;
   }
   
   public boolean lessThan(Month month2)
   {
      return this.monthNumber == month2.monthNumber;
   }
}
