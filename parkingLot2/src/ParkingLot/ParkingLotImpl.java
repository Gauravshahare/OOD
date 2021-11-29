package ParkingLot;

import Manager.ParkingLotManager;
import ParkingSpot.ParkingSpot;
import Tarrif.TarrifCalculator;
import Tickets.Ticket;
import Users.Person;
import Util.ParkingDetails;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkingLotImpl implements ParkingLot {
    private ParkingLotManager parkingLotManager;
    private ParkingSpot selectedParkingSpot;
    private int selectedCounter;
    private Ticket ticketManager;
    private Person customerDetails;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle selectedVehicle;
    private TarrifCalculator tarrifCalculator;

    public ParkingLotImpl(ParkingLotManager parkingLotManager,Ticket ticketManager,TarrifCalculator tarrifCalculator) {
        this.parkingLotManager = parkingLotManager;
        this.ticketManager = ticketManager;
        this.tarrifCalculator = tarrifCalculator;
    }

    @Override
    public boolean isParkingSpotAvailable() {
        return this.parkingLotManager.isParkingSpotAvailable();
    }

    @Override
    public ParkingSpot getNearestParkingSpot(int parkingCounter) {
        return this.parkingLotManager.getNearestSpotAvailable(parkingCounter);
    }

    @Override
    public void enterCustomerDetails(Person customer) {
        this.customerDetails = customer;
    }

    @Override
    public void enterVehicleDetails(Vehicle vehicleDetails) {
        this.selectedVehicle=vehicleDetails;
    }

    @Override
    public void SelectCounter(int counterNumber) {
        this.selectedCounter = counterNumber;
    }

    @Override
    public ParkingDetails getEntryTicket() {
        LocalDateTime entryTime = LocalDateTime.now();
        ParkingDetails parkingDetails = new ParkingDetails(selectedVehicle,customerDetails,entryTime,selectedParkingSpot);
        this.ticketManager.getEntryTicket(parkingDetails.getCustomerDetails(),parkingDetails.getParkedVehicle(),parkingDetails.getEntryTime(),parkingDetails.getParkingSpot());
        return parkingDetails;
    }

    @Override
    public void getExitTicket(ParkingDetails parkingDetails) {
        LocalDateTime exitTime=LocalDateTime.now();
        double parkingFees = this.tarrifCalculator.getTotalParkingCost(10,parkingDetails.getParkedVehicle().getVehicleType().getNoOfParkingSpotRequired());
        parkingDetails.setExitTime(exitTime);
        parkingDetails.setParkingCharges(parkingFees);
        this.ticketManager.getExitTicket(parkingDetails.getCustomerDetails(),parkingDetails.getParkedVehicle(),parkingDetails.getEntryTime(),parkingDetails.getExitTime(),parkingDetails.getParkingCharges(),parkingDetails.getParkingSpot());
        this.resetParking(parkingDetails.getParkingSpot());
    }


    @Override
    public ParkingSpot bookParkingLot(int parkingCounter) {
        this.selectedParkingSpot=this.parkingLotManager.bookNearestSpot(parkingCounter);
        return selectedParkingSpot;
    }

    private void resetParking(ParkingSpot bookedSpot){
        this.parkingLotManager.releaseSpot(bookedSpot);
        this.customerDetails=null;
        this.selectedParkingSpot=null;
        this.entryTime = null;
        this.exitTime = null;
        this.selectedCounter = -1;
        this.selectedVehicle = null;
    }
}
