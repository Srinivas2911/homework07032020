package homework07032020;

import java.util.ArrayList;
import java.util.Arrays;

public class IterateThruArrayList_3_2ndOption {     // Class

    //3. Write a Java program to iterate through all elements in a array list.
    // 2nd Option & 3rd Option

    public static void main(String[] args) {        // Main method static
    // object creation and instance method calling in sttic main method
       IterateThruArrayList_3_2ndOption obj = new IterateThruArrayList_3_2ndOption();
       obj.myIterateArrayList_Opt2();
    }

    public void myIterateArrayList_Opt2() {       // Array list method

        // Array list defined
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Violet", "Indigo", "Blue", "Green", "Yellow", "Orange", "Red"));

        // Print the list of elements in the iteration

        System.out.println("Iterate the list of elements in the array :");

        for (String element :list) {  // for loop condition for printing each element from the list
            System.out.println(element);        // print each element
        }
           /* Another method to iterate is to create an object the list

           Iterator obj = list.iterator();
            //use hasNext() and next() methods of Iterator to iterate through the elements
            System.out.println("Iterating through ArrayList elements...");
            while (obj.hasNext())
                System.out.println(obj.next());*/
        }
    }


