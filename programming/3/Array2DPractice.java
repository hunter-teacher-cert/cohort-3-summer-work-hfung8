import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team LucidThinkeren
 * Michael Randazzo, Usman Ahmed, Moo Joon Park, Harrison Fung, Tanya Wardally
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board)
  {
    
    for(int i = 0; i < board.length; i++){
      for( int j = 0; j < board[i].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }
    /* YOUR AWESOME CODE HERE */
  }

/*
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    
    /* YOUR AWESOME CODE HERE */
    // set the column for the board we have the row as a parameter
    for (int col = 0; col < board[row].length; col++){
      // set up the column
      board[row][col] = value;
      }
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  public static char[][] copyBoard( char[][] original )
  {
    //Build board2
    int rows = original.length;
    int cols = original[0].length;
    
    char [] [] board2 = new char [rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board2[i][j] = original[i][j];
      }
    }
    /* YOUR AWESOME CODE HERE */
    
    return board2;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 6
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    /* YOUR AWESOME CODE HERE */
    for(int i = row - 1; i <= row + 1; i++){
        if (i < 0 || i > board.length - 1){
          continue;
        }
      for (int j = col - 1; j <= col + 1; j++){
        if (j < 0 || j > board[0].length - 1){
          continue;
        }
        else if (i == row && j == col){
          continue;
        }
        else {
          board[i][j] = 'X';
        }
      }
    }
  }

  /**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).
     Example:
     Given the array
     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz
     explodeAllchar(board,'z') will change board to:
  */
  public static void explodeAllChar(char[][] board, char c)
  {
    /* YOUR AWESOME CODE HERE */
    for(int i = 0; i < board.length; i++){
      for (int j = 0; j < board[0].length; j++){
        if (board[i][j] == c){
          explodeSquare(board, i, j);
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    /* YOUR AWESOME CODE HERE */
    // since col doesn't change we don't need a for loop to add to keep looping throught it. 
    // we keep adding one to the row so we need to keep looping through it. 
    // we can use one for loop, things get messy if there are more than two, and use two variables in the iterator. Note that there can't be two int used for int k and int i.
    // print up to board.length - row
    int columnLength = board.length - row;
    for (int i = row, k = 0 ; i <= board.length && k <             columnLength; i++, k++){
      board[i][col] = word.charAt(k); 
    }
  }

  public static void main( String[] args )
  {
    char[][] b = buildBoard(7,6,'z');
    // printBoard(b);
    // System.out.println();
    // setRow(b,2,'@');
    // printBoard(b);
    // System.out.println();
    // // char [][] c = copyBoard(b);
    // // printBoard(b);
    // // System.out.println();
    // // printBoard(c);
    // explodeSquare(b, 4, 6);
    // printBoard(b);
    // System.out.println();
    // explodeSquare(b, 0, 9);
    // printBoard(b);
    // System.out.println();
    //char board3 [][] = new char [2][3];  //allows us to setup and create our board
    //b[0][0] = 'j';
    //b[0][1] = 'X';
    //b[0][2] = 'z';
    //b[1][0] = 'q';
    //b[1][1] = 'r';
    //b[1][2] = 'q';
    //printBoard(b);
    //System.out.println();
    //explodeAllChar(b, 'q');
    //printBoard(b);
    downString(b, 1, 1, "Hellow");
    downString(b, 3, 3, "Worldsauce");
    downString(b, 4, 4, "carl");
    printBoard(b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}