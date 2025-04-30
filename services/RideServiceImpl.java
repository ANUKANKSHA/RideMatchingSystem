package services;

import dto.Ride;
import enums.RideStatus;
import interfaces.RideService;
import requests.MatchResult;
import requests.RideRequest;

public class RideServiceImpl implements RideService {
    private RideMatchingService rideMatchingService;
    @Override
    public Ride requestRide(Ride  ride) {
        MatchResult result= rideMatchingService.requestRide(new RideRequest(ride.getSrc(),
                ride.getDestination(), ride.getTimestamp()));
        ride.setDriver(result.getAssignedDriver());
        ride.setStatus(RideStatus.ASSIGNED);
        return ride;

    }
}
