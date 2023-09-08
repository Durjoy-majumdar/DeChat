package com.tencent.maas.handlebox.model;

import com.tencent.maas.base.Vec2;
import com.tencent.maas.model.MJEdgeInsets;

public class MJHandleBoxSettings {
    private final Vec2 contentSize;
    private final MJEdgeInsets edgeInsets;
    private final Vec2 position;
    private final float rotation;
    private final Vec2 scale;

    public MJHandleBoxSettings(Vec2 vec2, Vec2 vec22, MJEdgeInsets mJEdgeInsets, Vec2 vec23, float f) {
        this.position = vec2;
        this.contentSize = vec22;
        this.edgeInsets = mJEdgeInsets;
        this.scale = vec23;
        this.rotation = f;
    }

    public Vec2 getContentSize() {
        return this.contentSize;
    }

    public MJEdgeInsets getEdgeInsets() {
        return this.edgeInsets;
    }

    public Vec2 getPosition() {
        return this.position;
    }

    public float getRotation() {
        return this.rotation;
    }

    public Vec2 getScale() {
        return this.scale;
    }

    public String toString() {
        return "MJHandleBoxSettings{position=" + this.position + ", contentSize=" + this.contentSize + ", edgeInsets=" + this.edgeInsets + ", scale=" + this.scale + ", rotation=" + this.rotation + '}';
    }
}
