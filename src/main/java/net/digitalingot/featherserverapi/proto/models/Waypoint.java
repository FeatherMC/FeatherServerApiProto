package net.digitalingot.featherserverapi.proto.models;

import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.SetWaypoints;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Waypoint {

    @NotNull
    @SerializedName("name")
    private String name;
    @NotNull
    @SerializedName("color")
    private ChromaColor color;
    @NotNull
    @SerializedName("world")
    private String world;
    @NotNull
    @SerializedName("location")
    private Location location;

    public Waypoint(@NotNull String name, @NotNull ChromaColor color, @NotNull String world, @NotNull Location location) {
        this.name = name;
        this.color = color;
        this.world = world;
        this.location = location;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public ChromaColor getColor() {
        return color;
    }

    @NotNull
    public String getWorld() {
        return world;
    }

    @NotNull
    public Location getLocation() {
        return location;
    }

    public static class Location {
        @SerializedName("x")
        private final int x;
        @SerializedName("y")
        private final int y;
        @SerializedName("z")
        private final int z;

        public Location(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }
    }
}
