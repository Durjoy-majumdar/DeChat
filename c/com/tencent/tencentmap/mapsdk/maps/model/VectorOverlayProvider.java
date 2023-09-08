package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;

public interface VectorOverlayProvider {
    VectorOverlayProvider displayLevel(int i);

    void enableClick(boolean z);

    int getDisplayLevel();

    int getMaxZoom();

    int getMinZoom();

    float getOpacity();

    int getZIndex();

    boolean isClickEnabled();

    boolean isVisibility();

    VectorOverlayProvider maxZoom(int i);

    VectorOverlayProvider minZoom(int i);

    VectorOverlayProvider opacity(float f);

    VectorOverlayProvider setVectorOverlayLoadedListener(VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener);

    VectorOverlayProvider visibility(boolean z);

    VectorOverlayProvider zIndex(int i);
}
