package com.tencent.maas.model;

import com.tencent.maas.base.Vec2;

public class MJTextStyle {
    private MJColor fillColor;
    private MJColor shadowColor;
    private Vec2 shadowOffset;
    private float shadowRaduis;
    private MJColor strokeColor;
    private float strokeWidth;

    public MJTextStyle(MJColor mJColor, MJColor mJColor2, float f, MJColor mJColor3, Vec2 vec2, float f2) {
        this.fillColor = mJColor;
        this.strokeColor = mJColor2;
        this.strokeWidth = f;
        this.shadowColor = mJColor3;
        this.shadowOffset = vec2;
        this.shadowRaduis = f2;
    }

    public MJColor getFillColor() {
        return this.fillColor;
    }

    public MJColor getShadowColor() {
        return this.shadowColor;
    }

    public Vec2 getShadowOffset() {
        return this.shadowOffset;
    }

    public float getShadowRaduis() {
        return this.shadowRaduis;
    }

    public MJColor getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public void setFillColor(MJColor mJColor) {
        this.fillColor = mJColor;
    }

    public void setShadowColor(MJColor mJColor) {
        this.shadowColor = mJColor;
    }

    public void setShadowOffset(Vec2 vec2) {
        this.shadowOffset = vec2;
    }

    public void setShadowRaduis(float f) {
        this.shadowRaduis = f;
    }

    public void setStrokeColor(MJColor mJColor) {
        this.strokeColor = mJColor;
    }

    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
    }
}
