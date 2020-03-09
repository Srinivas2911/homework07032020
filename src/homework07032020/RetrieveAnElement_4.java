package homework07032020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RetrieveAnElement_4 {
    /* 4. Write a Java program to retrieve an element (at a specified index)
    from a given array list*/

    public static void main(String[] args) {  // main method static
        // list of the array
        ArrayList<String> list_Strings = new ArrayList<>(Arrays.asList("Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"));
        System.out.println("List of the array : "+ list_Strings); // print the list of array
        int i;                              // defining int i for the index nos.
        Scanner scan = new Scanner(System.in);
        System.out.println("Input index no : ");        // user input
        i = scan.nextInt();                         // no of the index to retrieve an item

        String element = list_Strings.get(i);       // retrieving the element at index i;
        System.out.println("Element at index "+ i+ " is : "+element);  // print the element

       /* Alternate way of calling the element at index
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);
*/
    }
}
