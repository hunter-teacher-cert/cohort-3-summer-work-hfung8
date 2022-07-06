/**
 * ArrayPractice by Team BossCoders
 * First Last
 * collaborators: Harrison Fung, William Lamorie, Wayne Tobias
 */

/**
   INSTRUCTIONS:
   This file contains stubs (empty methods) for the following methods:
   1. buildIncreasingArray
   2. buildRandomArray
   3. printArray
   4. arraySum
   5. firstOccurence
   6. isSorted
   7. findMaxValue
   8. countOdds
   9. flip
   The stubs will have comments describing what they should do
   Levels:
   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   Basic:
   Complete these methods:
   - buildRandomArray
   - printArray
   - arraySum
   - firstOccurence
   - findMaxValue
   Intermediate:
   Complete all the methods for basic and also
   - buildIncreasingArray
   - isSorted
   - countOdds
   Advanced:
   Complete all the methods
*/

import java.util.*;
import java.io.*;

public class ArrayPractice
{

  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];

    data[0] = startValue;

    for(int i = 1; i < size; i ++){
    // loop through each element of the array and
      // assign the appropriate value to each one.
      data[i] = data[i-1] + step;
    }

    return data;
  }


  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];

    /* YOUR BRILLIANT CODE HERE */
    for (int i=0; i<size; i++){
      data[i] = r.nextInt(maxValue);
    }

    return data;
  }


  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */
  public static void printArray( int[] data )
  {
    for (int i = 0; i < data.length; i++){
      System.out.print(data[i] + " ");
    }
    System.out.println("");
  }



  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {
    int index = data.length; // should never be the answer
    for(int i = 0; i < data.length; i++){
      if((data[i] == value) && (index == data.length)){ // need a t & t
        index = i;
      }
    }  
    
    return index; 
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */
    int sum = 0;

    for( int i = 0; i < data.length; i++){
      sum += data[i];
    }
    return sum; // replace this
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data )
  {
    // set up the loop
    for (int i=0; i<data.length-1; i++){
      // conditional statement
      if (data[i] > data[i+1]){
        return false;
      }
    }

    return true; // replace this

  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m = data[0];  // will hold the maximum value; initially set to first entry

    /* YOUR BRILLIANT CODE HERE */
    // stores first value in m and then compares against all values for a larger one
    for (int i=1; i<data.length; i++){
      if (data[i]>m){
        m = data[i];
      }
    }

    return m;
  }


  /**
     Parameters:
     data - an array of integers
     Returns:
     the number of odd elements in the array
     Ex: if data holds 5,6,7,8,9,10 then the return value
     will be 3 since three of the elements are odd.
  */
  public static int countOdds( int[] data ) {
    int count =0;

    /* YOUR BRILLIANT CODE HERE */
    for (int i=0; i<data.length; i++){
      if ((data[i]%2)!=0){
        count++;
      }
    }

    // Note the % operator is the modulo (basically remainder) function
    // in java. Use to determine if an integer is odd.

    return count;
  }

  /**
     Parameters:
     data - an array of integers
     Returns:
     no return value since this is a void function -- but
     you will manipulate the values in the array parameter
     Postcondition:
     elements of the input array are in reverse order
     Example:
     If the input array contains 5,8,13,7,27,2
     After the routine, the array will contain 2,27,7,13,8,5
  */
  public static void flip( int[] data )  
  {
    // need to have a temporary storage array
    int[] temp = new int[data.length]; // make with a length equal to data
    int end = data.length -1; // the end point of the array (to make less confusing)
    
    // flip the order in the temporray array
    for(int i = 0; i <= end; i++){ // <= end is equal to < data.length
      temp[i] = data[end -i]; // So temp i will be equal to the end minus i 
    }
    // The temp array is in the order we want. Now to copy it back on to the 
    // data array
    for(int i = 0; i <= end; i++){
      data[i] = temp[i]; // copy over item by item
    }
    
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    //int[] data = buildRandomArray(10, 20);
    //int[] data2 = buildIncreasingArray(10,5,3);
    //printArray(data);
    //printArray(data2);
    int[] data3 = {1,5,2,7,5,8,5,12,19,5}; 
    // System.out.println(findMaxValue(data3));
    // int[] data4 = {5,2,4,10};
    //System.out.println(arraySum(data4));
    // System.out.println(firstOccurence(data3, 5));
    // add calls to show that the methods you write work.
    //int[] data5 = {5,6,7,8,9,10};
    //System.out.println(countOdds(data5));
    System.out.print("Before: ");
    printArray(data3);
    System.out.println();
    flip(data3);
    System.out.print("After: ");
    printArray(data3);
  }
}