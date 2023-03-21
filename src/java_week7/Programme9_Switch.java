package java_week7;

import java.util.Scanner;

/**
 * Using Switch Statement
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class Programme9_Switch {
    public static void main(String[] args) // main method
    {
        Scanner scan = new Scanner(System.in); // scanner created
        System.out.println("Input any Uppercase alphabet from 'A' to 'F' : ");
        char alpha = scan.next().charAt(0); // value store from user
        city(alpha); //static method calling
        scan.close(); // scanner close
    }
    public static void city(char a) //static method created
    {
        switch (a)
        {
            case 'A':
                System.out.println("Amsterdam"); //if user enter A
                break;
            case 'B':
                System.out.println("Berlin"); //if user enter B
                break;
            case 'C':
                System.out.println("Camden"); //if user enter C
                break;
            case 'D':
                System.out.println("Dublin"); //if user enter D
                break;
            case 'E':
                System.out.println("Elephant & Castle"); //if user enter E
                break;
            case 'F':
                System.out.println("Feltham"); //if user enter F
                break;
            default:
                System.out.println("Invalid Input"); //if invalid value
        }
    }
}
