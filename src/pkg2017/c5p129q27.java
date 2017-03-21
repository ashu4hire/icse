package pkg2017;

import java.util.Scanner;

/**Electronics Shop
 * Created by Ashu on 21-03-2017.
 */
class c5p129q27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of customer:");
        String name=sc.nextLine();
        System.out.println("Enter address of customer:");
        String address=sc.nextLine();
        System.out.println("Enter amount of purchase: Rs.");
        double amt=sc.nextDouble();
        System.out.println("---TYPE OF PURCHASE---");
        System.out.println("[L] Laptop");
        System.out.println("[D] Desktop PC");
        System.out.println("----------------------");
        System.out.println("Enter type:");
        String type=sc.nextLine();
        switch (type)
        {
            case "L":
                if(amt<=25000)
                {
                    amt-=0;
                }
                else if(amt>25000 && amt<=57000)
                {
                    amt-=amt*5.0/100.0;
                }
                else if(amt>570000 && amt<=100000)
                {
                    amt-=amt*7.5/100.0;
                }
                else if(amt>100000)
                {
                    amt-=amt*10.0/100.0;
                }
                System.out.println("Name:"+name);
                System.out.println("Address:"+address);
                System.out.println("Net Amount: Rs."+amt);
                break;
            case "D":
                if(amt<=25000)
                {
                    amt-=amt*5.0/100.0;
                }
                else if(amt>25000 && amt<=57000)
                {
                    amt-=amt*7.5/100.0;
                }
                else if(amt>570000 && amt<=100000)
                {
                    amt-=amt*10.5/100.0;
                }
                else if(amt>100000)
                {
                    amt-=amt*15.0/100.0;
                }
                System.out.println("Name:"+name);
                System.out.println("Address:"+address);
                System.out.println("Net Amount: Rs."+amt);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}