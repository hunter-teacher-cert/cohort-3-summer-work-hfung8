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

System.out.println("==================================================================");	

ArrayList<Integer> a= ss.buildIncreasingList(20);
	System.out.println(a);

System.out.println("first list ==================================================================");
      
	// build a second Arralist here
	ArrayList<Integer> b = ss.buildIncreasingList(30);
  System.out.println(b);

System.out.println("second list ==================================================================");
      
	// test your merge routine here

ArrayList<Integer> c = ss.merge(a,b);
  System.out.println(c);

System.out.println("merged list ==================================================================");

    int size1 = 1000;
    ArrayList<Integer> test = new ArrayList<Integer>();
    Random r = new Random();
    for (int k=0;k<size1;k++){
        test.add(r.nextInt(20));
    }
		//Setting up timing test
    // long start, elapsed;
    long total = 0;

    // looping over the mergeSort function to determine average
    for (int j = 0; j < 1000; j++){
      start = System.currentTimeMillis();
      ArrayList<Integer> merged = ss.mergeSort(test);
      elapsed = System.currentTimeMillis() - start;
      total += elapsed;
    }
    
    
    System.out.println("Average time to sort list of size " + size + ": " + (total / 1000) + "ms");

  }
}