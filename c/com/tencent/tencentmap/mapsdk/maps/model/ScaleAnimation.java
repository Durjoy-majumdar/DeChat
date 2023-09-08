package com.tencent.tencentmap.mapsdk.maps.model;

@Deprecated
public class ScaleAnimation extends BaseAnimation {
    public float mFromX;
    public float mFromY;
    public float mToX;
    public float mToY;

    public ScaleAnimation(float f, float f2, float f3, float f4) {
        this.mFromX = f;
        this.mToX = f2;
        this.mFromY = f3;
        this.mToY = f4;
    }
}
