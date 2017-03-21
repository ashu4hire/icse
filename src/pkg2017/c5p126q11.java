package pkg2017;

import java.util.Scanner;

/**Library fine
 * Created by Ashu on 21-03-2017.
 */
class c5p126q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of days:");
        int n=sc.nextInt();
        double fine;
        if(n<=5)
            fine=n*40;
        else if(n>5 && n<=10)
            fine=5*40+(n-5)*65;
        else
            fine=5*40+5*65+(n-10)*80;
        fine/=100;
        System.out.println("Fine=Rs."+fine);
    }
}