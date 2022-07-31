import java.io.*;
import java.util.*;

public class Stack{

    // Place private instance variables here
    private ArrayList<Integer> A;
    private int top = -1;
    private int size;
  
    // Place constructors here
    public Stack()
      {
        this.size = 5;
        this.A = new ArrayList<Integer>(size);     
      }
    
  
    // Place methods here
    public void push(int value)
      {
        if (top +1 == size)//check if array is full
        {
          System.out.println("Stack Overflow");
        }
        else //increment top to go to next position
        {
          top = top + 1;
          A.add(top, value);
        }

      }

    public int pop()
      {
        int b = A.get(top);
        if (top == -1)
          {
            System.out.println("Stack underflow");
          }
        else
          {
            A.remove(top);
            top--;
          }
        return b;
      }

    public int top()
      {
        if(top == -1)
          {
            System.out.println("Stack underflow");
          }
        else
          {
            return A.get(top);
          }
          return -1;
      }

    public boolean isEmpty()
      {
        return A.isEmpty();
      }

    public String toString()
      {
        String ans = "";
        if (top == -1)
          {
            return ans;
          }
        for (int i = 0; i < top; i++)
          {
            ans += String.valueOf(A.get(i))+ "->";
          }
        ans += String.valueOf(A.get(top));
        return ans;
      }

    public int size ()
      {
        return top + 1;
      }
}
  /*
  void push(int value) //- add value to the top of the stack
  int pop() //- remove and return the top value from the stack
  int top() //- return but do not remove the top value from the stack
  boolean isEmpty() //- return true of the stack is empty, false otherwise
  int size() //- return the number of elements currently in the stack
  boolean isFull() //- returns true if the stack is full, false otherwise - only implement this if you use an array for implementation
  toString() //- return a string with all the data in the stack
  */

  
  