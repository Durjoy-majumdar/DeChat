package com.tencent.maas.model;

public class MJLayerStyle {
    private MJColor backgroundColor;
    private MJColor borderColor;
    private float borderWidth;
    private float cornerRadius;
    private MJEdgeInsets edgeInsets;

    public MJLayerStyle(float f, MJColor mJColor, float f2, MJColor mJColor2, MJEdgeInsets mJEdgeInsets) {
        this.cornerRadius = f;
        this.borderColor = mJColor;
        this.borderWidth = f2;
        this.backgroundColor = mJColor2;
        this.edgeInsets = mJEdgeInsets;
    }

    public MJColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public MJColor getBorderColor() {
        return this.borderColor;
    }

    public float getBorderWidth() {
        return this.borderWidth;
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public MJEdgeInsets getEdgeInsets() {
        return this.edgeInsets;
    }

    public void setBackgroundColor(MJColor mJColor) {
        this.backgroundColor = mJColor;
    }

    public void setBorderColor(MJColor mJColor) {
        this.borderColor = mJColor;
    }

    public void setBorderWidth(float f) {
        this.borderWidth = f;
    }

    public void setCornerRadius(float f) {
        this.cornerRadius = f;
    }

    public void setEdgeInsets(MJEdgeInsets mJEdgeInsets) {
        this.edgeInsets = mJEdgeInsets;
    }
}
