package pkg2017;

import java.util.Scanner;

/**The Great Train Robbery
 * Created by Ashu on 21-03-2017.
 */
class c5p129q24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter velocities of 2 trains(m):");
        int v1=sc.nextInt();
        int v2=sc.nextInt();
        System.out.println("Enter lengths of both trains(m):");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        System.out.println("Are the trains moving in same or different direction? Choose option");
        System.out.println("[1] Same direction");
        System.out.println("[2] Different direction");
        int di = sc.nextInt();
        int rv=0,time=0;
        switch (di)
        {
            case 1:
               rv=Math.abs(v1-v2);
               System.out.println("Relative velocity="+rv+" m/s");
               time=(l1+l2)/rv;
               System.out.println("Time taken to cross each-other="+time+" s");
               break;
            case 2:
               rv=v1+v2;
               System.out.println("Relative velocity="+rv+" m/s");
               time=(l1+l2)/rv;
               System.out.println("Time taken to cross each-other="+time+" s");
               break;
            default:
                System.out.println("Was there an accident?");
        }
    }
}