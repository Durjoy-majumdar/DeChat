package com.tencent.tencentmap.mapsdk.maps.model;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;

public interface VectorOverlay extends IOverlay {

    public interface OnVectorOverlayClickListener {
        void onClicked(LatLng latLng, String str, String str2);
    }

    public interface OnVectorOverlayLoadListener {
        void onVectorOverlayLoaded(boolean z);
    }

    void enableClick(boolean z);

    ReturnInfoModelClass.ReturnStatus executeCommandFunction(CommandFunctionModelClass.BaseCommandFunction baseCommandFunction);

    String getType();

    boolean isClickEnabled();

    void remove();

    void setLevel(int i);

    void setOpacity(float f);

    void setVisibility(boolean z);

    void setZIndex(int i);
}
