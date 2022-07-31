import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

	  // Stack s = new Stack();
   //  s.push(10);
   //  int size = s.size();
   //  System.out.println("" + s.toString());
   //  int top = s.top();
   //  System.out.println(size);
   //   System.out.println(top);
   //  s.push(20);
   //  System.out.println("" + s.toString());
   //  System.out.println(size);
   //  s.push(30);
   //  System.out.println("" + s.toString());
   //  System.out.println(size);
   //  int popped = s.pop();
   //  System.out.println(popped);
   //  System.out.println("" + s.toString());
   //  System.out.println(size);
   //  s.pop();
   //  System.out.println("" + s.toString());
   //  s.pop();
   //  System.out.println("" + s.toString());
   //  System.out.println(size);
    

    Queue q = new Queue();
    q.enqueue(19);
    System.out.println(q);
    q.enqueue(20);
    System.out.println(q);
    q.enqueue(21);
    System.out.println(q);
    q.enqueue(22);
    System.out.println(q); 
    q.enqueue(23);
    System.out.println(q);
    q.enqueue(24);
    System.out.println(q);
    int j = q.dequeue();
    int f = q.front();
    System.out.println(q); 
    System.out.println(j);
    System.out.println(q); 
    System.out.println(f);
    System.out.println(q);
    int s = q.size();
    System.out.println(s);
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    boolean isEmpty = q.isEmpty();
    System.out.print(isEmpty);

    }
}