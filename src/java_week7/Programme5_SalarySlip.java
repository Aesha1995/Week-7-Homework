package java_week7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================
 */
public class Programme5_SalarySlip {
    public static void main(String[] args) // main method declared
    {
        Scanner scan = new Scanner(System.in);  //scanner created
        System.out.print("Enter Employee ID : ");
        int id = scan.nextInt(); // store employee id which enter by user
        System.out.print("Enter Employee Name : ");
        String name = scan.next(); // store employee name which enter by user
        System.out.print("Enter Basic Salary : ");
        float basicSalary = scan.nextFloat(); // store salary which enter by user
        Programme5_SalarySlip obj = new Programme5_SalarySlip(); //object created for calling instance method
        obj.salary(id,name,basicSalary); //instance method calling
        scan.close(); //sacnner closed
    }
    public void salary(int id,String name,float basicSalary) //instance method created with passing 2 parameters
    {
        float hra = (basicSalary*10)/100; //calculate HRA
        float ta = (basicSalary*8)/100; //calculate TA
        float da = (basicSalary*9)/100; //calculate DA
        float pf = (basicSalary*20)/100; //calculate PF
        float gross = (basicSalary+hra+ta+da)-pf; //calculate Gross salary
        System.out.println("-------------------------------");
        System.out.println("|       Salary Slip             |");
        System.out.println("|_______________________________|");
        System.out.println("|Employee Id   :  "+id    +"              |");
        System.out.println("|Employee Name :  "+name  +"          |");
        System.out.println("|_______________________________|");
        System.out.println("|Basic Salary :  "+basicSalary+"        |");
        System.out.println("|HRA 10%      :  "+hra   +"         |");
        System.out.println("|TA 8%        :  "+ta    +"          |");
        System.out.println("|DA 9%        :  "+da    +"          |");
        System.out.println("|PF 20%       :  "+pf    +"         |");
        System.out.println("|_______________________________|");
        System.out.println("|Gross Salary :  "+gross +"        |");
        System.out.println("|_______________________________|");
    }
}
