package com.tencent.maas.base;

public class Rect2 {
    private final Vec2 origin;
    private final Vec2 size;

    public Rect2(Vec2 vec2, Vec2 vec22) {
        this.origin = vec2;
        this.size = vec22;
    }

    public Vec2 getOrigin() {
        return this.origin;
    }

    public Vec2 getSize() {
        return this.size;
    }
}
