package requests;

import dto.Location;
import dto.Ride;

import java.sql.Timestamp;

public class RideRequest {
    private final Location src;
    private final Location target;
    private final Timestamp timestamp;

    public RideRequest(Location src, Location target, Timestamp timestamp) {
        this.src = src;
        this.target = target;
        this.timestamp = timestamp;
    }

    public Location getSrc() {
        return src;
    }

    public void setSrc(Location src) {
        this.src = src;
    }

    public Location getTarget() {
        return target;
    }

    public void setTarget(Location target) {
        this.target = target;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
