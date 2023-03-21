package java_week7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Programme19_AverageOfArray {
    public static void main(String[] args)
    {
        average(); // calling static method
    }
    public static void average() // declaring static method
    {
        int total=0; // declaring the variable with assigning the value
        int avg=0; // declaring the variable with assigning the value
        int a[] = {10,20,30,40,50,60}; // declaring single dimensional array
        // logic to find an average of an array
        for(int i=0; i<a.length; i++)
        {
            total = (total + a[i]);
            avg = total/a.length;
        }
        System.out.println("Average of Array Elements are : " +avg); //average output
    }
}