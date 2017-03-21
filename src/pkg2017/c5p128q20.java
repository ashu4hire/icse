package pkg2017;

import java.util.Scanner;

/**Temerature Converter
 * Created by Ashu on 21-03-2017.
 */
class c5p128q20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---TEMP CONVERTER---");
        System.out.println("[1] Fahrenheit to Centigrade");
        System.out.println("[2] Centigrade to Fahrenheit");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        double temp;
        switch (ch)
        {
            case 1:
                System.out.print("Enter temperature in Fahrenheit:");
                temp=sc.nextDouble();
                System.out.println((temp-32)*5/9);
                break;
            case 2:
                System.out.print("Enter temperature in Centigrade:");
                temp=sc.nextDouble();
                System.out.println(1.8*temp+32);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}