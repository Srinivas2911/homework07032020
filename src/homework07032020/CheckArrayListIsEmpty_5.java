package homework07032020;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckArrayListIsEmpty_5 {      // class

    public static void main(String[] args) {        // main method static

        // object creation and instance method calling in static main method
        CheckArrayListIsEmpty_5 obj = new CheckArrayListIsEmpty_5();
        obj.myListArray();
    }

    public void myListArray() {                     // instance method

        // One array with elements in it
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"));
        System.out.println("Array List One : " + list1);                // print the list1 of elements
        System.out.println("Is the list empty ? " + list1.isEmpty());   // check if list is empty - must return false

        // Another array with no elements in empty
        ArrayList<String> list2 = new ArrayList<>();                    // no elements defined in array
        System.out.println("Array list Two : "+list2);                  // print list 2 with no elelments
        System.out.println("Is the list empty ? " + list2.isEmpty());   // check if list is empty - must return  true

    }

}