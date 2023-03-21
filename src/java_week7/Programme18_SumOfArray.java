package java_week7;

/**
 * Write a Java program to sum values of an array
 */
public class Programme18_SumOfArray {
    public static void main(String[] args)
    {
        Programme18_SumOfArray obj = new Programme18_SumOfArray(); // object created to call an instance method
        obj.sum(); // calling an instance
    }
    public void sum() // declaring an instance method
    {
        int total=0; // declaring a variable
        int a[] = {10,20,30}; // declaring a single dimensional array
        // logic to calculate the sum of an array
        for(int i=0; i<a.length; i++)
        {
            total = total + a[i];
            //System.out.println("sum of array : " +sum);
        }
        System.out.println("Sum of Array Elements are : " +total); // output the sum of an array
    }
}
