package interfaces;

import requests.MatchResult;
import requests.RideRequest;

public interface RideMatchingStrategy {
    MatchResult matchRide(RideRequest request);
}
