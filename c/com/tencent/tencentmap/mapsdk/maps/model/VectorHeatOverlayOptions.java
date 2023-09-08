package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.map.sdk.utilities.visualization.datamodels.WeightedLatLng;

public final class VectorHeatOverlayOptions extends BaseOverlayProvider {
    private boolean mAnimate = false;
    private int mAnimateDuration = 5000;
    private int[] mColors;
    private boolean mDraw3D = false;
    private float mGap;
    private double mMaxHeight = 2000.0d;
    private double mMaxIntensity = 2000.0d;
    private int mMaxZoom = 22;
    private double mMinHeight = 0.0d;
    private double mMinIntensity = 0.0d;
    private int mMinZoom = 3;
    private WeightedLatLng[] mNodes;
    private float mOpacity = 1.0f;
    private boolean mRangeFlag = false;
    private float mSize = 2000.0f;
    private double[] mStartPoints;
    private int mType = 0;
    private boolean mVisibility = true;

    public enum VectorHeatOverlayType {
        HoneyComb,
        Square
    }

    public final VectorHeatOverlayOptions animate(boolean z) {
        this.mAnimate = z;
        return this;
    }

    public final VectorHeatOverlayOptions colors(int[] iArr) {
        this.mColors = iArr;
        return this;
    }

    public final VectorHeatOverlayOptions draw3D(boolean z) {
        this.mDraw3D = z;
        return this;
    }

    public final VectorHeatOverlayOptions gap(float f) {
        this.mGap = f;
        return this;
    }

    public final int getAnimateTime() {
        return this.mAnimateDuration;
    }

    public final int[] getColors() {
        return this.mColors;
    }

    public final float getGap() {
        return this.mGap;
    }

    public final double getMaxHeight() {
        return this.mMaxHeight;
    }

    public final double getMaxIntensity() {
        return this.mMaxIntensity;
    }

    public final int getMaxZoom() {
        return this.mMaxZoom;
    }

    public final double getMinHeight() {
        return this.mMinHeight;
    }

    public final double getMinIntensity() {
        return this.mMinIntensity;
    }

    public final int getMinZoom() {
        return this.mMinZoom;
    }

    public final WeightedLatLng[] getNodes() {
        return this.mNodes;
    }

    public final float getOpacity() {
        return this.mOpacity;
    }

    public final boolean getRangeFlag() {
        return this.mRangeFlag;
    }

    public final float getSize() {
        return this.mSize;
    }

    public final double[] getStartPoints() {
        return this.mStartPoints;
    }

    public final VectorHeatOverlayType getType() {
        return VectorHeatOverlayType.values()[this.mType];
    }

    public final VectorHeatOverlayOptions heightRange(double d, double d2) {
        if (d > d2 || d < 0.0d) {
            this.mMinHeight = 0.0d;
            this.mMaxHeight = 2000.0d;
        } else {
            this.mMaxHeight = d2;
            this.mMinHeight = d;
        }
        return this;
    }

    public final boolean isAnimate() {
        return this.mAnimate;
    }

    public final boolean isDraw3D() {
        return this.mDraw3D;
    }

    public final boolean isVisibility() {
        return this.mVisibility;
    }

    public final VectorHeatOverlayOptions nodes(WeightedLatLng[] weightedLatLngArr) {
        this.mNodes = weightedLatLngArr;
        return this;
    }

    public final VectorHeatOverlayOptions setAnimateTime(int i) {
        this.mAnimateDuration = i;
        return this;
    }

    public final VectorHeatOverlayOptions showRange(double d, double d2) {
        if (d > d2 || d < 0.0d) {
            this.mMinIntensity = 0.0d;
            this.mMaxIntensity = 2000.0d;
            this.mRangeFlag = false;
        } else {
            this.mMaxIntensity = d2;
            this.mMinIntensity = d;
            this.mRangeFlag = true;
        }
        return this;
    }

    public final VectorHeatOverlayOptions size(float f) {
        this.mSize = f;
        return this;
    }

    public final VectorHeatOverlayOptions startPoints(double[] dArr) {
        this.mStartPoints = dArr;
        return this;
    }

    public final VectorHeatOverlayOptions type(VectorHeatOverlayType vectorHeatOverlayType) {
        this.mType = vectorHeatOverlayType.ordinal();
        return this;
    }

    public final VectorHeatOverlayOptions maxZoom(int i) {
        this.mMaxZoom = i;
        return this;
    }

    public final VectorHeatOverlayOptions minZoom(int i) {
        this.mMinZoom = i;
        return this;
    }

    public final VectorHeatOverlayOptions opacity(float f) {
        this.mOpacity = f;
        return this;
    }

    public final VectorHeatOverlayOptions visibility(boolean z) {
        this.mVisibility = z;
        return this;
    }
}
