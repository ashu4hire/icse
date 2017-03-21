package pkg2017;

/**
 * A plane is about to hit WorldTradeCenter. The velocity of plane is 120m/s
 * Currently it is 500m away from the towers. How much time will it take, if
 * 1. Wind is flowing at 5m/s parellel to plane?
 * 2. Wind is flowing at 5m/s opposite to plane?
 * 3. Wind is flowing at 10m/s cross to the plane?
 *
 * Created by Ashu on 21-03-2017.
 */
class c5WorldTradeCenter {
    public static void main(String args[]) {
        double vPlane=120;
        double distance=500;
        double vWindP=5;
        double vWindO=5;
        double vWindC=10;
        double rvPlane=vPlane+vWindP;
        double time=distance/rvPlane;
        System.out.println("Plane if parallel to wind-direction will hit in "+time+"s");
        rvPlane=vPlane-vWindO;
        time=distance/rvPlane;
        System.out.println("Plane if opposite to wind-direction will hit in "+time+"s");
        rvPlane=Math.sqrt(vPlane*vPlane+vWindC*vWindC);
        time=distance/rvPlane;
        System.out.println("Plane if crossing wind will hit in "+time+"s");
    }
}