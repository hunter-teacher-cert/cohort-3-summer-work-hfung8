import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("a");
    l.add("b");
    l.add("c");
    l.add("d");
    l.add(1, "z");
    l.add(0, "j");
    String[] p = l.toArray();
    System.out.println(l);
    for (int i = 0; i < p.length; i++){
      System.out.println(p[i]);
    }
    // System.out.println(p);
    int index = l.indexOf("k");
    // int j = l.size();
    System.out.println(index);
  }
}