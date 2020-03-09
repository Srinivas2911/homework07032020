package homework07032020;

import java.util.ArrayList;

public class CheckArrayListIsEmpty_5_Option2 {                // class

    public static void main(String[] args) {                // main method static
        // calling static method in main method directly with Class name.
        CheckArrayListIsEmpty_5_Option2.myArrayList();
    }

    public static void myArrayList(){                       // static method

        ArrayList<String> list = new ArrayList<>();   // defined a Array list
        System.out.println("Array List : " + list);    // print array List
        System.out.println("Is the list empty ? " + list.isEmpty());     // must return true

        list.add("Red");                        // add an element to the list
        list.add("Yellow");                     // add another element to the list
        list.add("Green");                      // add aanother element
        System.out.println("Array List :" + list);  // print array list
        System.out.println("Is the list empty ? " + list.isEmpty());     //must return false

        list.clear();                           // clear all elements
        System.out.println("Array List :" + list);      // print array list
        System.out.println("Is the list empty ?"+ list.isEmpty());     // must return true

    }
}
