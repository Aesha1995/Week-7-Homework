package java_week7;

import java.util.Scanner;

/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 * If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year. Both of type
 * int.
 * If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month. Be careful about leap years
 * they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 * Example of input/Output:
 * ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
 * ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
 *  year.
 * ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
 *  2018 is not a leap year.
 * ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
 * ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to
 *  9999
 * HINT: Use the switch statement.
 * NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */
public class Programme4_NumberOfDaysMonth {
    public static void main(String[] args)  //main method declared
    {
        Scanner scan = new Scanner(System.in); //scanner created for taking value from user
        System.out.print("Enter any Year : ");
        int n = scan.nextInt(); // value store which enter by used
        isLeapYear(n); // static method calling in main method
        System.out.print("Enter Any Month : ");
        int m = scan.nextInt(); // value store which enter by used
        getDaysInMonth(m, n); // static method calling in main method
    }

    public static void isLeapYear(int year)  //static method create with passing one parameter
    {
        if (year >= 1 && year <= 9999)  //condition check for year
        {                                               //if pass execute second statement
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) //condition check for year whether is leap year or not
            {
                System.out.println(year + "It is Leap year"); //condition ture execute this print statment
            } else {
                System.out.println(year + "It is not Leap Year"); // if condition false
            }                                                   // second condition finished
        }
        else {
            System.out.println(year + "Invalid Entry");         // if first condition false
        }
    }

    public static void getDaysInMonth(int month, int year)  //static method created
    {
        if (month > 1 && month < 12) // check month should be greater than 1 or less than 12
        {
            if (year > 1 || year < 9999) // check year should be greater than 1 or less than 9999
            {
                switch (month) //if both condition true execute switch case
                {
                    case 1:
                        System.out.println(" 31 Days in January  " + year); //if user enter month 1 execute this print statement
                        break;
                    case 2:                                                 //if user enter month 2 execute this print statement
                        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //check whether it's leap year or not
                        {
                            System.out.println("29 Days in February " + year); //if its leap year print 29 days
                        } else {
                            System.out.println("28 Days in February " + year);  //if its not leap year print 29 days
                        }
                        break;
                    case 3:
                        System.out.println(" 31 Days in March " + year); //if user enter month 3 execute this print statement
                        break;
                    case 4:
                        System.out.println(" 30 Days in April " + year); //if user enter month 4 execute this print statement
                        break;
                    case 5:
                        System.out.println(" 31 Days in May " + year); //if user enter month 5 execute this print statement
                        break;
                    case 6:
                        System.out.println(" 30 Days in June " + year); //if user enter month 6 execute this print statement
                        break;
                    case 7:
                        System.out.println(" 31 Days in July " + year); //if user enter month 7 execute this print statement
                        break;
                    case 8:
                        System.out.println(" 31 Days in August " + year); //if user enter month 8 execute this print statement
                        break;
                    case 9:
                        System.out.println(" 30 Days in September " + year);//if user enter month 9 execute this print statement
                        break;
                    case 10:
                        System.out.println(" 31 Days in October " + year); //if user enter month 10 execute this print statement
                        break;
                    case 11:
                        System.out.println(" 30 Days in November " + year);//if user enter month 11 execute this print statement
                        break;
                    case 12:
                        System.out.println(" 31 Days in December " + year); //if user enter month 12 execute this print statement
                        break;
                    default:
                        System.out.println("Enter Valid month number between 1 to 12 "); //print error message if it not between 1 to 12
                }
            } else
            {
                System.out.println("-1"); //if year is not valid
            }

        } else {
            System.out.println("-1"); //if month is not valid
        }
    }
}






