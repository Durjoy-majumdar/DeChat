package com.tencent.kinda.gen;

public final class KRect {
    public KPoint mOrigin;
    public KSize mSize;

    public KRect() {
    }

    public KRect(KPoint kPoint, KSize kSize) {
        this.mOrigin = kPoint;
        this.mSize = kSize;
    }

    public KPoint getOrigin() {
        return this.mOrigin;
    }

    public KSize getSize() {
        return this.mSize;
    }

    public String toString() {
        return "KRect{mOrigin=" + this.mOrigin + ",mSize=" + this.mSize + "}";
    }
}
