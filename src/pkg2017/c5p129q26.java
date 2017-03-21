package pkg2017;

import java.util.Scanner;

/**Car price
 * Created by Ashu on 21-03-2017.
 */
class c5p129q26 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter showroom price of the car:");
        double price=sc.nextDouble();
        System.out.println("Enter number of years car was used?");
        int year=sc.nextInt();
        double dep=0;
        switch (year)
        {
            case 1:
                dep=price*10/100;
                break;
            case 2:
                dep=price*20/100;
                break;
            case 3:
                dep=price*30/100;
                break;
            case 4:
                dep=price*50/100;
                break;
            default:
                dep=price*60/100;
        }
        System.out.println("original Price=Rs."+price);
        System.out.println("Depreciation=Rs."+dep);
        System.out.println("Amount=Rs." + (price-dep));
    }
}