import java.io.*;
import java.util.*;

/** Methods to write
Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)
Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)
Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    ArrayList<Integer> a = new ArrayList<Integer>();
    Random r = new Random();
    for (int i = 0; i < size; i++){
      a.add(r.nextInt(maxval));
    }
    return a;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int sumArray = 0;
    for (int i = 0; i < dataList.size(); i++){
      sumArray += dataList.get(i);
    }
    return sumArray;//placeholder to compile.
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){
    // get the first and second values at indices
    int firstNum = dataList.get(index1);
    int secondNum = dataList.get(index2);
    // swap the values of firstNum and secondNum by using set
    dataList.set(index1, secondNum);
    dataList.set(index2, firstNum);
  }

  /**
  Parameters:
  - dataList - an AraryList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    Integer temp = new Integer(valueToRemove);
    for (int i = 0; i < dataList.size(); i++){
      dataList.remove(temp);
    }
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    int sizeOfArray = ListA.size();
    ArrayList<Integer> a = new ArrayList<Integer>(sizeOfArray);
    // for loop to loop through both of the ArrayLists
    for (int i = 0; i < sizeOfArray; i++){
      int firstNum = ListA.get(i);
      int secondNum = ListB.get(i);
      int sum = firstNum + secondNum;
      a.add(i, sum);
    }
    return a;//placeholder to compile.
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    
    return null;//placeholder to compile.
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;

    // Uncomment these to test buildRandomList
    al = buildRandomList(10,100);
    System.out.println(al);
    int t = sumOfList(al);
    System.out.println(t);
    // Uncomment these to test swapElements
    swapElements(al, 2,6);
    System.out.println(al);

    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al);
    removeValue(al,5);
    System.out.println(al);
    System.out.println("++++++++++++++++++++++++++");
    ArrayList<Integer> bl; 
    bl = buildRandomList(10,100);
    System.out.println(bl);
    System.out.println("+++++++++++++++++++++++++");
    ArrayList<Integer> cl;
    cl = sumLists(al, bl);
    System.out.println(cl);
  }

}