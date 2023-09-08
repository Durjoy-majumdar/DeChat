package com.tencent.mapsdk.raster.model;

import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.Animation;
import com.tencent.tencentmap.mapsdk.maps.interfaces.Collision;

public interface Marker extends IOverlay {
    boolean equals(Object obj);

    float getAlpha();

    String getContentDescription();

    String getId();

    int getLevel();

    View getMarkerView();

    LatLng getPosition();

    float getRotation();

    String getSnippet();

    Object getTag();

    String getTitle();

    float getZIndex();

    int hashCode();

    void hideInfoWindow();

    boolean isDraggable();

    boolean isInfoWindowShown();

    boolean isVisible();

    void refreshInfoWindow();

    void remove();

    void set2Top();

    void setAlpha(float f);

    void setAnchor(float f, float f2);

    void setCollisions(Collision... collisionArr);

    void setContentDescription(String str);

    void setDraggable(boolean z);

    void setGifIcon(Bitmap[] bitmapArr, boolean z, int i);

    void setIcon(BitmapDescriptor bitmapDescriptor);

    void setInfoWindowHideAnimation(Animation animation);

    void setInfoWindowOffset(int i, int i2);

    void setInfoWindowShowAnimation(Animation animation);

    void setLevel(int i);

    void setMarkerView(View view);

    void setPosition(LatLng latLng);

    void setRotation(float f);

    void setSnippet(String str);

    void setTag(Object obj);

    void setTitle(String str);

    void setVisible(boolean z);

    void setZIndex(float f);

    void showInfoWindow();
}
