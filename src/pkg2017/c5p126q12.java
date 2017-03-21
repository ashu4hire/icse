package pkg2017;

import java.util.Scanner;

/**
 * Income Tax
 * Created by Ashu on 21-03-2017.
 */
class c5p126q12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter annual salary:");
        double sal=sc.nextDouble();
        double tax;
        if(sal<=250000)
            tax=0;
        else if(sal>250000 && sal<=500000)
            tax=(sal-250000)*10/100;
        else if(sal>500000 && sal<=1000000)
            tax=10000+(sal-500000)*20/100;
        else
            tax=25000+(sal-1000000)*30/100;
        System.out.println("Tax="+tax);
    }
}