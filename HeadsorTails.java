/**
Tiarna Wise
COSC 220
5/2/19

Heads or Tails Game 
This game is meant for two or more players. 
In this game, the players take turns flipping a coin. 
Before the coin is flipped, players should guess if the coin will land face up or face down. 
If a player guesses correctly, then that player is awarded a point. 
If a player guesses incorrectly, then that player will lose a point. 
The first player to score five points is the winner. 
Write a program that simulates the game being played by two players. 
Use the Coin class that you wrote as an assignment in Chapter 6 (Programming Challenge 16) to simulate the coin. 
Write a Player class to simulate the players.
*/

import java.util.Scanner;
import java.util.Random;
public class HeadsorTails
{
   public static void main(String[] args)
   {
   
   int usersGuess, coinFlip;
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter 1 if you think it's heads or 0 for tails: ");
      usersGuess = keyboard.nextInt();
      
      keyboard.close();
      
      System.out.println("The coin is currently flipping...and !");
      
      coinFlip = new Random().nextInt(2);
      
      if(usersGuess == coinFlip)
      {
         System.out.println("Your random guess was right!");
      }
      else if(coinFlip == 1)
      {
         System.out.println("Actually, it was heads!");
      }
      else
      {
         System.out.println("Actually, it was tails!");
      }
   }
}
      