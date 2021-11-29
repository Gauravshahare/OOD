package Tickets;

import Tarrif.TarrifCalculator;
import Users.Customer;
import Vehicle.Vehicle;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {

    private final Customer customer;
    private final Vehicle vehicleParked;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TarrifCalculator tarrifCalculator;

    public Ticket(Customer customer, Vehicle vehicleParked, LocalDateTime entryTime, TarrifCalculator tarrifCalculator) {
        this.customer = customer;
        this.vehicleParked = vehicleParked;
        this.entryTime = entryTime;
        this.tarrifCalculator = tarrifCalculator;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicleParked() {
        return vehicleParked;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public TarrifCalculator getTarrifCalculator() {
        return tarrifCalculator;
    }

    public void setTarrifCalculator(TarrifCalculator tarrifCalculator) {
        this.tarrifCalculator = tarrifCalculator;
    }

    public double getCost(int daysParked,int parkingSpotsOccupied){
        return this.tarrifCalculator.getTotalParkingCost(daysParked,parkingSpotsOccupied);
    }

    public void getEntryTicket(){
        System.out.println("Entry Ticket ----- + User "+customer.toString()+" Vehicle Details "+vehicleParked.toString()
         +"Parked at "+entryTime.toString() ) ;
    }

    public void  getExitTicket(){
        System.out.println("Exit ticket ---- ");
    }



}
