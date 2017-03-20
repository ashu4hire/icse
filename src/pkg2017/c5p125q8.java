package pkg2017;
/**
 * Numbers
 * Ashutosh
 * 170317.v1
 */
import java.util.Scanner;
class c5p125q8
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a!=b && a!=c)
        {
            System.out.print(Math.max(a,Math.max(b,c)));
        }
        else
        {
            System.out.print("Numbers are equal!");
        }
        if(a>0 && b>0 && c>0)
        {
            System.out.print("Numbers are positive!");
        }
        else if(a<0 && b<0 && c<0)
        {
            System.out.print("Numbers are negative!");
        }
        else
        {
            System.out.print("Numbers are positive and negative!");
        }
    }
}
