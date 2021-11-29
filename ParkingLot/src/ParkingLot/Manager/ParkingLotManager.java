package ParkingLot.Manager;

import ParkingSpot.ParkingSpot;

public interface ParkingLotManager {
    public boolean isParkingSpotAvailable();
    public ParkingSpot getNearestSpotAvailable(int counterNumber);
    public void bookNearestSpot(int counterNumber);
    public void releaseSpot(ParkingSpot parkingSpot);
}
