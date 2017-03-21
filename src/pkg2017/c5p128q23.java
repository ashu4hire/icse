package pkg2017;

import java.util.Scanner;

/**
 * Area Calculator
 * Created by Ashu on 21-03-2017.
 */
class c5p128q23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---AREA CALCULATOR---");
        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cuboid");
        System.out.println("Enter choice:");
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("Enter side:");
                int s=sc.nextInt();
                System.out.println("Area="+s*s*s);
                break;
            case 2:
                System.out.println("Enter radius:");
                int r=sc.nextInt();
                System.out.println("Area="+4/3*3.14*r*r*r);
                break;
            case 3:
                System.out.println("Enter l,b and h:");
                int l=sc.nextInt();
                int b=sc.nextInt();
                int h=sc.nextInt();
                System.out.println("Area="+l*b*h);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}