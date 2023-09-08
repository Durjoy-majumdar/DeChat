package com.tencent.mapsdk.raster.model;

import java.net.URL;

public abstract class UrlTileProvider implements TileProvider {
    private static final boolean PRINT_URL = false;
    public final int mHeight;
    public final int mWidth;

    public UrlTileProvider(int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
    }

    public Tile getTile(int i, int i2, int i3) {
        return null;
    }

    public abstract URL getTileUrl(int i, int i2, int i3);
}
