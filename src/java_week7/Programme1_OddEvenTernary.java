package java_week7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
public class Programme1_OddEvenTernary {
    public static void main(String[] args) // main method declared
    {
        Scanner scan = new Scanner(System.in); // scanner created
        System.out.print("Enter any number : ");
        int n = scan.nextInt(); //store value from user
        Programme1_OddEvenTernary obj = new Programme1_OddEvenTernary(); // object created for instance method
        obj.number(n); // instance method calling
        scan.close(); // scanner closed
    }
    public void number(int n) //instance method declared
    {
        String result = n%2==1 ? "Odd" : "Even";  // condition to check whether number is odd or even using ternary operator
        System.out.println("It is : " +result + " Number "); // display result of number
    }
}
