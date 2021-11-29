package ParkingLot.Manager;
import java.util.ArrayList;
import java.util.PriorityQueue;

import ParkingLot.Pair;
import ParkingSpot.ParkingSpot;

public class ParkingLotManagerImpl implements ParkingLotManager{

    private ArrayList<Pair<Integer>> coordinatesOfCounters=new ArrayList();
    private ArrayList<PriorityQueue<ParkingSpot>>parking;
    private int parkingGridSize;
    private int parkingCounterCount;

    public ParkingLotManagerImpl(int parkingGridSize){
        this.parkingGridSize=parkingGridSize;
        this.parkingCounterCount=4;
        initParkingCounter();
    }

    private void initParkingCounter(){
        this.coordinatesOfCounters.add(new Pair<Integer>(0,this.parkingGridSize/2+1));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize/2+1,0));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize+1,this.parkingGridSize/2+1));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize/2+1,this.parkingGridSize));
    }

    //work in progress
    private void initParking(){

        for(int i=1;i<=this.parkingGridSize;i++){
            for(int j=1;j<=this.parkingGridSize;j++){

                ParkingComparator parkingComparatorOne=new ParkingComparator(this.coordinatesOfCounters.get(0).getX(),this.coordinatesOfCounters.get(0).getY());
                ParkingComparator parkingComparatorTwo=new ParkingComparator(this.coordinatesOfCounters.get(1).getX(),this.coordinatesOfCounters.get(1).getY());
                ParkingComparator parkingComparatorThree=new ParkingComparator(this.coordinatesOfCounters.get(2).getX(),this.coordinatesOfCounters.get(2).getY());
                ParkingComparator parkingComparatorFour=new ParkingComparator(this.coordinatesOfCounters.get(3).getX(),this.coordinatesOfCounters.get(3).getY());

                PriorityQueue<ParkingSpot> pq1=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorOne);
                PriorityQueue<ParkingSpot> pq2=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorTwo);
                PriorityQueue<ParkingSpot> pq3=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorThree);
                PriorityQueue<ParkingSpot> pq4=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorFour);


                for(int k=0;k<this.parkingCounterCount;k++){
                    if(k==0){
                        ParkingSpot g1 = new GridParkingSpot(""+i+j,i,j);
                        g1.


                    }
                }

            }
        }
    }

    @Override
    public boolean isParkingSpotAvailable() {
        return parking.get(0).size()>0;
    }

    @Override
    public ParkingSpot getNearestSpotAvailable(int counterNumber) {
        return null;
    }

    @Override
    public void bookNearestSpot(int counterNumber) {

    }

    @Override
    public void releaseSpot(ParkingSpot parkingSpot) {

    }
}
