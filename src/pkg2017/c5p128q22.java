package pkg2017;

import java.util.Scanner;

/**Maths number-functions
 * Created by Ashu on 21-03-2017.
 */
class c5p128q22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---NUMBER FUNCTIONS---");
        System.out.println("[a] Log");
        System.out.println("[b] Square-root");
        System.out.println("[c] Absolute");
        System.out.println("[d] Random");
        System.out.println("Enter your choice:");
        String ch=sc.next();
        System.out.println("Enter number:");
        double n= sc.nextDouble();
        switch (ch)
        {
            case "a":
                System.out.println(Math.log(n));
                break;
            case "b":
                System.out.println(Math.sqrt(n));
                break;
            case "c":
                System.out.println(Math.abs(n));
                break;
            case "d":
                System.out.println(Math.random());
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}