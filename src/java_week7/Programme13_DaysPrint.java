package java_week7;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13_DaysPrint {
    public static void main(String[] args) //main method declared
    {
        Scanner scan = new Scanner(System.in); //scanner created
        System.out.println("Enter any Number between 1 to 7 : ");
        int a = scan.nextInt(); //store value which enter by user
        days(a); //static method calling
        scan.close(); //scanner closed
    }
    public static void days(int a) //static method created
    {
        //using to print according to user input
        switch (a)
        {
            case 1:
                System.out.println("Monday"); //if user enter 1 print monday
                break;
            case 2:
                System.out.println("Tuesday"); //if user enter 2 print tuesday
                break;
            case 3:
                System.out.println("Wednesday"); //if user enter 3 print wednesday
                break;
            case 4:
                System.out.println("Thursday"); //if user enter 4 print thursday
                break;
            case 5:
                System.out.println("Friday"); //if user enter 5 print friday
                break;
            case 6:
                System.out.println("Saturday"); //if user enter 6 print saturday
                break;
            case 7:
                System.out.println("Sunday"); //if user enter 7 print sunday
                break;
            default:
                System.out.println("Week contains 1 to 7 Days"); //if number not in range from 1 to 7 error message display
        }

    }

}
