import Manager.ParkingLotManager;
import Manager.ParkingLotManagerImpl;
import ParkingLot.*;
import Tarrif.PriceLogic;
import Tarrif.PriceLogicImpl;
import Tarrif.TarrifCalculator;
import Tarrif.TarrifCalculatorImpl;
import Tickets.Ticket;

public class ParkingLotFactory {
    public static ParkingLot createGridParking(){
        ParkingLotManager parkingLotManager=new ParkingLotManagerImpl(4);
        Ticket ticket=new Ticket();
        PriceLogic priceLogic=new PriceLogicImpl(1,2);
        TarrifCalculator trafficCalulator=new TarrifCalculatorImpl(priceLogic);
        return new ParkingLotImpl(parkingLotManager,ticket,trafficCalulator);
    }
}
