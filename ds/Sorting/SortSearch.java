import java.io.*;
import java.util.*;

/*
Sort Project:
Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.
  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.
  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.
Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(100));
	}
	
    }
    
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(100));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end
      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
	    int smallIndex = start;
      for (int i = start; i < data.size(); i++){
        // i holds the smaller value so we make smallIndex equal to it
        if (data.get(smallIndex) > data.get(i)){
          smallIndex = i; 
        }
      }
      return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.
       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
	 
       
    */
    public void sort(){
    for (int i = 0; i < data.size()-1; i++){
      int temp = i;
      for (int j = i + 1; j < data.size(); j++){
        if (data.get(j) < data.get(temp)){
          temp = j;
        }
      }
      int minVal = data.get(temp);
      data.set(temp, data.get(i));
      data.set(i, minVal);
    }
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.
       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.
       This algorithm works on any ArrayList.
    */
  public int linearSearch(int value)
  {
    int i = 0;
	  for (i=0;i<data.size();i++){
	    if (data.get(i)==value)
		  return i;
	  }
	return -1;
  }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
  public int binarySearch(int value)
  {
  	// create assign variables  representing the high, low and middle indices 
  	// while we're not done:
  	//   if the item is at data.get(middle), return middle
  	//   otherwise, update high, low, and middle
    int low, mid, high;
    //in case data.size() is an odd number, we will use the floor function to keep it       as an integer
    //initializing low, mid, and high
    low = 0;
    high = data.size();
    while (low <= high)
    {
    mid = (low + high)/2;
      //if value is less than data.get(mid), then we need to move one unit to the left
      if (value == data.get(mid))
      {
        return mid;
      }
      else if (value < data.get(mid))
      {
        high = mid - 1;
        // mid = (low + high)/2;
      }
      else
      {
        low = mid + 1;
        // mid = (low + high)/2;
      }
    }
    return -1;
  }
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

  public int binarySearchRecursive(int value, int lowIndex, int highIndex)
  {
    int mid = (lowIndex + highIndex)/2;

    //if value is less than data.get(mid), then we need to move one unit to the left
    if (lowIndex > highIndex)
    {
      return -1;
    }

    if (value == data.get(mid))
    {
      return mid;
    }
    else if (value < data.get(mid))
    {
      // high = mid - 1;
      // mid = (lowIndex + highIndex)/2;
      return binarySearchRecursive(value, 0, mid-1);
    }
    //the case if it is greater than
    else
    {
      return binarySearchRecursive(value, mid+1, highIndex);
    }
  	// return 0;  
  }
    
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    
    /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
	ArrayList<Integer>  newlist = new ArrayList<Integer>();
	Random r = new Random();
	int nextval = r.nextInt(20)+1;
	for (int i=0;i<size;i++){
	    newlist.add(nextval);
	    nextval = nextval + r.nextInt(20);
	}

	return newlist;
	}

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */
       
    public static ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){

	// code for merge
  // compare first element in list1 and list2
  ArrayList<Integer> arraymerged = new ArrayList<Integer>();
    while (list1.size() != 0 && list2.size() != 0){
    if (list1.get(0) < list2.get(0)){
      arraymerged.add(list1.get(0));
      list1.remove(0);
    }
    else {
      arraymerged.add(list2.get(0));
      list2.remove(0);
    }
  }
  while (list1.size() > 0){
    arraymerged.add(list1.get(0));
    list1.remove(0);
  } 
  while (list2.size() > 0){    
    arraymerged.add(list2.get(0));
    list2.remove(0);
  }    
	
	return arraymerged; // replace this line
  }

  public static ArrayList<Integer> mergeSort(ArrayList<Integer> list){
  // check the size if it is smaller than 2 than return the list, if not then we sort using mergeSort recursively
    if (list.size() < 2){
      return list;
    } else {//Split the list
      ArrayList<Integer> left = new ArrayList<Integer>();
      ArrayList<Integer> right = new ArrayList<Integer>();
      // fill the first list with the first half
      for (int i = 0; i < list.size()/2; i++){
        left.add(list.get(i));
      }
      for (int j = list.size()/2; j < list.size(); j++){
        right.add(list.get(j));
      }
      //call mergeSort recursively and merge using merge
      left = mergeSort(left);
      right = mergeSort(right);
      //Call the merge function that takes in two lists
      return merge(left, right);
    }
  }
}