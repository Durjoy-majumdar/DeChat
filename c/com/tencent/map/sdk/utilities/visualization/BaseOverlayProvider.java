package com.tencent.map.sdk.utilities.visualization;

import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlayProvider;

public abstract class BaseOverlayProvider implements VectorOverlayProvider {
    private static final float DEFAULT_MAX_OPACITY = 1.0f;
    private static final int DEFAULT_MAX_ZOOM = 22;
    private static final float DEFAULT_MIN_OPACITY = 0.0f;
    private static final int DEFAULT_MIN_ZOOM = 3;
    private static final float DEFAULT_OPACITY = 1.0f;
    private static final int DEFAULT_ZINDEX = 0;
    public boolean mClickEnabled = false;
    public int mDisplayLevel = 1;
    public int mMaxZoom = 22;
    public int mMinZoom = 4;
    public float mOpacity = 1.0f;
    public boolean mVisibility = true;
    public int mZIndex = 0;
    public VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener = null;
    public VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadlistener = null;

    public void enableClick(boolean z) {
        this.mClickEnabled = z;
    }

    public int getDisplayLevel() {
        return this.mDisplayLevel;
    }

    public int getMaxZoom() {
        return this.mMaxZoom;
    }

    public int getMinZoom() {
        return this.mMinZoom;
    }

    public VectorOverlay.OnVectorOverlayClickListener getOnVectorOverlayClickListener() {
        return this.onVectorOverlayClickListener;
    }

    public float getOpacity() {
        return this.mOpacity;
    }

    public VectorOverlay.OnVectorOverlayLoadListener getVectorOverlayLoadedListener() {
        return this.onVectorOverlayLoadlistener;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public boolean isClickEnabled() {
        return false;
    }

    public boolean isVisibility() {
        return this.mVisibility;
    }

    public BaseOverlayProvider setVectorOverlayClickListener(VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener2) {
        this.onVectorOverlayClickListener = onVectorOverlayClickListener2;
        return this;
    }

    public String toString() {
        return "BaseOverlayProvider{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + '}';
    }

    public BaseOverlayProvider displayLevel(int i) {
        if (i == 1 || i == 2) {
            this.mDisplayLevel = i;
        }
        return this;
    }

    public BaseOverlayProvider maxZoom(int i) {
        if (i <= 22) {
            this.mMaxZoom = i;
        } else {
            this.mMaxZoom = 22;
        }
        return this;
    }

    public BaseOverlayProvider minZoom(int i) {
        if (i >= 3) {
            this.mMinZoom = i;
        } else {
            this.mMinZoom = 3;
        }
        return this;
    }

    public BaseOverlayProvider opacity(float f) {
        if (f > 1.0f) {
            this.mOpacity = 1.0f;
        } else if (f < 0.0f) {
            this.mOpacity = 0.0f;
        } else {
            this.mOpacity = f;
        }
        return this;
    }

    public BaseOverlayProvider setVectorOverlayLoadedListener(VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.onVectorOverlayLoadlistener = onVectorOverlayLoadListener;
        return this;
    }

    public BaseOverlayProvider visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }

    public BaseOverlayProvider zIndex(int i) {
        this.mZIndex = i;
        return this;
    }
}
