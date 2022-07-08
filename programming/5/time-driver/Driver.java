import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	Time t;

	//assign var the address of a newly-apportioned Time object
	t = new Time(5,30,30);
  Time h;
  h = new Time(0,2,0);
  t.set(5,28,30);
  t.add(h);
  Time z;
  z = new Time(4,30,35);
  int compare2 = t.compareTo(z);
  System.out.println(compare2);
  System.out.println(t.toString());
  int compare = t.compareTo(h);
  System.out.println(compare);
  }//end main()

}//end class