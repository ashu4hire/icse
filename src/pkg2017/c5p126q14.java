package pkg2017;

import java.util.Scanner;

/**
 * Gross salary
 * Created by Ashu on 21-03-2017.
 */
class c5p126q14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee no:");
        int en = sc.nextInt();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.print("Enter basic salary");
        int basic = sc.nextInt();
        System.out.print("Is the emplyee male or female(M/F):");
        String type=sc.next();
        int da=basic*22/100;
        double hra=basic*40/100;
        double pf=basic*12/100;
        double epf=basic*2/100;
        double gross=basic+da+hra;
        double net=gross-(pf+epf);
        System.out.println("---EMPLOYEE DETAILS---");
        System.out.println("Number="+en);
        System.out.println("Age="+age);
        System.out.println("Gross Salary="+gross);
        System.out.println("Net Salary="+net);
        if((type=="M"||type=="m") && (gross<=250000))
            System.out.println("Not an income tax payer!");
        else if((type=="F"||type=="f") && (gross<=300000))
            System.out.println("Not an income tax payer!");
        else
            System.out.println("Income tax payer!");
    }
}