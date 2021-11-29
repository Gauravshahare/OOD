package Tarrif;

public class TarrifCalculatorImpl implements TarrifCalculator {

    private PriceLogic priceLogic;

    public TarrifCalculatorImpl(PriceLogic priceLogic){
        this.priceLogic=priceLogic;
    }

    @Override
    public double getTotalParkingCost(int daysParked,int parkingSpotsOccupied) {
        return this.priceLogic.getCostPerminute()*daysParked*parkingSpotsOccupied;
    }

}
