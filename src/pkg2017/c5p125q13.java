package pkg2017;
/**
 * Library fine
 * Ashutosh
 * 190317v1
 */
import java.util.Scanner;
class c5p125q13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many days late, was the book returned?");
        int nd=sc.nextInt();
        double fn=0;
        if(nd<=5)
            fn=nd*40;
        else if(nd>5 && nd<=10)
            fn=5*40+(nd-5)*65;
        else
            fn=5*40+5*65+(nd-10)*80;
        fn/=100;
        System.out.println("Fine=Rs."+fn);
    }
}