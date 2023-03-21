package java_week7;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array
 */
public class Programme17_ArrayOrString
{
    public static void main(String[] args) // declaring the main method
    {
        int n[] = {10,30,50,40,20}; // array declaration
        System.out.println(Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("Sorting of Numeric Array value is : " + Arrays.toString(n));
        Programme17_ArrayOrString obj = new Programme17_ArrayOrString();  // object created to call an instance method
        obj.sorting(); // calling an instance method
    }
    public void sorting() // declaring an istance method
    {
        String s[] = {"Ekta","Aesha","Jalpa","Angat","Vipul","Himanshu"}; // declaring a string array
        System.out.println("\n\n" + Arrays.toString(s));
        Arrays.sort(s); // pre-defined method to sort an array
        System.out.println("Numeric Array value is : " + Arrays.toString(s)); // output after the sorting
    }
}
