package parkinglotsystem.strategies;

import parkinglotsystem.models.ParkingTicket;

import java.time.Instant;

public class RatePricingStategy implements PricingStrategy{

    int ratePerHour;

    public RatePricingStategy(int rate){
        ratePerHour = rate;
    }

    @Override
    public int calculatePrice(ParkingTicket ticket, Instant endTime) {
        return ratePerHour*endTime.compareTo(ticket.getStartTime());
    }
}
