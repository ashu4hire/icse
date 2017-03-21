package pkg2017;

import java.util.Scanner;

/**Area
 * Created by Ashu on 21-03-2017.
 */
class c5p128q21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---AREA CALCULATOR---");
        System.out.println("[c] Circle");
        System.out.println("[s] Square");
        System.out.println("[r] Rectangle");
        System.out.println("Enter your choice:");
        String ch=sc.next();
        switch (ch)
        {
            case "c":
            case "C":
                System.out.print("Enter radius:");
                int r = sc.nextInt();
                System.out.println("Area="+3.14*r*r);
                break;
            case "s":
            case "S":
                System.out.print("Enter side:");
                int s = sc.nextInt();
                System.out.println("Area="+s*s);
                break;
            case "r":
            case "R":
                System.out.print("Enter length & breadth:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Area="+l*b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}