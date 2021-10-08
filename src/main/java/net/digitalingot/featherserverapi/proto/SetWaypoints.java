package net.digitalingot.featherserverapi.proto;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.Waypoint;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SetWaypoints {

    @NotNull
    @SerializedName("waypoints")
    private final List<Waypoint> waypoints;

    public SetWaypoints(@NotNull List<Waypoint> waypoints) {
        this.waypoints = waypoints;
    }

    @NotNull
    public List<Waypoint> getWaypoints() {
        return waypoints;
    }

}
