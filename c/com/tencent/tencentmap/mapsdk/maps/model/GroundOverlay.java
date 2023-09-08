package com.tencent.tencentmap.mapsdk.maps.model;

public interface GroundOverlay {
    void remove();

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setBitmap(BitmapDescriptor bitmapDescriptor);

    void setLatLongBounds(LatLngBounds latLngBounds);

    void setLevel(int i);

    void setPosition(LatLng latLng);

    void setVisibility(boolean z);

    void setZindex(int i);

    void setZoom(float f);
}
