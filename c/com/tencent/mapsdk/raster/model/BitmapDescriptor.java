package com.tencent.mapsdk.raster.model;

import android.graphics.Bitmap;

public final class BitmapDescriptor implements Cloneable {

    /* renamed from: h */
    public int f342866h;
    public Bitmap mBitmap;

    /* renamed from: w */
    public int f342867w;

    public BitmapDescriptor(Bitmap bitmap) {
        this.f342867w = 0;
        this.f342866h = 0;
        if (bitmap != null) {
            this.f342867w = bitmap.getWidth();
            this.f342866h = bitmap.getHeight();
            this.mBitmap = bitmap;
        }
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public int getHeight() {
        return this.f342866h;
    }

    public int getWidth() {
        return this.f342867w;
    }

    public BitmapDescriptor clone() {
        return new BitmapDescriptor(Bitmap.createBitmap(this.mBitmap), this.f342867w, this.f342866h);
    }

    private BitmapDescriptor(Bitmap bitmap, int i, int i2) {
        this.f342867w = i;
        this.f342866h = i2;
        this.mBitmap = bitmap;
    }
}
