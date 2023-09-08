package com.tencent.kinda.gen;

public final class KSize {
    public float mHeight;
    public float mWidth;

    public KSize() {
    }

    public KSize(float f, float f2) {
        this.mWidth = f;
        this.mHeight = f2;
    }

    public float getHeight() {
        return this.mHeight;
    }

    public float getWidth() {
        return this.mWidth;
    }

    public String toString() {
        return "KSize{mWidth=" + this.mWidth + ",mHeight=" + this.mHeight + "}";
    }
}
