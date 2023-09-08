package com.tencent.mapsdk.raster.model;

public final class Tile {
    public final byte[] mData;
    public final int mHeight;
    public final int mWidth;

    public Tile(int i, int i2, byte[] bArr) {
        this.mWidth = i;
        this.mHeight = i2;
        this.mData = bArr;
    }
}
