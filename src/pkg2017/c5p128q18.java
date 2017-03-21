package pkg2017;

import java.util.Scanner;

/**
 * Hotel Discount
 * Created by Ashu on 21-03-2017.
 */
class c5p128q18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name:");
        String name=sc.nextLine();
        System.out.print("Number of days stayed?");
        int days = sc.nextInt();
        double tariff,disc;
        System.out.println("Select type of room:");
        System.out.println("[S] Semi-Deluxe");
        System.out.println("[D] Deluxe");
        System.out.println("[SD] Super-Deluxe");
        String room=sc.next();
        switch (room)
        {
            case "s":
            case "S":
                tariff=2500*days;
                break;
            case "d":
            case "D":
                tariff=3500*days;
                break;
            case "sd":
            case "SD":
                tariff=5000*days;
                break;
            default:
                tariff=0;
        }
        if(days<=3)
            disc=tariff*10/100;
        else if(days>3 && days<=5)
            disc=tariff*15/100;
        else if(days>5 && days<=10)
            disc=tariff*20/100;
        else
            disc=tariff*30/100;
        System.out.println("Name="+name);
        System.out.println("Amount= Rs."+(tariff-disc));
    }
}