package com.tencent.map.sdk.utilities.visualization.p1182od;

import android.graphics.Color;
import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.FromToLatLng;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.map.sdk.utilities.visualization.od.ArcLineOverlayProvider */
public final class ArcLineOverlayProvider extends BaseOverlayProvider {
    private static final int DEFAULT_COLOR_MAP_SIZE = 200;
    private static final int[] DEFAULT_GRADIENT_COLORS = {Color.argb(255, 0, 128, 255), Color.argb(51, 0, 170, 255), Color.argb(255, 0, 128, 255)};
    private static final float[] DEFAULT_GRADIENT_START_POINTS = {0.0f, 0.5f, 1.0f};
    private List<FromToLatLng> dataList = new ArrayList();
    private boolean mAnimate = true;
    private int mAnimateColor = -10046465;
    private int mAnimationDuration = 2000;
    public int mColorMapSize = 200;
    private float[] mColorPoints = DEFAULT_GRADIENT_START_POINTS;
    private int[] mColors = DEFAULT_GRADIENT_COLORS;
    private boolean mDraw3D = false;
    private int mHighLightDuration = 200;
    private float mRadian = 45.0f;
    private float mWidth = 6.0f;

    public final ArcLineOverlayProvider animateColor(int i) {
        this.mAnimateColor = i;
        return this;
    }

    public final ArcLineOverlayProvider data(List<FromToLatLng> list) {
        if (list != null) {
            this.dataList = list;
        }
        return this;
    }

    public final ArcLineOverlayProvider enable3D(boolean z) {
        this.mDraw3D = z;
        return this;
    }

    public final int getAnimateColor() {
        return this.mAnimateColor;
    }

    public final int getAnimateDuration() {
        return this.mAnimationDuration;
    }

    public final int getColorMapSize() {
        return this.mColorMapSize;
    }

    public final float[] getColorPoints() {
        return this.mColorPoints;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final List<FromToLatLng> getData() {
        return this.dataList;
    }

    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final int getHighLightDuration() {
        return this.mHighLightDuration;
    }

    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    public final int getMinZoom() {
        return super.getMinZoom();
    }

    public final float getOpacity() {
        return super.getOpacity();
    }

    public final float getRadian() {
        return this.mRadian;
    }

    public final float getWidth() {
        return this.mWidth;
    }

    public final int getZIndex() {
        return super.getZIndex();
    }

    public final ArcLineOverlayProvider gradient(int[] iArr) {
        if (iArr != null) {
            if (iArr.length == 1) {
                int i = iArr[0];
                this.mColors = new int[]{iArr[0], i, i};
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            } else if (iArr.length == 2) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 1.0f};
            } else if (iArr.length == 3) {
                this.mColors = iArr;
                this.mColorPoints = new float[]{0.0f, 0.5f, 1.0f};
            }
        }
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final boolean isEnable3D() {
        return this.mDraw3D;
    }

    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final ArcLineOverlayProvider radian(float f) {
        if (f > 0.0f && f <= 90.0f) {
            this.mRadian = f;
            for (FromToLatLng arc : this.dataList) {
                arc.setArc((double) this.mRadian);
            }
        }
        return this;
    }

    public final ArcLineOverlayProvider setAnimateDuration(int i) {
        if (i == 0) {
            this.mAnimate = false;
            this.mAnimationDuration = 0;
        } else if (i > 0) {
            this.mAnimationDuration = i;
            this.mAnimate = true;
        }
        return this;
    }

    public final ArcLineOverlayProvider setHighlightDuration(int i) {
        if (i >= 0) {
            this.mHighLightDuration = i;
        }
        return this;
    }

    public final ArcLineOverlayProvider width(float f) {
        if (f > 0.0f) {
            this.mWidth = f;
        }
        return this;
    }

    public final ArcLineOverlayProvider zoomRange(int i, int i2) {
        if (i <= i2) {
            super.minZoom(i);
            super.maxZoom(i2);
        }
        return this;
    }

    public final ArcLineOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    public final ArcLineOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public final ArcLineOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    public final ArcLineOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }
}
