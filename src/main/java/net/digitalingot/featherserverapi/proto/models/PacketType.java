package net.digitalingot.featherserverapi.proto.models;

public class PacketType {

    public enum Clientbound {
        DISABLE_MODS,
        SET_WAYPOINTS,
        DISABLE_HIT_DELAY
    }

    public enum Serverbound {
        CLIENT_HELLO
    }

}
