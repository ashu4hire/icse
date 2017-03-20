package pkg2017;
import java.util.Scanner;
class c5p125q3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What was the price?");
        double p=sc.nextDouble();
        double d1,d2,d21,d22;
        d1=p*30/100;
        d21=p*20/100;
        d22=(p-d21)*10/100;
        d2=d21+d22;
        if(d1>d2)
            System.out.println("You should buy with first discount option!");
        else if(d2>d1)
            System.out.println("You should buy with second discount option!");
        else
            System.out.println("Discount is same! Choose any option!");
    }
}
    