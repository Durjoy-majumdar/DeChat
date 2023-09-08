package com.tencent.mapsdk.raster.model;

import android.graphics.DashPathEffect;
import android.os.Bundle;
import android.os.Parcel;

public final class CircleOptions {
    private DashPathEffect dashPathEffect = null;
    private int fillColor = 0;
    private int iLevel = OverlayLevel.OverlayLevelAboveLabels;

    /* renamed from: id */
    private String f342868id;
    private boolean isVisible = true;
    private LatLng point = new LatLng(39.908288d, 116.397572d);
    private double radius = 0.0d;
    private int strokeColor = -16777216;
    private boolean strokeDash = false;
    private float strokeWidth = 10.0f;
    private float zIndex = 0.0f;

    public CircleOptions center(LatLng latLng) {
        this.point = latLng;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public CircleOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public LatLng getCenter() {
        return this.point;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public int getLevel() {
        return this.iLevel;
    }

    public double getRadius() {
        return this.radius;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public boolean getStrokeDash() {
        return this.strokeDash;
    }

    public DashPathEffect getStrokeDashPathEffect() {
        return this.dashPathEffect;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public CircleOptions level(int i) {
        if (i >= OverlayLevel.OverlayLevelAboveRoads && i <= OverlayLevel.OverlayLevelAboveLabels) {
            this.iLevel = i;
        }
        return this;
    }

    public CircleOptions radius(double d) {
        this.radius = d;
        return this;
    }

    public CircleOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public CircleOptions strokeDash(boolean z) {
        this.strokeDash = z;
        return this;
    }

    public CircleOptions strokeDashPathEffect(DashPathEffect dashPathEffect2) {
        this.dashPathEffect = dashPathEffect2;
        return this;
    }

    public CircleOptions strokeWidth(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.strokeWidth = f;
        return this;
    }

    public CircleOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        LatLng latLng = this.point;
        if (latLng != null) {
            bundle.putDouble("lat", latLng.getLatitude());
            bundle.putDouble("lng", this.point.getLongitude());
        }
        parcel.writeBundle(bundle);
        parcel.writeDouble(this.radius);
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeInt(this.fillColor);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : 0);
        parcel.writeString(this.f342868id);
    }

    public CircleOptions zIndex(float f) {
        this.zIndex = f;
        return this;
    }
}
