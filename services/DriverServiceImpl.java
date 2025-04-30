package services;

import dto.Driver;
import interfaces.DriverService;
import requests.MatchResult;

import java.util.List;

public class DriverServiceImpl implements DriverService {
    //fetch from cache or db
    private List<Driver> activeDrivers;

    @Override
    public List<Driver> getActiveDrivers() {
        return activeDrivers;
    }

    @Override
    public MatchResult requestDrivers(List<Driver> drivers) {
        return null;
    }


}
