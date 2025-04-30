package interfaces;

import dto.Ride;
import requests.RideRequest;

public interface RideService {
    public abstract Ride requestRide(Ride request);

}
