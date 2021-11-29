import ParkingLot.ParkingLot;
import Users.PersonFactory;
import Util.ParkingDetails;
import Vehicle.VehicleFactory;
import Vehicle.VehicleType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot=ParkingLotFactory.createGridParking();
        int i=0;
        int j=0;
        ArrayList<ParkingDetails> parkedVehicles=new ArrayList<>();
        while (parkingLot.isParkingSpotAvailable()){
            System.out.println("Parking NO"+i);
            parkingLot.enterCustomerDetails(PersonFactory.createPerson("sdf","SH","DH","2332.COM","23432"));
            parkingLot.enterVehicleDetails(VehicleFactory.createVehicle(VehicleType.LARGE,
                    "1234"));
            parkingLot.bookParkingLot(j);
            parkedVehicles.add(parkingLot.getEntryTicket());
            i++;
            j=j+1;
            j=j%4;
        }

        for(int i1=0;i1<parkedVehicles.size();i1++){
            System.out.println("Parking OUT "+i1);
            parkingLot.getExitTicket(parkedVehicles.get(i1));
        }

        j=0;
        System.out.println("Parking Again ");
        while (parkingLot.isParkingSpotAvailable()){
            System.out.println("Parking NO"+i);
            parkingLot.enterCustomerDetails(PersonFactory.createPerson("sdf","sdf","sdf","324@GMAIL.COM","23423234"));
            parkingLot.enterVehicleDetails(VehicleFactory.createVehicle(VehicleType.LARGE,
                    "1234"));
            parkingLot.bookParkingLot(j);
            parkedVehicles.add(parkingLot.getEntryTicket());
            i++;
            j=j+1;
            j=j%4;
        }
    }
}
