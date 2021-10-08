package net.digitalingot.featherserverapi.proto.models;

import com.google.gson.annotations.SerializedName;

import java.awt.*;

public class ChromaColor {

    @SerializedName("chroma")
    private final boolean chroma;
    @SerializedName("color")
    private final int color;

    public ChromaColor(boolean chroma, int color) {
        this.chroma = chroma;
        this.color = color;
    }

    public ChromaColor(boolean chroma, Color color) {
        this.chroma = chroma;
        this.color = color.getRGB();
    }

    public boolean isChroma() {
        return chroma;
    }

    public int getColor() {
        return color;
    }
}
