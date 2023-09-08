package com.tencent.maas.model;

import com.tencent.maas.base.Vec2;

public class MJSpatialInfo {
    private Vec2 anchorPoint;
    private Vec2 position;
    private float rotation;
    private float scale;

    public MJSpatialInfo(float f, float f2, Vec2 vec2) {
        this.scale = f;
        this.rotation = f2;
        this.position = vec2;
        this.anchorPoint = new Vec2(0.5f, 0.5f);
    }

    public Vec2 getAnchorPoint() {
        return this.anchorPoint;
    }

    public Vec2 getPosition() {
        return this.position;
    }

    public float getRotation() {
        return this.rotation;
    }

    public float getScale() {
        return this.scale;
    }

    public void setAnchorPoint(Vec2 vec2) {
        this.anchorPoint = vec2;
    }

    public void setPosition(Vec2 vec2) {
        this.position = vec2;
    }

    public void setRotation(float f) {
        this.rotation = f;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public String toString() {
        return "MJSpatialInfo{scale=" + this.scale + ", rotation=" + this.rotation + ", position=" + this.position + ", anchorPoint=" + this.anchorPoint + '}';
    }

    public MJSpatialInfo(float f, float f2, Vec2 vec2, Vec2 vec22) {
        this.scale = f;
        this.rotation = f2;
        this.position = vec2;
        this.anchorPoint = vec22;
    }
}
