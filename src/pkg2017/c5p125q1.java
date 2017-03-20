package pkg2017;
import java.util.Scanner;
class c5p125q1
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal:");
        double p=sc.nextDouble();
        int r=5;
        int t=1;
        double i1,i2,i3;
        i1=p*r*t/100;
        p=p+i1;
        i2=p*r*t/100;
        p=p+i2;
        i3=p*r*t/100;
        System.out.println("Interest after 1st year="+i1);
        System.out.println("Interest after 2nd year="+i2);
        System.out.println("Interest after 3rd year="+i3);
    }
}
    