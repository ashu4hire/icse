package pkg2017;
/**
 * Parcel Charges
 * Ashutosh
 * 190317v1
 */
import java.util.Scanner;
class c5p125q10
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is the weight of the parcel?");
        int wt=sc.nextInt();
        int charge=15;
        wt--;
        wt*=2;
        charge=wt*8;
        System.out.println("Amount payable=Rs."+charge);
    }
}