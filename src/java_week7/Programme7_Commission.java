package java_week7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Programme7_Commission {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //scanner object created
        System.out.println("Enter Sales ID : ");
        int salesId = scan.nextInt(); //store salesId taken from user
        System.out.println("Enter Seller Name : ");
        String sellerName = scan.next(); //store sellerName taken from user
        System.out.println("Enter Sales Amount : ");
        float salesAmount = scan.nextFloat(); //store salesAmount taken from user
        System.out.println("Enter Basic Salary : ");
        float basicSalary = scan.nextFloat(); //store basic taken from user
        Programme7_Commission obj = new Programme7_Commission(); //obj created for instance method
        obj.commission(salesId,sellerName,salesAmount,basicSalary); //instance method calling
        scan.close();
    }
    public void commission(int salesId, String sellerName, float salesAmount, float basicSalary)
    {
        double commission;
        if (salesAmount>=50000) //condition for counting commission
        {
            commission = (basicSalary*35)/100;
            System.out.println("Commission = " +commission); // output if this condition is true
        }
        else if (salesAmount>=30000 && salesAmount<50000)
        {
            commission = (basicSalary*20)/100;
            System.out.println("Commission = " +commission); // output if this condition is true
        }
        else if (salesAmount>=20000 && salesAmount<30000)
        {
            commission = (basicSalary*10)/100;
            System.out.println("Commission = " +commission); // output if this condition is true
        }
        else if (salesAmount>=10000 && salesAmount<20000)
        {
            commission = (basicSalary*5)/100;
            System.out.println("Commission = " +commission); // output if this condition is true
        }
        else
        {
            commission = (basicSalary*2)/100;
            System.out.println("Commission = " +commission); // output if this condition is false
        }
    }

}
