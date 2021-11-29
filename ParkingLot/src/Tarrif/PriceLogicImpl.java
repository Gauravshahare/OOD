package Tarrif;

import java.util.Calendar;
import java.util.Date;

public class PriceLogicImpl implements PriceLogic {
    private double priceOnNormalDays;
    private double priceOnWeekends;

    public PriceLogicImpl(double priceOnNormalDays, double priceOnWeekends) {
        this.priceOnNormalDays = priceOnNormalDays;
        this.priceOnWeekends = priceOnWeekends;
    }

    @Override
    public double getCostPerminute() {
        Calendar cal= Calendar.getInstance();
        int day=cal.get(Calendar.DAY_OF_WEEK);
        if(day==1 || day==7){
            return this.priceOnNormalDays;
        }
        else{
            return this.priceOnWeekends;
        }

    }
}
