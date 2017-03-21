package pkg2017;

import java.util.Scanner;

/**Calculator
 * Created by Ashu on 21-03-2017.
 */
class c5p128q19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---CALCULATOR---");
        System.out.println("[+] Sum");
        System.out.println("[-] Difference");
        System.out.println("[*] Product");
        System.out.println("Enter your choice:");
        String ch=sc.next();
        System.out.println("Enter 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (ch)
        {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}