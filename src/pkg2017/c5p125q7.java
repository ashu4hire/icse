package pkg2017;
/**
 * Triangle Master
 * Ashutosh
 * 170317.v1.0
 */
import java.util.Scanner;
class c5p125q7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter values of 3 angles:");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        if((a1+a2+a3)==180)
        {
            System.out.println("Triangle is possible");
            if(a1<90 && a2<90 && a3<90)
            {
                System.out.println(" and is acute-angled!");
            }
            else if(a1==90 || a2==90 || a3==90)
            {
                System.out.println(" and is right-angled!");
            }
            else if(a1>90 || a2>90 || a3>90)
            {
                System.out.println(" and is obtuse-angled!");
            }
        }
        else
        {
            System.out.println("Triangle is NOT possible!");
        }
    }
}