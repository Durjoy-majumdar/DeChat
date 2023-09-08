package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;

public final class TileOverlayOptions {
    private boolean mBetterQuality = true;
    private volatile String mDiskCacheDir;
    private int mMaxMemoryCacheSize;
    private TileProvider mTileProvider;
    private volatile String mVersionInfo;
    private int mZIndex = 1;

    public final TileOverlayOptions betterQuality(boolean z) {
        this.mBetterQuality = z;
        return this;
    }

    public final TileOverlayOptions diskCacheDir(String str) {
        this.mDiskCacheDir = str;
        return this;
    }

    public final String getDiskCacheDir() {
        return this.mDiskCacheDir;
    }

    public final int getMaxMemoryCacheSize(TencentMapContext tencentMapContext) {
        int i = this.mMaxMemoryCacheSize;
        return i == 0 ? tencentMapContext.getScreenPixels() * 4 : i;
    }

    public final TileProvider getTileProvider() {
        return this.mTileProvider;
    }

    public final String getVersionInfo() {
        return this.mVersionInfo;
    }

    public final int getZIndex() {
        return this.mZIndex;
    }

    public final boolean isBetterQuality() {
        return this.mBetterQuality;
    }

    public final TileOverlayOptions maxMemoryCacheSize(int i) {
        this.mMaxMemoryCacheSize = i;
        return this;
    }

    public final TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.mTileProvider = tileProvider;
        return this;
    }

    public final String toString() {
        return "{mDiskCacheDir='" + this.mDiskCacheDir + '\'' + ", mVersionInfo='" + this.mVersionInfo + '\'' + ", mZIndex=" + this.mZIndex + ", mBetterQuality=" + this.mBetterQuality + ", mMaxMemoryCacheSize=" + this.mMaxMemoryCacheSize + '}';
    }

    public final TileOverlayOptions versionInfo(String str) {
        this.mVersionInfo = str;
        return this;
    }

    public final TileOverlayOptions zIndex(int i) {
        this.mZIndex = i;
        return this;
    }
}
