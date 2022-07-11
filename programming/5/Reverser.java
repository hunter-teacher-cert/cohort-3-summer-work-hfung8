import java.io.*;
import java.util.*;

/**
 * Recursive String Reverser by Team Palindromotosis
 * First Last
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  //  Second method using a for loop
      String dummyString = "";
      for (int i = s.length() - 1; i >= 0; i--){
        dummyString = dummyString + s.charAt(i);
      }
    return dummyString;
  **/
  public static String reverseR( String s, String firstString)
  {
    /** using recursion but added an additional parameter for holding the final value because we can't reintialiaze over and over and need a way to keep incrementing the final value
      **/
    // create an end variable to get the length of the string
    int end = s.length();

    // create a way to get the final character after each iteration
    String dummyString = "" + s.charAt(end - 1);

    // increment the final value by the letter 
    firstString += dummyString;

    // base case
    if (end == 1){
    return firstString;
    } 
    // otherwise decrement end and take the substring from a different value
    else {
      end -= 1;
      return reverseR(s.substring(0, end), firstString); 
    }
  }

  public static void main( String[] args )
  {
    System.out.println( reverseR("odd", "") ); 
    System.out.println("=================================");
    System.out.println( reverseR("even", "") );
    System.out.println("=================================");
    System.out.println( reverseR("abcdefg", "") );
    System.out.println("=================================");
    System.out.println( reverseR("stressed", "") );
    System.out.println("=================================");
    System.out.println( reverseR("amanaplanacanalPanama", "") );
    System.out.println("=================================");
    //more tests welcome
    // got some good palindromes?
  }
}