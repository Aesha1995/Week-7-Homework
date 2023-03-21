package java_week7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Programme12_AlphaOrSymbol {
    public static void main(String[] args) //main method declared
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.println("Enter any input from keyboard : ");
        char a = scan.next().charAt(0); //value store which taken from user
        Programme12_AlphaOrSymbol obj = new Programme12_AlphaOrSymbol(); //obj for instance method
        obj.alpha(a); //instance method calling
        scan.close(); //scanner close
    }
    public void alpha(char x) //instance method with one parameter
    {
        if((x>='a' && x<='z') || (x>='A' && x<='Z')) //condition check if it is A to Z or not
            {
                System.out.println("It is an Alphabet");
            }
        else if (x>='0' && x<='9') //condition check if it is 0 to 9 or not
        {
                System.out.println("It is Number");
            }
        else
            {
                System.out.println("It is a Symbol"); //anything which is not in A to Z and 0 to 9
            }
    }
}
