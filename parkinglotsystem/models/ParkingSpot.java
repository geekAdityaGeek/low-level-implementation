package parkinglotsystem.models;

import parkinglotsystem.enums.VehicleType;

import java.util.List;

public class ParkingSpot{
    private String number;
    private List<VehicleType> supportVehicleTypes;
    private boolean occupied;

    public boolean isOccupied(){
        return this.occupied;
    }

    public boolean setOccupied(boolean occupied){
        return this.occupied = occupied;
    }

    public List<VehicleType> getSupportVehicleTypes(){
        return this.supportVehicleTypes;
    }

    public String getNumber(){
        return this.number;
    }

}