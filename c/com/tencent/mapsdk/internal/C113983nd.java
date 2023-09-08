package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.GLModelInfo;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;

/* renamed from: com.tencent.mapsdk.internal.nd */
public class C113983nd extends GLModelInfo implements C113973mu {

    /* renamed from: a */
    public GLModelOverlayProvider f340975a;

    public C113983nd(GLModelOverlayProvider gLModelOverlayProvider) {
        this.f340975a = gLModelOverlayProvider;
        this.mModelFilePath = gLModelOverlayProvider.getModelFilePath();
        this.mPosition = gLModelOverlayProvider.getPosition();
        this.mCoordType = gLModelOverlayProvider.getCoordType().ordinal();
        if (gLModelOverlayProvider.getPosition() != null) {
            this.mAltitude = gLModelOverlayProvider.getPosition().getAltitude();
        }
        this.mScale = gLModelOverlayProvider.getScale();
        this.mRotationX = gLModelOverlayProvider.getRotationX();
        this.mRotationY = gLModelOverlayProvider.getRotationY();
        this.mRotationZ = gLModelOverlayProvider.getRotationZ();
        this.mLatLngBounds = gLModelOverlayProvider.getLatLngBounds();
        this.mAnimate = gLModelOverlayProvider.getAnimationType().ordinal();
        this.mMaxZoom = gLModelOverlayProvider.getMaxZoom();
        this.mMinZoom = gLModelOverlayProvider.getMinZoom();
        this.level = gLModelOverlayProvider.getDisplayLevel();
        this.exposure = gLModelOverlayProvider.getExposure();
        this.zIndex = gLModelOverlayProvider.getZIndex();
        this.opacity = gLModelOverlayProvider.getOpacity();
        this.visible = gLModelOverlayProvider.isVisibility();
        this.buildingHidden = gLModelOverlayProvider.isBuildingHidden();
        this.clickEnabled = gLModelOverlayProvider.isClickEnabled();
        this.mPixelWidth = gLModelOverlayProvider.getPixelWidth();
        this.mPixelHeight = gLModelOverlayProvider.getPixelHeight();
        this.outterVectorOverlayLoadListener = gLModelOverlayProvider.getVectorOverlayLoadedListener();
        this.outterVectorOverlayClickListener = gLModelOverlayProvider.getOnVectorOverlayClickListener();
    }

    /* renamed from: a */
    private GLModelOverlayProvider m158339a() {
        return this.f340975a;
    }
}
