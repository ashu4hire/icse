package pkg2017;

import java.util.Scanner;

/**Stream allotment
 * Created by Ashu on 21-03-2017.
 */
class c5p126q13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in English, Maths & Science:");
        int en = sc.nextInt();
        int ma = sc.nextInt();
        int si = sc.nextInt();
        double ems=(en+ma+si)/300*100;
        double es=(en+si)/200*100;
        if(ems>=80)
            System.out.println("Pure Science");
        else if(ems>=60 && ems<80)
            System.out.println("Commerce");
        else if(es>=80 && en>=60)
            System.out.println("Bio. Science");
    }
}