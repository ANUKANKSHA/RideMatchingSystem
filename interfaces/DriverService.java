package interfaces;

import dto.Driver;
import requests.MatchResult;

import java.util.List;

public interface DriverService {
    public abstract List<Driver> getActiveDrivers();
    public abstract MatchResult requestDrivers(List<Driver> drivers);
}
