package Util;

import ParkingSpot.ParkingSpot;
import Users.Person;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class ParkingDetails {

    public ParkingDetails(Vehicle parkedVehicle, Person customerDetails, LocalDateTime entryTime,ParkingSpot parkingSpot) {
        this.parkedVehicle = parkedVehicle;
        this.customerDetails = customerDetails;
        this.entryTime = entryTime;
        this.parkingSpot=parkingSpot;
        System.out.println("Parking start  Customer--" +customerDetails.toString() +"vehicle Details "+ parkedVehicle.toString()+" parking Spot "+parkingSpot.toString()+" Entry Time " +entryTime.toString() );
    }

    private Vehicle parkedVehicle;
    private Person customerDetails;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private double parkingCharges;



    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    private ParkingSpot parkingSpot;

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkedVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public Person getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(Person customerDetails) {
        this.customerDetails = customerDetails;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public double getParkingCharges() {
        return parkingCharges;
    }

    public void setParkingCharges(double parkingCharges) {
        this.parkingCharges = parkingCharges;
    }

    @Override
    public String toString() {
        return "ParkingDetails{" +
                "parkedVehicle=" + parkedVehicle +
                ", customerDetails=" + customerDetails +
                ", entryTime=" + entryTime +
                ", exitTime=" + exitTime +
                ", parkingCharges=" + parkingCharges +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
