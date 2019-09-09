/*
Tiarna Wise
COSC220
3/12/2019

******* 
****** 
***** 
**** 
*** 
**
*

*/

public class NestedLoopsStars
{
   public static void main(String[] args)
   {
      
   for(int d = 1; d <= 7; d++) 
   {
      for(int u = 1; u < d; u++)
      {
      System.out.print("");
      }
   for(int r = 7; r >= d; r--)
      {
      System.out.print("*");
     }
     System.out.println(" ");
   }
 }
}