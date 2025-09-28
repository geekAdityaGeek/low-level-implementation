package parkinglotsystem.strategies;

import parkinglotsystem.models.ParkingTicket;

import java.time.Instant;

public interface PricingStrategy {
    int calculatePrice(ParkingTicket ticket, Instant endTime);
}
