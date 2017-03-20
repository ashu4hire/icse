package pkg2017;
/**
 * Customer's Gift
 * Ashutosh
 * 190317v1
 */
import java.util.Scanner;
class c5p125q12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter quantity:");
        int q=sc.nextInt();
        System.out.print("Enter price/item:");
        double p=sc.nextDouble();
        double amt=q*p;
        System.out.println("Total amount=Rs."+amt);
        if(amt>=100 && amt<500)
            System.out.println("Your gift=A key ring");
        else if(amt>=500 && amt<1000)
            System.out.println("Your gift=A leather purse");
        else if(amt>=1000)
            System.out.println("Your gift=A pocket calculator");
        System.out.println("Thank you!");
    }
}