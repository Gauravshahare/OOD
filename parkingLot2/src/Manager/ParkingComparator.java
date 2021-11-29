package Manager;

import ParkingSpot.ParkingSpot;

import java.util.Comparator;

public class ParkingComparator implements Comparator<ParkingSpot> {

    private int counterXCoordinate;
    private int counterYCoordinate;

    public ParkingComparator(int counterXCoordinate, int counterYCoordinate){
        this.counterXCoordinate=counterXCoordinate;
        this.counterYCoordinate=counterYCoordinate;
    }

    @Override
    public int compare(ParkingSpot o1, ParkingSpot o2) {
        double dist1=o1.getParkingSpotDistanceFromCounter(counterXCoordinate,counterYCoordinate);
        double dist2=o2.getParkingSpotDistanceFromCounter(counterXCoordinate,counterYCoordinate);
        if(dist1<dist2){
            return -1;
        }
        else if(dist1>dist2){
            return 1;
        }
        return 0;
    }

}