package parkinglotsystem.models;

import parkinglotsystem.enums.VehicleType;

import java.util.List;
import java.util.stream.Collectors;

public class ParkingLevel {
    private int level;
    private List<ParkingSpot> parkingSpots;
    private List<EntryPoint> entryPoints;
    private List<ExitPoint> exitPoints;

    public int getLevel(){
        return level;
    }

    public List<ParkingSpot> getParkingSpots(){
        return parkingSpots;
    }

    public List<EntryPoint> getEntryPoints(){
        return entryPoints;
    }

    public List<ExitPoint> getExitPoints(){
        return exitPoints;
    }

    public List<ParkingSpot> getAvailableSlots(VehicleType vehicleType){
        return getParkingSpots().stream()
            .filter(spot -> spot.getSupportVehicleTypes()
                    .contains(vehicleType) && !spot.isOccupied())
            .collect(Collectors.toList());
    }
}
