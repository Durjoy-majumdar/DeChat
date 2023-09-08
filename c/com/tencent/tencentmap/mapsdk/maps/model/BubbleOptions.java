package com.tencent.tencentmap.mapsdk.maps.model;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

public class BubbleOptions {
    private Drawable[] mBackground = null;
    private String mContent;
    private View mContentView;
    private int mDisplayLevel = 0;
    private Marker mMarker;
    private float mMarkerAnchorU = 0.5f;
    private float mMarkerAnchorV = 0.5f;
    private int mMarkerHeight = 0;
    private int mMarkerWidth = 0;
    private boolean mOnTapHidden = false;
    private LatLng mPosition;

    public BubbleOptions background(Drawable[] drawableArr) {
        this.mBackground = drawableArr;
        return this;
    }

    public BubbleOptions content(String str) {
        this.mContent = str;
        return this;
    }

    public BubbleOptions contentView(View view) {
        this.mContentView = view;
        return this;
    }

    public BubbleOptions displayLevel(int i) {
        if (i < 0) {
            i = 0;
        }
        this.mDisplayLevel = i;
        return this;
    }

    public Drawable[] getBackground() {
        return this.mBackground;
    }

    public String getContent() {
        return this.mContent;
    }

    public View getContentView() {
        return this.mContentView;
    }

    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    public Marker getMarker() {
        return this.mMarker;
    }

    public float getMarkerAnchorU() {
        return this.mMarkerAnchorU;
    }

    public float getMarkerAnchorV() {
        return this.mMarkerAnchorV;
    }

    public int getMarkerHeight() {
        return this.mMarkerHeight;
    }

    public int getMarkerWidth() {
        return this.mMarkerWidth;
    }

    public boolean getOnTapHidden() {
        return this.mOnTapHidden;
    }

    public LatLng getPosition() {
        return this.mPosition;
    }

    public BubbleOptions marker(Marker marker) {
        this.mMarker = marker;
        position(marker.getPosition());
        markerAnchor(marker.getAnchorU(), marker.getAnchorV());
        return this;
    }

    public BubbleOptions markerAnchor(float f, float f2) {
        this.mMarkerAnchorU = f;
        this.mMarkerAnchorV = f2;
        return this;
    }

    public BubbleOptions markerSize(int i, int i2) {
        this.mMarkerWidth = i;
        this.mMarkerHeight = i2;
        return this;
    }

    public BubbleOptions position(LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public BubbleOptions setOnTapHidden(boolean z) {
        this.mOnTapHidden = z;
        return this;
    }

    public BubbleOptions background(Bitmap[] bitmapArr) {
        if (bitmapArr != null) {
            this.mBackground = new Drawable[4];
            int length = bitmapArr.length;
            for (int i = 0; i < length; i++) {
                this.mBackground[i] = new BitmapDrawable(bitmapArr[i]);
            }
        }
        return this;
    }
}
