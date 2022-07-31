import java.io.*;
import java.util.*; 

public class Queue{

  // first in first out 
  
  // Place private instance variables here
  
  private Node head;
  private Node next;
  private int count = 0;
  
  // Place constructors here
  public Queue(){
    this.head = null;
    this.next = null;
  }
  
  // Place methods here
  public void enqueue(int value){
    Node new_node = new Node(value, this.head);
    this.head = new_node; 
    count++;
  }

  public int dequeue(){
    if (count == 0){
      System.out.println("Queue is empty");
      return -1;
    } else {
    int node_value = this.head.get();
    this.head = this.head.getNext();
    count--;
    return node_value;
    }
  }

  public int front(){
    return this.head.get();
  }

  public boolean isEmpty(){
    if (count == 0){
      return true;
    }
    return false;
  }

  public int size(){
    return this.count;
  }

  public String toString(){
    Node walker;
    walker = head;
    String stringList = "";
    while (walker.getNext() != null){
      stringList += walker.get() + "->";
      walker = walker.getNext();
    }
    stringList += walker.get();
    return stringList;
  }
}