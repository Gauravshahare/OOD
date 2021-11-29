package ParkingLot;

import ParkingSpot.ParkingSpot;

public interface ParkingLot {

    boolean isParkingSpotAvailable();
    ParkingSpot getNearestParkingSpotToCounter1();
    ParkingSpot getNearestParkingSpotToCounter2();
    ParkingSpot getNearestParkingSpotToCounter3();
    ParkingSpot getNearestParkingSpotToCounter4();
    void SelectCounter(int counterNumber);
    void bookParkingLot(ParkingSpot parkingSpot);
    void getEntryTicket();
    void getExitTicket();
    void setParkingLotSize(int n);
    int getParkingLotSize();
}
