package requests;

import dto.Driver;

public class MatchResult {
    RideRequest request;
    Driver assignedDriver;

    public RideRequest getRequest() {
        return request;
    }

    public void setRequest(RideRequest request) {
        this.request = request;
    }

    public Driver getAssignedDriver() {
        return assignedDriver;
    }

    public void setAssignedDriver(Driver assignedDriver) {
        this.assignedDriver = assignedDriver;
    }
}
