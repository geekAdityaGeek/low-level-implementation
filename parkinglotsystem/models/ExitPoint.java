package parkinglotsystem.models;

import java.time.Instant;

public class ExitPoint {
    private String id;
    private PaymentProcessor paymentProcess;

    public boolean payParkingFees(ParkingTicket ticket){
        int parkingFess = ticket.getVehicleType().getPricingStrategy()
                .calculatePrice(ticket, Instant.now());
        return paymentProcess.processPayment(parkingFess);
    }

    public void releaseParkingSpot(ParkingSpot parkingSpot){
        parkingSpot.setOccupied(false);
    }


}
