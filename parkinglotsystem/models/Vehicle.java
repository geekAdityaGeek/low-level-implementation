package parkinglotsystem.models;

import parkinglotsystem.enums.VehicleType;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public Vehicle(String number, VehicleType vehicleType){
        this.vehicleNumber = number;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType(){
        return this.vehicleType;
    }

    public String getVehicleNumber(){
        return this.vehicleNumber;
    }

}
