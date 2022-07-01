/**
 * Game of Nim by Team BossCoders
 * First Last
 * collaborators: First Last, First Last
 */
import java.io.*;
import java.util.*;

public class Nim {
  public static void main( String[] args){
    int stones = 12; 
    int stonesTaken; 
    Scanner in = new Scanner(System.in);

    // loops until the game ends
    while (stones > 0){

      // user input
      System.out.println("please enter a number 1 -3");
      stonesTaken = in.nextInt();
      
      // subtract from the stones
      stones = stones - stonesTaken; 
      System.out.println("There are " + stones + " left");

      // if conditional if stones is less than or equal to zero you win
      if (stones <= 0){
        System.out.println("You win!");
      }

      // computers turn
      System.out.println("Computers Turn");
      stonesTaken = (int)(Math.random()*3)+1;

      // subtract from stones 
      stones = stones - stonesTaken;
      System.out.println("The computer took " + stonesTaken);
      
      System.out.println("There are " + stones + " left");

      // if conditional if stones is less than or equal to zero Computer wins
      if (stones <= 0){
        System.out.println("Computer wins!");
      }
    }
  }
}