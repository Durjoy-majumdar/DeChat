package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Rect;

public final class IntersectionOverlayOptions {
    private Rect mBounds;
    private boolean mDarkMode = false;
    private byte[] mData;
    private int mDistance;
    private boolean mRoundedCorner = false;
    private boolean mVisibility = true;

    public final IntersectionOverlayOptions bounds(Rect rect) {
        this.mBounds = rect;
        return this;
    }

    public final IntersectionOverlayOptions darkMode(boolean z) {
        this.mDarkMode = z;
        return this;
    }

    public final IntersectionOverlayOptions data(byte[] bArr) {
        this.mData = bArr;
        return this;
    }

    public final IntersectionOverlayOptions distance(int i) {
        this.mDistance = i;
        return this;
    }

    public final Rect getBounds() {
        return this.mBounds;
    }

    public final byte[] getData() {
        return this.mData;
    }

    public final int getDistance() {
        return this.mDistance;
    }

    public final boolean isDarkMode() {
        return this.mDarkMode;
    }

    public final boolean isRoundedCorner() {
        return this.mRoundedCorner;
    }

    public final boolean isVisibility() {
        return this.mVisibility;
    }

    public final IntersectionOverlayOptions roundedCorner(boolean z) {
        this.mRoundedCorner = z;
        return this;
    }

    public final IntersectionOverlayOptions visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }
}
