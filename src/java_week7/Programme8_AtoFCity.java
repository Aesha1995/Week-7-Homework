package java_week7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme8_AtoFCity {
    public static void main(String[] args)
    {
        Programme8_AtoFCity obj = new Programme8_AtoFCity(); //obj for instance method
        obj.city(); //instance method call
    }
    public void city() //instance method declared
    {
        Scanner scan = new Scanner(System.in); // scanner created
        System.out.println("Input any alphabet from A to F :");
        char alphabet = scan.next().charAt(0); //store value from user
        if (alphabet=='A' || alphabet=='a')
        {
            System.out.println("Amsterdam"); //if user enter A or a
        }
        else if (alphabet=='B' || alphabet=='b')
        {
            System.out.println("Berlin"); //if user enter B or b
        }
        else if (alphabet=='C' || alphabet=='c')
        {
            System.out.println("Camden"); //if user enter C or c
        }
        else if (alphabet=='D' || alphabet=='d')
        {
            System.out.println("Dublin");//if user enter D or d
        }
        else if (alphabet=='E' || alphabet=='e')
        {
            System.out.println("Elephant & Castle"); //if user enter E or e
        }
        else if (alphabet=='F' || alphabet=='f')
        {
            System.out.println("Feltham"); //if user enter F or f
        }
        else
        {
            System.out.println("Invalid Entry"); ////if user enter any invalid letter
        }
        scan.close(); //scanner close
    }
}
