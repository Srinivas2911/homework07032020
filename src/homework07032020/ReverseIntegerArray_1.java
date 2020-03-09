package homework07032020;

import java.util.Scanner;

public class ReverseIntegerArray_1 {
    //1. Write a Java program to reverse an array of integer values.

    public static void main(String[] args) {    //main method
        ReverseIntegerArray_1 obj = new ReverseIntegerArray_1(); // object creation
        obj.myReverseArray();                   //  instance method calling thru object
    }

    public void myReverseArray() {              // instance method myReverseArray defined.

        int n;                                  // no of elements in the array or length of array
        int i;                                  // index for the array

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        n = scan.nextInt();                     // user input for no. of items(n) in the array or length of the array
        int array[] = new int[n];               // new array defined for no of elements in original array

        System.out.println("Enter the " + n + " elements ");    // print statement for the no. of items in array
        for (i = 0; i < n; i++) {               // for loop condition for original array, items listed in sequence.
            array[i] = scan.nextInt();          // user input for 'n' no. of the array elements one by one for original array.
        }
        System.out.println("Reverse of an array is :");     // print statement for reverse of the array
        for (i = n - 1; i >= 0; i--) {                      /* for loop condition for display of reverse of array
                                                             for i reducing */
            System.out.println(array[i]);                   // print  the reverse of the array
        }
    }
}