package net.digitalingot.featherserverapi.proto;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DisableMods {

    @NotNull
    @SerializedName("mods")
    private final List<String> mods;

    public DisableMods(@NotNull List<String> mods) {
        this.mods = mods;
    }

    @NotNull
    public List<String> getMods() {
        return mods;
    }
}
