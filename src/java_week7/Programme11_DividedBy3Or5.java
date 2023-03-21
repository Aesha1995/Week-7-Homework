package java_week7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately
 */
public class Programme11_DividedBy3Or5 {
    static int i;
    public static void main(String[] args) //main method created
    {
        System.out.println("Valve divided by 3 : ");
        three(); //static method calling
        System.out.println("\n\n\nValve divided by 5 : ");
        Programme11_DividedBy3Or5 obj = new Programme11_DividedBy3Or5(); //obj created for instance method
        obj.five(); //instance method calling
    }
    public static void three() //static method calling
    {
        //logic for division of 3 number
        for (i=1;i<=100;i++)
        {
            if(i%3==0) //if its true loop execute till the upper condition fulfill
            {
                System.out.print(i +" ");
            }
        }
    }
    public void five()
    {
        ////logic for division of 5 number
        for(i=1;i<=100;i++)
        {
            if(i%5==0) //if its true loop execute till the upper condition fulfill
            {
                System.out.print(i +" ");
            }
        }
    }
}
