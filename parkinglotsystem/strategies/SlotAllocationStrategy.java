package parkinglotsystem.strategies;

import parkinglotsystem.models.ParkingSpot;

import java.util.List;

public interface SlotAllocationStrategy {
    ParkingSpot allocateSlot(List<ParkingSpot> parkingSpots);
}
