package matchingStrategies;

import dto.Driver;
import dto.Location;
import interfaces.DriverService;
import interfaces.RideMatchingStrategy;
import requests.MatchResult;
import requests.RideRequest;

import java.util.Comparator;
import java.util.List;

public class NearestRideMatchingStrategy implements RideMatchingStrategy {
    DriverService driverService;
    @Override
    public MatchResult matchRide(RideRequest request) {
        List<Driver> drivers = driverService.getActiveDrivers();
        drivers.sort(new Comparator<Driver>() {
            @Override
            public int compare(Driver o1, Driver o2) {
                return Location.getDistanceBetween(o1.getLocation(), request.getSrc()) -
                        Location.getDistanceBetween(o2.getLocation(),request.getSrc());
            }
        });
        // poll the first 10 drivers
        driverService.requestDrivers(drivers.subList(0,10));
        return null;
    }
}
