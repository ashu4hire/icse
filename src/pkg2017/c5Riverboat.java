package pkg2017;

/**
 * A motorboat traveling 4 m/s, East encounters a current traveling 3.0 m/s, North.
 * 1.What is the resultant velocity of the motorboat?
 * 2.If the width of the river is 80 meters wide, then how much time does it take
 * the boat to travel shore to shore?
 * 3.What distance downstream does the boat reach the opposite shore?
 *
 * Created by Ashu on 21-03-2017.
 */
class c5Riverboat {
    public static void main(String args[]) {
        double vBoat=4;
        double vCurrent=3;
        double rvBoat=Math.sqrt(vBoat*vBoat+vCurrent*vCurrent);
        double time=80/vBoat;
        double dStream=vCurrent*time;
        System.out.println("Resultant velocity of boat="+rvBoat+"m/s");
        System.out.println("Boat crosses the river in="+time+"s");
        System.out.println("Distance covered by boat downstream="+dStream+"m");
    }
}