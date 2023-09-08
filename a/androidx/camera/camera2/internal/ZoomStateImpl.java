package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;

class ZoomStateImpl implements ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f, float f2) {
        this.mMaxZoomRatio = f;
        this.mMinZoomRatio = f2;
    }

    private float getPercentageByRatio(float f) {
        float f2 = this.mMaxZoomRatio;
        float f3 = this.mMinZoomRatio;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    private float getRatioByPercentage(float f) {
        if (f == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f2 = this.mMaxZoomRatio;
        float f3 = this.mMinZoomRatio;
        double d = (double) (1.0f / f3);
        double d2 = 1.0d / (d + ((((double) (1.0f / f2)) - d) * ((double) f)));
        double d3 = (double) f3;
        double d4 = (double) f2;
        if (d2 < d3) {
            d2 = d3;
        } else if (d2 > d4) {
            d2 = d4;
        }
        return (float) d2;
    }

    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.mLinearZoom = f;
        this.mZoomRatio = getRatioByPercentage(f);
    }

    public void setZoomRatio(float f) {
        if (f > this.mMaxZoomRatio || f < this.mMinZoomRatio) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
        }
        this.mZoomRatio = f;
        this.mLinearZoom = getPercentageByRatio(f);
    }
}
