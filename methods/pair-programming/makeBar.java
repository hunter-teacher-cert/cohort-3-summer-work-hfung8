import java.util.*;
import java.io.*;
//`barGraphify(int[] nums)` 
// if x=[0,1,2,3] then barGraphify(x) will output
// 0:
// 1: =
// 2: ==
// 3: ===

// if x=[1,0,3,2] then barGraphify(x) will output
// 0: =
// 1:
// 2: ===
// 3: ==

// public class makeBar{
//   public static String[] barGraphify(int[] nums){
//     String[] barArray = new String[nums.length];
//     String bar = "";
//     for (int i = 0; i<nums.length; i++){
//       //iterate through the array
//       // how to get the exact number of bars 
//       for (int h = 0; h < nums[i]; h++){
//         // set the bars
//         bar += "=";
//       }
//       // create the element in barArray
//       barArray[i] = bar;
//       bar = "";
//     }
//     return barArray;
//   }

//   public static void main(String[] args){
//     int[] x = new int[] {1,0,3,2};
//     String[] result = barGraphify(x);
//     for (int i = 0; i < result.length; i++){
//       System.out.println(i + ": " + result[i]);
//     }
//   }
// }


public class makeBar{
  public static String barGraphify(int[] nums){
    String bar = "";
    for (int i = 0; i<nums.length; i++){
      //set the bar string to have the indices 
      bar += i + ": ";
      // how to get the exact number of bars 
      for (int h = 0; h < nums[i]; h++){
        // set the bars
        bar += "=";
      }
      // add new line character to bar
      bar += "\n";
    }
    return bar;
  }

  public static String[][] vBarGraphify(int[] nums){
    int height = 0;
    for (int i = 0; i < nums.length; i++){
      if (nums[i] > height){
        height = nums[i];
      }
    }
    height = height + 1;
    System.out.println("height:" + height);
    String[][] result = new String[height][nums.length];
    for (int i = 0; i < nums.length; i++){
      result[height-1][i] = (Str)i;
    }
    return result;
  } 

  public static void printBoard( char[][] board )
    {
      for (int i=0; i < board.length; i++){
        for (int j = 0; j < board[0].length; j++){
          System.out.print(board[i][j] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }


  
  public static void main(String[] args){
    int[] x = new int[] {1,0,3,2};
    String result = barGraphify(x);
    System.out.println(result);
    String[][] vGraph = vBarGraphify(x);
    printBoard(vGraph);
  }
}

