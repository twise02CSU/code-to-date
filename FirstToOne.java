/**
Tiarna Wise
COSC 220
5/1/19

First to one Game
Using the player class write a program that simulates the game being played by two players. 
*/

public class FirstToOne
{
   public static void main(String[] args)
   {
      final int starterPoints1 = 50;
      final int starterPoints2 = 50;
      final int starterPoints = 50;
   
   Player player1 = new Player(starterPoints1);
   Player player2 = new Player(starterPoints2);
   
   System.out.println("This simulates a random game being played by two players.");
   
   System.out.println("The initial value of the points for player 1 is " + starterPoints1 + ", and same for player 2.");
      
   System.out.println("The 2 players have to roll the dice until one of the players reach 1 point.");
   
   System.out.println();
      
   for(int r = 0; r < starterPoints; r++)
   {
      player1.roll();
      player2.roll();
      
      System.out.println("Player 1: " + "Player 2: ");
      System.out.println(player1.getAmount() + "         " + player2.getAmount());
   }
   
  if (starterPoints1 == 1)
   {
      System.out.println("Player 1 wins!");
   }
else 
   {
     System.out.println("Player 2 wins!");
   } 
 }
}