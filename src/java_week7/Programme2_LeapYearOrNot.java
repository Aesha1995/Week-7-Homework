package java_week7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme2_LeapYearOrNot {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.println("Enter any Year : "); //
        int n = scan.nextInt(); //store value given from user
        Programme2_LeapYearOrNot obj = new Programme2_LeapYearOrNot(); //object  obj created to call the instance method
        obj.year(n); //method calling
        scan.close(); //scanner closed
    }
    public void year(int n) // declaring instance method
    {
        if (n%4==0 || n%100==0) //check whether entered year is leap year or not
            {
                System.out.println("It is Leap year"); //print if condition true
            }
        else
            {
                System.out.println("It is not leap year "); //print if condition false
            }
    }
}
