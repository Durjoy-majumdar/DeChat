package com.tencent.map.sdk.utilities.visualization.glmodel;

import com.tencent.map.sdk.utilities.visualization.BaseOverlayProvider;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds;
import java.io.File;
import java.util.List;

public final class GLModelOverlayProvider extends BaseOverlayProvider {
    private AnimationType mAnimated = AnimationType.None;
    private boolean mBuildingHidden = true;
    private CoordType mCoordType = CoordType.GeoGraphicType;
    private float mExposure = 1.0f;
    private LatLngBounds mLatLngBounds;
    private String mModelFilePath;
    private int mPixelHeight;
    private int mPixelWidth;
    private LatLng mPosition;
    private float mRotationX;
    private float mRotationY;
    private float mRotationZ;
    private double mScale = 1.0d;
    private IAnimatorModel.IAnimatorEndListener transAnimatorEndListener;

    public enum AnimationType {
        None,
        FlattenRise
    }

    public enum CoordType {
        PixelType,
        GeoGraphicType
    }

    public GLModelOverlayProvider(String str, LatLng latLng) {
        if (isModelFileValid(str)) {
            this.mModelFilePath = str;
        } else {
            this.mModelFilePath = "";
        }
        this.mPosition = latLng;
    }

    private boolean isModelFileValid(String str) {
        return (str.endsWith(".gltf") || str.endsWith(".GLTF")) && new File(str).exists();
    }

    public final GLModelOverlayProvider animateType(AnimationType animationType) {
        this.mAnimated = animationType;
        return this;
    }

    public final GLModelOverlayProvider coordType(CoordType coordType) {
        this.mCoordType = coordType;
        return this;
    }

    public final AnimationType getAnimationType() {
        return this.mAnimated;
    }

    public final CoordType getCoordType() {
        return this.mCoordType;
    }

    public final int getDisplayLevel() {
        return super.getDisplayLevel();
    }

    public final float getExposure() {
        return this.mExposure;
    }

    public final LatLngBounds getLatLngBounds() {
        return this.mLatLngBounds;
    }

    public final int getMaxZoom() {
        return super.getMaxZoom();
    }

    public final int getMinZoom() {
        return super.getMinZoom();
    }

    public final String getModelFilePath() {
        return this.mModelFilePath;
    }

    public final float getOpacity() {
        return super.getOpacity();
    }

    public final int getPixelHeight() {
        return this.mPixelHeight;
    }

    public final int getPixelWidth() {
        return this.mPixelWidth;
    }

    public final LatLng getPosition() {
        return this.mPosition;
    }

    public final float getRotationX() {
        return this.mRotationX;
    }

    public final float getRotationY() {
        return this.mRotationY;
    }

    public final float getRotationZ() {
        return this.mRotationZ;
    }

    public final double getScale() {
        return this.mScale;
    }

    public final IAnimatorModel.IAnimatorEndListener getTransAnimatorEndListener() {
        return this.transAnimatorEndListener;
    }

    public final int getZIndex() {
        return super.getZIndex();
    }

    public final boolean isBuildingHidden() {
        return this.mBuildingHidden;
    }

    public final boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public final boolean isVisibility() {
        return super.isVisibility();
    }

    public final GLModelOverlayProvider latLngBounds(List<LatLng> list) {
        if (list == null || list.size() < 2) {
            this.mLatLngBounds = null;
        } else {
            this.mLatLngBounds = new LatLngBounds.Builder().include(list).build();
        }
        return this;
    }

    public final GLModelOverlayProvider modelFilePath(String str) {
        if (isModelFileValid(str)) {
            this.mModelFilePath = str;
        }
        return this;
    }

    public final GLModelOverlayProvider pixelBounds(int i, int i2) {
        this.mPixelWidth = i;
        this.mPixelHeight = i2;
        return this;
    }

    public final GLModelOverlayProvider position(LatLng latLng) {
        this.mPosition = latLng;
        return this;
    }

    public final GLModelOverlayProvider rotationX(float f) {
        this.mRotationX = f;
        return this;
    }

    public final GLModelOverlayProvider rotationY(float f) {
        this.mRotationY = f;
        return this;
    }

    public final GLModelOverlayProvider rotationZ(float f) {
        this.mRotationZ = f;
        return this;
    }

    public final GLModelOverlayProvider scale(double d) {
        if (d > 0.0d) {
            this.mScale = d;
        }
        return this;
    }

    public final GLModelOverlayProvider setBuildingHidden(boolean z) {
        this.mBuildingHidden = z;
        return this;
    }

    public final GLModelOverlayProvider setClickEnable(boolean z) {
        super.enableClick(z);
        return this;
    }

    public final GLModelOverlayProvider setExposure(float f) {
        this.mExposure = f;
        return this;
    }

    public final void setTransAnimatorEndListener(IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        this.transAnimatorEndListener = iAnimatorEndListener;
    }

    public final String toString() {
        return "GLModelOverlayProvider{mOpacity=" + this.mOpacity + ", mVisibility=" + this.mVisibility + ", mMinZoom=" + this.mMinZoom + ", mMaxZoom=" + this.mMaxZoom + ", mDisplayLevel=" + this.mDisplayLevel + ", mZIndex=" + this.mZIndex + ", mCoordType=" + this.mCoordType + ", mModelFilePath='" + this.mModelFilePath + '\'' + ", mPosition=" + this.mPosition + ", mScale=" + this.mScale + ", mRotationX=" + this.mRotationX + ", mRotationY=" + this.mRotationY + ", mRotationZ=" + this.mRotationZ + ", mLatLngBounds=" + this.mLatLngBounds + ", mAnimated=" + this.mAnimated + ", mExposure=" + this.mExposure + ", mBuildingHidden=" + this.mBuildingHidden + ", mClickEnabled=" + this.mClickEnabled + '}';
    }

    public final GLModelOverlayProvider zoomRange(int i, int i2) {
        if (i <= i2) {
            super.minZoom(i);
            super.maxZoom(i2);
        }
        return this;
    }

    public final GLModelOverlayProvider displayLevel(int i) {
        super.displayLevel(i);
        return this;
    }

    public final GLModelOverlayProvider opacity(float f) {
        super.opacity(f);
        return this;
    }

    public final GLModelOverlayProvider visibility(boolean z) {
        super.visibility(z);
        return this;
    }

    public final GLModelOverlayProvider zIndex(int i) {
        super.zIndex(i);
        return this;
    }
}
