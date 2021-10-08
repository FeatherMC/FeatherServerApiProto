package net.digitalingot.featherserverapi.proto;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import net.digitalingot.featherserverapi.proto.models.PacketType;
import org.jetbrains.annotations.NotNull;

public class ServerboundWrapper {

    @SerializedName("packetType")
    private final PacketType.Serverbound packetType;
    @NotNull
    @SerializedName("payload")
    private final JsonElement payload;

    public ServerboundWrapper(PacketType.Serverbound packetType, @NotNull JsonElement payload) {
        this.packetType = packetType;
        this.payload = payload;
    }

    public PacketType.Serverbound getPacketType() {
        return packetType;
    }

    @NotNull
    public JsonElement getPayload() {
        return payload;
    }
}
