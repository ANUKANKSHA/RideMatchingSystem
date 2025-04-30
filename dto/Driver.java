package dto;

import enums.VehicleType;

public class Driver extends User {
    private String vehicleId;
    private VehicleType vehicleType;
    private boolean isOnline;
    private volatile Location location;
    //can add rating also
    public Driver(String name, String id) {
        super(name, id);
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
