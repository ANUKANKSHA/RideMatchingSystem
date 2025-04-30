package services;

import interfaces.RideMatchingStrategy;
import requests.MatchResult;
import requests.RideRequest;

public class RideMatchingService {
    private RideMatchingStrategy matchingStrategy;
    public MatchResult requestRide(RideRequest request) {
        return matchingStrategy.matchRide(request);
    }
}
