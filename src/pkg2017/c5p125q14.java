package pkg2017;
/**
 * Income Tax
 * Ashutosh
 * 190317v1
 */
import java.util.Scanner;
class c5p125q14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is the annual salary?");
        double as=sc.nextDouble();
        double tax;
        if(as<=100000)
            tax=0;
        else if(as>100000 && as<=150000)
            tax=(as-100000)*10/100;
        else if(as>150000 && as<=250000)
            tax=5000+(as-150000)*20/100;
        else
            tax=25000+(as-250000)*30/100;
        System.out.println("Income Tax=Rs."+tax);
    }
}