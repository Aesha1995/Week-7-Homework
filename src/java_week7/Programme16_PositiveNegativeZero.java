package java_week7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16_PositiveNegativeZero {
    public static void main(String[] args) //main method created
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.println("Enter Number : ");
        int n = scan.nextInt(); // store value which enter by user
        Programme16_PositiveNegativeZero obj = new Programme16_PositiveNegativeZero(); //obj created for instance method
        obj.number(n); //instance method calling
        scan.close(); //scanner close
    }
    public void number(int n) //instance method created
    {
        if (n>0) //if number greater than 0
        {
            System.out.println("It is Positive number"); //display message for positive number
        }
        if (n<0) //if number less than 0
        {
            System.out.println("It is Negative number"); //display message for negative number
        }
        if (n==0) //if number equals 0
        {
            System.out.println("It is zero"); //display message for number which is equals to 0
        }
    }
}
