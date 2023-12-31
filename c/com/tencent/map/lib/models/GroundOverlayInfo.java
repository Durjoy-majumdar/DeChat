package com.tencent.map.lib.models;

import android.graphics.Bitmap;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;

public class GroundOverlayInfo {
    public float mAlpha = 1.0f;
    public Bitmap mBitmap;
    public int mBitmapHeight;
    public int mBitmapWidth;
    public LatLngBounds mLatLngBounds;
    public int mLevel = 1;
    public boolean mVisibility = true;
    public int mZIndex;

    public boolean checkValid() {
        return this.mBitmap != null;
    }

    public void setAlpha(float f) {
        this.mAlpha = f;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
        if (bitmap != null) {
            this.mBitmapWidth = bitmap.getWidth();
            this.mBitmapHeight = this.mBitmap.getHeight();
        }
    }

    public void setLatLngBounds(LatLngBounds latLngBounds) {
        this.mLatLngBounds = latLngBounds;
    }

    public void setLevel(int i) {
        this.mLevel = i;
    }

    public void setVisibility(boolean z) {
        this.mVisibility = z;
    }

    public void setZIndex(int i) {
        this.mZIndex = i;
    }
}
