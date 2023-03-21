package java_week7;

/**
 * Write a Java program to test if an array contains a specific value
 */
public class Programme20_ContainSpecificValue
{
    public static void main(String[] args)
    {
        containValue(); // calling static method
    }
    public static void containValue() // declaring static method
    {
        int num[] = {10,20,30,40,50}; // declaring an array
        int contain = 30; // declare variable with assigning the value to it
        boolean b = false;
        // logic to check whether the array contains 20 or not
        for(int n : num) {
            if (n == contain) {
                b = true;
                break;
            }
        }
        if (b)
        {
            System.out.println("Value is found : " +contain); // output if this condition is true
        }
        else
        {
                System.out.println("value is not found : " + contain); // output if the condition is false
            }
        }
    }