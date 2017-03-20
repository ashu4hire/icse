package pkg2017;
import java.util.Scanner;
class c5p125q2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("What was the printed price?");
        double p=sc.nextDouble();
        double dis=p*10/100;
        double tax=(p-dis)*6/100;
        System.out.println("Final amount after discount & tax= Rs."+(p-dis+tax));
    }
}
    