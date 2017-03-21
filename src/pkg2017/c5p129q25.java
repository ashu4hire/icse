package pkg2017;

import java.util.Scanner;

/**Flat Booking
 * Created by Ashu on 21-03-2017.
 */
class c5p129q25 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of the flat:");
        double p=sc.nextDouble();
        System.out.println("Choose type of flat:");
        System.out.println("[0] Ground Floor");
        System.out.println("[1] First Floor");
        System.out.println("[2] Second Floor");
        System.out.println("[3] Third Floor");
        int fl=sc.nextInt();
        double dp=0,dc=0;
        switch (fl)
        {
            case 0:
                dp=p*10/100;
                dc=p*8/100;
                break;
            case 1:
                dp=p*2/100;
                dc=p*1/100;
                break;
            case 2:
                dp=p*5/100;
                dc=p*5/100;
                break;
            case 3:
                dp=p*7.5/100;
                dc=p*10/100;
                break;
            default:
                System.out.println("What about underground?");
        }
        System.out.println("Total discount="+(dp+dc));
        System.out.println("Amount after discount="+(p-(dp+dc)));
    }
}