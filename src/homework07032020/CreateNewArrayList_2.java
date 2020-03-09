package homework07032020;

import java.util.ArrayList;

public class CreateNewArrayList_2 {                 // class
    //2. Write a Java program to create a new array list, add some colours (string) and printout the collection.

    public static void main(String[] args) {        // main method static

        // object creation of class and calling instance method in static main method
        CreateNewArrayList_2 obj = new CreateNewArrayList_2();
        obj.myCreateNewArrayList();
    }

    public void myCreateNewArrayList() {            // instance method

        // Creating a string Array List and adding Colours to it
        ArrayList<String> create_List = new ArrayList<String>();
        System.out.println("Colours of the rainbow in Array :"); // print statement
        create_List.add("Violet");       // add string name Violet
        create_List.add("Indigo");       // add string name Indigo
        create_List.add("Blue");         // add string name Blue
        create_List.add("Green");        // add string name Green
        create_List.add("Yellow");       // add string name Yellow
        create_List.add("Orange");       // add string name Orange
        create_List.add("Red");          // add string name Red
        System.out.println(create_List); // print the array list
    }

}
