package parkinglotsystem.models;

import parkinglotsystem.enums.VehicleType;

import java.time.Instant;

public class ParkingTicket {

    private String referenceNumber;
    private Instant startTime;
    private String vehicleNumber;
    private ParkingSpot spot;
    private VehicleType vehicleType;

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public ParkingSpot getSpotNumber() {
        return spot;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


    public ParkingTicket(ParkingSpot slot, Vehicle vehicle, Instant startTime) {
        this.startTime = startTime;
        this.vehicleNumber = vehicle.getVehicleNumber();
        this.vehicleType = vehicle.getVehicleType();
        this.spot = slot;
    }

}
