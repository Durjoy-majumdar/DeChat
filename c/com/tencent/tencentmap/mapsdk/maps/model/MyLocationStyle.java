package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Color;

public class MyLocationStyle {
    public static final int LOCATION_TYPE_FOLLOW_NO_CENTER = 2;
    public static final int LOCATION_TYPE_LOCATION_ROTATE = 0;
    public static final int LOCATION_TYPE_LOCATION_ROTATE_NO_CENTER = 1;
    public static final int LOCATION_TYPE_MAP_ROTATE_NO_CENTER = 3;
    private float anchorU = 0.5f;
    private float anchorV = 0.5f;
    private int fillColor = Color.argb(102, 0, 163, 255);
    private LocationCompass locationCompass;
    private LocationNavigationGravityline locationNavigationGravityline;
    private BitmapDescriptor mIcon;
    private int myLocationType = 0;
    private int strokeColor = Color.argb(127, 0, 163, 255);
    private float strokeWidth = 1.0f;

    public MyLocationStyle anchor(float f, float f2) {
        this.anchorU = f;
        this.anchorV = f2;
        return this;
    }

    public MyLocationStyle fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public float getAnchorU() {
        return this.anchorU;
    }

    public float getAnchorV() {
        return this.anchorV;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public LocationCompass getLocationCompass() {
        return this.locationCompass;
    }

    public LocationNavigationGravityline getLocationNavigationGravityline() {
        return this.locationNavigationGravityline;
    }

    public BitmapDescriptor getMyLocationIcon() {
        return this.mIcon;
    }

    public int getMyLocationType() {
        return this.myLocationType;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public MyLocationStyle icon(BitmapDescriptor bitmapDescriptor) {
        this.mIcon = bitmapDescriptor;
        return this;
    }

    public MyLocationStyle myLocationType(int i) {
        this.myLocationType = i;
        return this;
    }

    public MyLocationStyle setLocationCompass(LocationCompass locationCompass2) {
        this.locationCompass = locationCompass2;
        return this;
    }

    public MyLocationStyle setLocationNavigationGravityline(LocationNavigationGravityline locationNavigationGravityline2) {
        this.locationNavigationGravityline = locationNavigationGravityline2;
        return this;
    }

    public MyLocationStyle strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public MyLocationStyle strokeWidth(int i) {
        this.strokeWidth = (float) i;
        return this;
    }

    public String toString() {
        return "{anchorU=" + this.anchorU + ", anchorV=" + this.anchorV + ", fillColor=" + this.fillColor + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ", myLocationType=" + this.myLocationType + ", mIcon=" + this.mIcon + '}';
    }
}
