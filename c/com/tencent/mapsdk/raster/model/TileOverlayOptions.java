package com.tencent.mapsdk.raster.model;

public final class TileOverlayOptions {
    private boolean mBetterQuality = true;
    private volatile String mDiskCacheDir;
    private TileProvider mTileProvider;
    private volatile String mVersionInfo;
    private int mZIndex = 1;

    public TileOverlayOptions betterQuality(boolean z) {
        this.mBetterQuality = z;
        return this;
    }

    public TileOverlayOptions diskCacheDir(String str) {
        this.mDiskCacheDir = str;
        return this;
    }

    public String getDiskCacheDir() {
        return this.mDiskCacheDir;
    }

    public TileProvider getTileProvider() {
        return this.mTileProvider;
    }

    public String getVersionInfo() {
        return this.mVersionInfo;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public boolean isBetterQuality() {
        return this.mBetterQuality;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.mTileProvider = tileProvider;
        return this;
    }

    public TileOverlayOptions versionInfo(String str) {
        this.mVersionInfo = str;
        return this;
    }

    public TileOverlayOptions zIndex(int i) {
        this.mZIndex = i;
        return this;
    }
}
