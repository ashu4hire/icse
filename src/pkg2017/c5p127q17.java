package pkg2017;

import java.util.Scanner;

/**Parcel
 * Created by Ashu on 21-03-2017.
 */
class c5p127q17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight of parcel[in grams]:");
        int wt = sc.nextInt();
        System.out.print("Enter type of mail[O/E]:");
        String type=sc.next();
        double amt=0;
        switch (type)
        {
            case "o":
            case "O":
                if(wt<=100)
                   amt=50;
                else if(wt>100 && wt<=500)
                    amt=(wt/100)*40;
                else
                    amt=(wt/100)*35;
                break;
            case "e":
            case "E":
                if(wt<=100)
                    amt=80;
                else if(wt>100 && wt<=500)
                    amt=(wt/100)*70;
                else
                    amt=(wt/100)*65;
                break;
        }
        System.out.println("Amount=Rs."+amt);
    }
}