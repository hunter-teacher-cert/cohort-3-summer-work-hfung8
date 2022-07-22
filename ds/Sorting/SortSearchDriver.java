import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {

  int size = 1000;
	// Uncomment these to test part 1
	
	SortSearch ss = new SortSearch(size);

long start,elapsed;

	// start = System.currentTimeMillis();
	// ss.sort();

	// // System.out.println(ss);
	// elapsed = System.currentTimeMillis() - start;
	// System.out.println("Size: " + size + " Time: " + elapsed);



      
	System.out.println(ss);
System.out.println("==================================================================");
		
	// Uncomment these to test part 2

	int i;
	i = ss.findSmallestIndex(0);
	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss); System.out.println("==================================================================");
	i = ss.findSmallestIndex(2);
	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
System.out.println("==================================================================");	
	// Uncomment these to test part 3

	System.out.println(ss);
	ss.sort();
	System.out.println(ss);
  start = System.currentTimeMillis();
System.out.println("==================================================================");	
  System.out.println(ss);
  System.out.println(ss.linearSearch(0));
  System.out.println(ss.linearSearch(10));
	System.out.println(ss.linearSearch(21));
      
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);

 start = System.currentTimeMillis();
System.out.println("==================================================================");	

  System.out.println(ss); 
  System.out.println(ss.binarySearch(0));
  System.out.println(ss.binarySearch(10));
  System.out.println(ss.binarySearch(21));

	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);

   start = System.currentTimeMillis();  
System.out.println("==================================================================");	
  System.out.println(ss);
  System.out.println(ss.binarySearchRecursive(0,0,19));
  System.out.println(ss.binarySearchRecursive(10,0,19));
  System.out.println(ss.binarySearchRecursive(21,0,19));
      
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);
  }
}