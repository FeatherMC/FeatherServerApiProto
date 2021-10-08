package net.digitalingot.featherserverapi.proto;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.PacketType;
import org.jetbrains.annotations.NotNull;

public class ClientboundWrapper {

    @SerializedName("packetType")
    private final PacketType.Clientbound packetType;
    @NotNull
    @SerializedName("payload")
    private final JsonElement payload;

    public ClientboundWrapper(PacketType.Clientbound packetType, @NotNull JsonElement payload) {
        this.packetType = packetType;
        this.payload = payload;
    }

    public PacketType.Clientbound getPacketType() {
        return packetType;
    }

    @NotNull
    public JsonElement getPayload() {
        return payload;
    }
}
