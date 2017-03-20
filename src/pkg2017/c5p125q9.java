package pkg2017;
/**
 * Transport charge calculator
 * Ashutosh
 * 100317v1
 */
import java.util.Scanner;
class c5p125q9
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("---CITY NAMES---");
        System.out.println("[K]Kolkata");
        System.out.println("[M]Mumbai");
        System.out.println("[C]Chennai");
        System.out.println("[D]Delhi");
        System.out.print("Choose a city:");
        String ct=sc.next();
        System.out.println("What is the weight of the parcel?");
        int wt=sc.nextInt();
        double charge=0;
        switch(ct)
        {
            case "k":
            case "K":
                if(wt<=100)
                    charge=wt*45;
                else
                    charge=wt*75;
                break;
            case "m":
            case "M":
                charge=(wt<=100)?wt*65:wt*95;
                break;
            case "c":
            case "C":
                charge=(wt<=100)?wt*75:wt*115;
                break;
            case "d":
            case "D":
                charge=(wt<=100)?wt*90:wt*125;
                break;
            default:
                System.out.println("Invalid city!");
                System.exit(0);
        }
        System.out.println("Charge=Rs."+charge);
    }
}