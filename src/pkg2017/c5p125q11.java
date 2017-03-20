package pkg2017;
/**
 * Water Tax
 * Ashutosh
 * 190317v1
 */
import java.util.Scanner;
class c5p125q11
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many units of water was consumed?");
        int units=sc.nextInt();
        double tax;
        if(units<=45)
            tax=0;
        else if(units>45 && units<=75)
            tax=units*4.75;
        else if(units>75 && units<=125)
            tax=units*7.50;
        else if(units>125 && units<=200)
            tax=units*12.25;
        else if(units>200 && units<=350)
            tax=units*16.50;
        else
            tax=units*20;
        System.out.println("Tax Amount=Rs."+tax);
    }
}