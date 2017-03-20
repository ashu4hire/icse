package pkg2017;
/**
 * Trignometric Test using if-else
 * Ashutosh
 * 170317.v1
 */
class c5p125q5v1
{
    public static void main(String args[])
    {
        double s30=Math.sin(30);
        double c30=Math.cos(30);
        double t30=Math.tan(30);
        if(s30<c30 && s30<t30)
        {
            System.out.println("Sin30 is smallest");
        }
        else if(c30>t30 && c30>s30)
        {
            System.out.println("Cos30 is smallest");
        }
        else
        {
            System.out.println("Tan30 is smallest");
        }
    }
}