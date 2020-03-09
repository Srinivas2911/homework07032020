package homework07032020;

import java.util.ArrayList;

public class IterateThruArrayList_3 {
    //3. Write a Java program to iterate through all elements in a array list.

    public static void main(String[] args) {

        IterateThruArrayList_3.myIterateArrayList();
    }

    public static void myIterateArrayList() {

        // Creating the list of array :
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Colours of the rainbow in Array :"); // print statement
        list.add("Violet");       // add string name Violet
        list.add("Indigo");       // add string name Indigo
        list.add("Blue");         // add string name Blue
        list.add("Green");        // add string name Green
        list.add("Yellow");       // add string name Yellow
        list.add("Orange");       // add string name Orange
        list.add("Red");          // add string name Red
        System.out.println(list); // print the list

        // Print the list in iteration
        System.out.println("Print the list of elements in the array :");
        for (String element :list) {  // for condition for printing from the list
             System.out.println(element);
        }
    }
}