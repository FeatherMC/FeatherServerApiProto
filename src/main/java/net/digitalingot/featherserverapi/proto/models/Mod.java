package net.digitalingot.featherserverapi.proto.models;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class Mod {
    @NotNull
    @SerializedName("name")
    private final String name;
    @NotNull
    @SerializedName("version")
    private final String version;

    public Mod(@NotNull String name, @NotNull String version) {
        this.name = name;
        this.version = version;
    }

    @NotNull
    public String getName() {
        return name;
    }

    @NotNull
    public String getVersion() {
        return version;
    }
}
