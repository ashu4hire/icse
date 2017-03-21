package pkg2017;

import java.util.Scanner;

/**Salary
 * Created by Ashu on 21-03-2017.
 */
class c5p127q16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary:");
        double basic=sc.nextDouble();
        double da,sa,gross;
        if(basic<=10000)
        {
            da=basic*15/100;
            sa=basic*5/100;
        }
        else if(basic>10000 && basic<=20000)
        {
            da=basic*20/100;
            sa=basic*8/100;
        }
        else if(basic>20000 && basic<=30000)
        {
            da=basic*25/100;
            sa=basic*10/100;
        }
        else
        {
            da=basic*30/100;
            sa=basic*12/100;
        }
        gross=basic+da+sa;
        System.out.println("Basic\tDA\tSA\tGross");
        System.out.println(basic+"\t"+da+"\t"+sa+"\t"+gross);
    }
}