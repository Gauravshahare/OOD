package Manager;

import ParkingSpot.ParkingSpot;

public interface ParkingLotManager {
    public boolean isParkingSpotAvailable();
    public ParkingSpot getNearestSpotAvailable(int counterNumber);
    public ParkingSpot bookNearestSpot(int counterNumber);
    public void releaseSpot(ParkingSpot parkingSpot);
}
