package net.digitalingot.featherserverapi.proto;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ClientHello {

    @NotNull
    @SerializedName("featherMods")
    private final List<String> featherMods;

    public ClientHello(@NotNull List<String> featherMods) {
        this.featherMods = featherMods;
    }

    @NotNull
    public List<String> getFeatherMods() {
        return featherMods;
    }
}
