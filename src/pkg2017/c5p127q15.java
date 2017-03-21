package pkg2017;

import java.util.Scanner;

/**TDS
 * Created by Ashu on 21-03-2017.
 */
class c5p127q15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter values of sum, age and term:");
        double sum=sc.nextDouble();
        int age = sc.nextInt();
        int term = sc.nextInt();
        double in,am;
        if(age<60)
        {
            if(term<=1)
                in=sum*7.5/100;
            else if(term>1 && term<=2)
                in=sum*8.5/100;
            else if(term>2 && term<=3)
                in=sum*9.5/100;
            else
                in=sum*10/100;
        }
        else
        {
            if(term<=1)
                in=sum*8/100;
            else if(term>1 && term<=2)
                in=sum*9/100;
            else if(term>2 && term<=3)
                in=sum*10/100;
            else
                in=sum*11/100;
        }
        am=sum+in;
        System.out.println("Amount\tTerm\tAge\tInterest\tAmount");
        System.out.println(sum+"\t"+term+"\t"+age+"\t"+in+"\t"+am);
    }
}