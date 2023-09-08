package com.tencent.map.lib.models;

import android.graphics.Rect;

public class IntersectionOverlayInfo {
    public Rect mBounds;
    public byte[] mData;
    public int mDistance;
    public boolean mIsDarkMode;
    public boolean mRoundedCorner = false;
    public boolean mVisibility = true;

    public void enableDarkMode(boolean z) {
        this.mIsDarkMode = z;
    }

    public void enableRoundedCorner(boolean z) {
        this.mRoundedCorner = z;
    }

    public void setBounds(Rect rect) {
        this.mBounds = rect;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setDistance(int i) {
        this.mDistance = i;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }
}
