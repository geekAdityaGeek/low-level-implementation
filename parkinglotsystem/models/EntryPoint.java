package parkinglotsystem.models;

import parkinglotsystem.strategies.SlotAllocationStrategy;

import java.time.Instant;
import java.util.List;

public class EntryPoint {
    private String id;
    private ParkingLevel parkingLevel;
    private SlotAllocationStrategy allocationStrategy;

    public ParkingTicket bookSlot(Vehicle vehicle){
        List<ParkingSpot> availableParkingSpots =
                parkingLevel.getAvailableSlots(vehicle.getVehicleType());
        ParkingSpot slot = allocationStrategy.allocateSlot(availableParkingSpots);
        return new ParkingTicket(slot, vehicle, Instant.now());
    }
}