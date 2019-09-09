/*
Tiarna Wise
COSC 220
4/26/19

MonthDemo

*/
import java.util.Scanner;

public class MonthDemo
{
   public static void main(String[] args)
   {
   
   Month month = new Month();
   
   System.out.println("Month " + month.getMonthNumber() + " is " + month);
   
   Month month2 = new Month(2);
   
   for(int m = 2; m <= 12; m++)
   {
      month2.setMonthNumber(m);
      System.out.println("Month " + month2.getMonthNumber() + " is " + month2);
   }
 }
}