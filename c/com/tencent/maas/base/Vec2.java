package com.tencent.maas.base;

import java.io.Serializable;

public class Vec2 implements Serializable, Cloneable {
    public static final Vec2 INVALID_VEC2 = new Vec2(Float.NaN, Float.NaN);
    private static final long serialVersionUID = 1;

    /* renamed from: x */
    public float f309908x;

    /* renamed from: y */
    public float f309909y;

    public Vec2() {
        this(0.0f, 0.0f);
    }

    public final Vec2 add(Vec2 vec2) {
        return new Vec2(this.f309908x + vec2.f309908x, this.f309909y + vec2.f309909y);
    }

    public final boolean isValid() {
        return !Float.isNaN(this.f309908x) && !Float.isInfinite(this.f309908x) && !Float.isNaN(this.f309909y) && !Float.isInfinite(this.f309909y);
    }

    public final double length() {
        float f = this.f309908x;
        float f2 = this.f309909y;
        return Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public final Vec2 mul(float f) {
        return new Vec2(this.f309908x * f, this.f309909y * f);
    }

    public final Vec2 negate() {
        return new Vec2(-this.f309908x, -this.f309909y);
    }

    public final Vec2 set(float f, float f2) {
        this.f309908x = f;
        this.f309909y = f2;
        return this;
    }

    public final void setZero() {
        this.f309908x = 0.0f;
        this.f309909y = 0.0f;
    }

    public final Vec2 skew() {
        return new Vec2(-this.f309909y, this.f309908x);
    }

    public final Vec2 sub(Vec2 vec2) {
        return new Vec2(this.f309908x - vec2.f309908x, this.f309909y - vec2.f309909y);
    }

    public final String toString() {
        return "(" + this.f309908x + "," + this.f309909y + ")";
    }

    public Vec2(float f, float f2) {
        this.f309908x = f;
        this.f309909y = f2;
    }

    public final Vec2 clone() {
        return new Vec2(this.f309908x, this.f309909y);
    }

    public final void skew(Vec2 vec2) {
        vec2.f309908x = -this.f309909y;
        vec2.f309909y = this.f309908x;
    }

    public final Vec2 set(Vec2 vec2) {
        this.f309908x = vec2.f309908x;
        this.f309909y = vec2.f309909y;
        return this;
    }

    public Vec2(Vec2 vec2) {
        this(vec2.f309908x, vec2.f309909y);
    }
}
