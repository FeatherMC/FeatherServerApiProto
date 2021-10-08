package net.digitalingot.featherserverapi.proto;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.PacketType;
import org.jetbrains.annotations.NotNull;

public class Wrapper {

    @NotNull
    @SerializedName("packetType")
    private final PacketType packetType;
    @NotNull
    @SerializedName("payload")
    private final JsonElement payload;

    public Wrapper(@NotNull PacketType packetType, @NotNull JsonElement payload) {
        this.packetType = packetType;
        this.payload = payload;
    }

    @NotNull
    public PacketType getPacketType() {
        return packetType;
    }

    @NotNull
    public JsonElement getPayload() {
        return payload;
    }
}
