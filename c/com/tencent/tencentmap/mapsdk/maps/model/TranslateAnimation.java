package com.tencent.tencentmap.mapsdk.maps.model;

@Deprecated
public class TranslateAnimation extends BaseAnimation {
    public LatLng mTargetLatLng;

    public TranslateAnimation(LatLng latLng) {
        this.mTargetLatLng = latLng;
    }
}
