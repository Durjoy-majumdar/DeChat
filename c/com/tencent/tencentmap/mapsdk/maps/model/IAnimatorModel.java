package com.tencent.tencentmap.mapsdk.maps.model;

public interface IAnimatorModel {

    public interface IAnimatorEndListener {
        void onAnimatorEnd();
    }

    float getRotation();

    void setPosition(LatLng latLng);

    void setRotation(float f);
}
