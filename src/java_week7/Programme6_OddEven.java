package java_week7;
/**
 * Write a java program to input any number and find out if it’s odd or even
 */

import java.util.Scanner;

public class Programme6_OddEven {
    public static void main(String[] args) //main method created
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter any number : ");
        int n = scan.nextInt(); //store value which enter by user
        Programme6_OddEven obj = new Programme6_OddEven(); //obj created for instance method
        obj.number(n); //instance method call
        scan.close(); //scanner closed
    }
    public void number(int n) //instance method with one parameter
    {
        if(n%2==0) //condition for check num is odd or even
            {
                System.out.println("It is Even Number"); //if condition ture print this statement
            }
        else
            {
                System.out.println("It is Odd Number"); //if condition false print this statement
            }
    }
}
