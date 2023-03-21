package java_week7;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Programme10_NumberUsingSymbol {
    public static void main(String[] args) //main method declare
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.print("Enter First Number : ");
        int a = scan.nextInt(); //store value which enter by user
        System.out.print("Enter Second Number : ");
        int b = scan.nextInt(); //store value which enter by user
        System.out.print("Enter any Symbol  '+' '-' '*' '/'  :  ");
        char c = scan.next().charAt(0); //store value which enter by user
        Programme10_NumberUsingSymbol obj = new Programme10_NumberUsingSymbol(); //instance obj created
        obj.symbol(a,b,c); //instance method call
        scan.close(); //scan close
    }
    public void symbol(int a,int b,char s) //instance method with argument
    {
        if(s=='+')
        {
            System.out.println("Addition of Two number is : " +(a+b)); //sum of two number if user enter +
        }
        else if(s=='-')
        {
            System.out.println("Subtraction of Two number is : " + (a-b)); //subtraction of two number if user enter -
        }
        else if(s=='*')
        {
            System.out.println("Multiplication of Two number is : " + (a*b)); //multiplication of two number if user enter *
        }
        else if(s=='/')
        {
            System.out.println("Division of Two number is : " + (a/b)); //division of two number if user enter /
        }
        else
        {
            System.out.println("Invalid Symbol"); //if enter any symbol not listed
        }
    }
}
