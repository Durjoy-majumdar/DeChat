package com.tencent.kinda.gen;

public final class DynamicColor {
    public long mDarkmodeColor;
    public long mNormalColor;

    public DynamicColor() {
    }

    public DynamicColor(long j, long j2) {
        this.mNormalColor = j;
        this.mDarkmodeColor = j2;
    }

    public long getDarkmodeColor() {
        return this.mDarkmodeColor;
    }

    public long getNormalColor() {
        return this.mNormalColor;
    }

    public String toString() {
        return "DynamicColor{mNormalColor=" + this.mNormalColor + ",mDarkmodeColor=" + this.mDarkmodeColor + "}";
    }
}
