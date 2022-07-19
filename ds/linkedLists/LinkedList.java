import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).
Basic
-----
add(string value)
get(int index);
toString()
Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()
Challenge
--------
remove(int index);
Harrison Fung, Yenmin Young, Jenna Lin, Kianna Herr
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  /**
  Parameters:
  value - the new string to add to the list
  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node n1 = new Node(value, head);
    head = n1; 
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker;
    walker = head; 
    for (int i = 0; i < index; i++){
      walker = walker.getNext();
    }
    return walker.getData();
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    Node walker;
    walker = head;
    String stringList = "";
    while (walker.getNext() != null){
      stringList += walker.getData() + "->";
      walker = walker.getNext();
    }
    stringList += walker.getData();
    return stringList;
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    Node walker; 
    walker = head;
    int size = 0; 
    while (walker != null){
      size++;
      walker = walker.getNext();
    }
    return size;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value
  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.
  For example, given the list:
  "a" -> "b" -> "c" -> "d"
  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"
  */
  public void add(int index, String value){
    if (index == 0){
      this.add(value);
    } else {
    Node walker; 
    walker = head;
    Node z = new Node();
    z.setData(value);
    for (int i = 0; i < index - 1; i++){
      walker = walker.getNext();
    }
    Node j = walker.getNext();
    z.setNext(j);
    walker.setNext(z);
    }
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.
  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.
  */
  public int indexOf(String value){
    Node walker = head; 
    for (int i = 0; i < this.size(); i++){
      if (walker.getData() == value){
        return i;
      }
      walker = walker.getNext();
    }
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    Node walker = head;
    String[] d = new String[this.size()];
    for (int i = 0; i < d.length; i++){
      d[i] = this.get(i);
    }
    return d;
  }



  /**
  Remove the Node at location index from the list.
  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
    public void remove(int index){
      Node walker = head; 
      if (index == 0){
        head = walker.getNext();
      } else {
      for (int i = 0; i < this.size(); i++){
        if (i == index-1){
         walker.setNext(walker.getNext().getNext());  
         break;
        }
        walker = walker.getNext();
      }
    }
  }
}