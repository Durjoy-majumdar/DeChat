package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Bitmap;

public final class GroundOverlayOptions {
    public static Bitmap TRANSPARENT_PIXEL = Bitmap.createBitmap(new int[]{0}, 1, 1, Bitmap.Config.ARGB_8888);
    private float mAlpha = 1.0f;
    private float mAnchorU = 0.5f;
    private float mAnchorV = 0.5f;
    private BitmapDescriptor mBitmapDescriptor = BitmapDescriptorFactory.fromBitmap(TRANSPARENT_PIXEL);
    private LatLngBounds mLatLngBounds;
    private int mLevel = 1;
    private LatLng mPosition;
    private boolean mVisibility = true;
    private int mZIndex;
    private float mZoom = 18.0f;

    public final GroundOverlayOptions alpha(float f) {
        this.mAlpha = f;
        return this;
    }

    public final GroundOverlayOptions anchor(float f, float f2) {
        this.mAnchorU = f;
        this.mAnchorV = f2;
        return this;
    }

    public final GroundOverlayOptions bitmap(BitmapDescriptor bitmapDescriptor) {
        this.mBitmapDescriptor = bitmapDescriptor;
        return this;
    }

    public final float getAlpha() {
        return this.mAlpha;
    }

    public final float getAnchorU() {
        return this.mAnchorU;
    }

    public final float getAnchorV() {
        return this.mAnchorV;
    }

    public final BitmapDescriptor getBitmap() {
        return this.mBitmapDescriptor;
    }

    public final LatLngBounds getLatLngBounds() {
        return this.mLatLngBounds;
    }

    public final int getLevel() {
        return this.mLevel;
    }

    public final LatLng getPosition() {
        return this.mPosition;
    }

    public final int getZIndex() {
        return this.mZIndex;
    }

    public final float getZoom() {
        return this.mZoom;
    }

    public final boolean isVisible() {
        return this.mVisibility;
    }

    public final GroundOverlayOptions latLngBounds(LatLngBounds latLngBounds) {
        this.mLatLngBounds = latLngBounds;
        return this;
    }

    public final GroundOverlayOptions level(int i) {
        if (i >= 0 && i <= 2) {
            this.mLevel = i;
        }
        return this;
    }

    public final GroundOverlayOptions position(LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public final GroundOverlayOptions visible(boolean z) {
        this.mVisibility = z;
        return this;
    }

    public final GroundOverlayOptions zIndex(int i) {
        this.mZIndex = i;
        return this;
    }

    public final GroundOverlayOptions zoom(float f) {
        this.mZoom = f;
        return this;
    }
}
