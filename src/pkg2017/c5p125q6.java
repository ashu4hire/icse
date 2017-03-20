package pkg2017;
/**
 * Profit and Loss Calculator
 * Ashutosh
 * 170317.v1
 */
import java.util.Scanner;
class c5p125q6
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price:");
        double cp=sc.nextDouble();
        System.out.println("Enter selling price:");
        double sp=sc.nextDouble();
        double diff=sp-cp;
        double per;
        if(diff>0)
        {
            per=diff*100/cp;
            System.out.println("Profit %age="+per);
        }
        else if(diff<0)
        {
            per=diff*100/cp;
            System.out.println("Loss %age="+per);
        }
        else
        {
            System.out.println("Neither profit, nor loss!");
        }
    }
}