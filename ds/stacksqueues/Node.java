public class Node{

  private int data;
  private Node next;

  // constructors
  
  public Node(){
    
  }

  public Node(int data){
    this.data = data;   
    this.next = null;
  }

  public Node(int value, Node next){
    this.data = value; 
    this.next = next; 
  }
  
  //getters 
  
  public int get(){
    return this.data;
  }

  public Node getNext(){
    return next; 
  }

  // setters 

  public void set(int data){
    this.data = data;
  }
  
  public void setNext(Node next){
    this.next = next; 
  }

  // String method 

  public String toString(){
    return "" + data + "->";
  }
  
}