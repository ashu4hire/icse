package pkg2017;
/**
 * Trignometric Test using Math-functions
 * Ashutosh
 * 170317.v2
 */
class c5p125q5v2
{
    public static void main()
    {
        double s30=Math.sin(30);
        double c30=Math.cos(30);
        double t30=Math.tan(30);
        double small=Math.min(s30,Math.min(c30,t30));
        System.out.println("Smallest value is:"+small);
    }
}