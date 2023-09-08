package com.tencent.tencentmap.mapsdk.maps.model;

public final class ArcOptions {
    public float mAngle = 0.0f;
    public int mColor = -16777216;
    public LatLng mEndLatLng;
    public LatLng mPassLatLng;
    public boolean mShowArrow;
    public LatLng mStartLatLng;
    public int mStrokeColor;
    public float mStrokeWidth = 0.0f;
    public float mWidth = 5.0f;

    public final ArcOptions angle(float f) {
        this.mAngle = f;
        return this;
    }

    public final ArcOptions color(int i) {
        this.mColor = i;
        return this;
    }

    public final float getAngle() {
        return this.mAngle;
    }

    public final int getColor() {
        return this.mColor;
    }

    public final LatLng getEndLatLng() {
        return this.mEndLatLng;
    }

    public final LatLng getPassLatLng() {
        return this.mPassLatLng;
    }

    public final LatLng getStartLatLng() {
        return this.mStartLatLng;
    }

    public final int getStrokeColor() {
        return this.mStrokeColor;
    }

    public final float getStrokeWidth() {
        return this.mStrokeWidth;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    public final boolean isShowArrow() {
        return this.mShowArrow;
    }

    public final ArcOptions pass(LatLng latLng) {
        this.mPassLatLng = latLng;
        return this;
    }

    public final ArcOptions points(LatLng latLng, LatLng latLng2) {
        this.mStartLatLng = latLng;
        this.mEndLatLng = latLng2;
        return this;
    }

    public final ArcOptions showArrow(boolean z) {
        this.mShowArrow = z;
        return this;
    }

    public final ArcOptions strokeColor(int i) {
        this.mStrokeColor = i;
        return this;
    }

    public final ArcOptions strokeWidth(float f) {
        this.mStrokeWidth = f;
        return this;
    }

    public final ArcOptions width(float f) {
        this.mWidth = f;
        return this;
    }
}
