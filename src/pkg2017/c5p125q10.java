package pkg2017;

import java.util.Scanner;

/**
 * Special 2-digit no
 * Created by Ashu on 21-03-2017.
 */
class c5p125q10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two digit no:");
        int n=sc.nextInt();
        if(n>9 && n<100)
        {
            int d1=n/10;
            int d2=n%10;
            if((d1+d2)+(d1*d2)==n)
                System.out.println("Number is special!");
            else
                System.out.println("Number if not special!");
        }
        else
            System.out.println("Go back to Pre-Nursery!");
    }
}