package Manager;
import ParkingSpot.ParkingSpot;
import ParkingSpot.GridParkingSpot;
import Util.Pair;
import Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ParkingLotManagerImpl implements  ParkingLotManager{

    private ArrayList<Pair<Integer>> coordinatesOfCounters;
    private ArrayList<PriorityQueue<ParkingSpot>> parking;
    private int parkingGridSize;
    private int parkingCounterCount;

    public ParkingLotManagerImpl(int parkingGridSize){
        this.parkingGridSize=parkingGridSize;
        this.parkingCounterCount=4;
        this.coordinatesOfCounters=new ArrayList<>();
        this.parking=new ArrayList<>();
        initParkingCounter();
        initParking();
    }

    private void initParkingCounter(){
        this.coordinatesOfCounters.add(new Pair<Integer>(0,this.parkingGridSize/2+1));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize/2+1,0));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize+1,this.parkingGridSize/2+1));
        this.coordinatesOfCounters.add(new Pair<Integer>(this.parkingGridSize/2+1,this.parkingGridSize));
    }

    private void initParking(){

        ParkingComparator parkingComparatorOne=new ParkingComparator(this.coordinatesOfCounters.get(0).getX(),this.coordinatesOfCounters.get(0).getY());
        ParkingComparator parkingComparatorTwo=new ParkingComparator(this.coordinatesOfCounters.get(1).getX(),this.coordinatesOfCounters.get(1).getY());
        ParkingComparator parkingComparatorThree=new ParkingComparator(this.coordinatesOfCounters.get(2).getX(),this.coordinatesOfCounters.get(2).getY());
        ParkingComparator parkingComparatorFour=new ParkingComparator(this.coordinatesOfCounters.get(3).getX(),this.coordinatesOfCounters.get(3).getY());

        PriorityQueue<ParkingSpot> pq1=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorOne);
        PriorityQueue<ParkingSpot> pq2=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorTwo);
        PriorityQueue<ParkingSpot> pq3=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorThree);
        PriorityQueue<ParkingSpot> pq4=new PriorityQueue<ParkingSpot>(this.parkingGridSize*this.parkingGridSize,parkingComparatorFour);

        for(int i=1;i<=parkingGridSize;i++){
            for (int j=1;j<=parkingGridSize;j++){
                ParkingSpot ps=new GridParkingSpot("Parking Spot #"+i+j,i,j);
                for(int k=0;k<parkingCounterCount;k++){
                    if(k==0){
                        pq1.add(ps);
                    }
                    else if(k==1){
                        pq2.add(ps);
                    }
                    else if(k==3){
                        pq3.add(ps);
                    }
                    else{
                        pq4.add(ps);
                    }
                }
            }
        }
        parking.add(pq1);
        parking.add(pq2);
        parking.add(pq3);
        parking.add(pq4);
    }

    @Override
    public boolean isParkingSpotAvailable() {
        return parking.get(0).size()>0;
    }

    @Override
    public ParkingSpot getNearestSpotAvailable(int counterNumber) {
        return parking.get(counterNumber).peek();
    }

    @Override
    public ParkingSpot bookNearestSpot(int counterNumber) {
        ParkingSpot p1=getNearestSpotAvailable(counterNumber);
        for(int i=0;i<parkingCounterCount;i++){
            parking.get(i).remove(p1);
        }
        return p1;
    }

    @Override
    public void releaseSpot(ParkingSpot parkingSpot) {
        for(int i=0;i<parkingCounterCount;i++){
            parking.get(i).add(parkingSpot);
        }
    }
}
