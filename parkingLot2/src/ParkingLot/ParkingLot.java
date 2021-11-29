package ParkingLot;

import ParkingSpot.ParkingSpot;
import Users.Person;
import Util.ParkingDetails;
import Vehicle.Vehicle;

public interface ParkingLot {

    boolean isParkingSpotAvailable();
    ParkingSpot getNearestParkingSpot(int parkingCounter);
    void enterCustomerDetails(Person customer);
    void enterVehicleDetails(Vehicle vehicleDetails);
    void SelectCounter(int counterNumber);
    ParkingSpot bookParkingLot(int parkingCounter);
    ParkingDetails getEntryTicket();
    void getExitTicket(ParkingDetails parkingDetails);

}
