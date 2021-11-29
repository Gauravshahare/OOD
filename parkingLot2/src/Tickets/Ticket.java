package Tickets;

import ParkingSpot.ParkingSpot;
import Tarrif.TarrifCalculator;
import Users.Customer;
import Users.Person;
import Vehicle.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {

    public Ticket() {

    }

    public void getEntryTicket(Person customer, Vehicle vehicleParked, LocalDateTime entryTime,ParkingSpot parkingSpot){
        System.out.println("Entry Ticket ----- + User "+customer.toString()+" Vehicle Details "+vehicleParked.toString()+
                "Parking Spot "+parkingSpot.toString() +"Parked at "+entryTime.toString()) ;
    }

    public void  getExitTicket(Person customer,Vehicle vehicleParked,LocalDateTime entryTime,LocalDateTime exitTime,double parkingCost,ParkingSpot parkingSpot){
        System.out.println("Exit Ticket ----- + User "+customer.toString()+" Vehicle Details "+vehicleParked.toString()+" Parking Spot "+parkingSpot.toString()+
                "Parked at "+entryTime.toString()+" Exit at "+exitTime.toString()+"parkingCost "+ parkingCost);
    }

}
