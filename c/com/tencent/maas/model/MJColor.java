package com.tencent.maas.model;

public class MJColor {
    public static final MJColor BLACK = new MJColor(0.0f, 0.0f, 0.0f, 1.0f);
    public static final MJColor WHITE = new MJColor(1.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: a */
    private final float f69279a;

    /* renamed from: b */
    private final float f69280b;

    /* renamed from: g */
    private final float f69281g;

    /* renamed from: r */
    private final float f69282r;

    public MJColor(float f, float f2, float f3, float f4) {
        this.f69282r = f;
        this.f69281g = f2;
        this.f69280b = f3;
        this.f69279a = f4;
    }

    public float getA() {
        return this.f69279a;
    }

    public float getB() {
        return this.f69280b;
    }

    public float getG() {
        return this.f69281g;
    }

    public float getR() {
        return this.f69282r;
    }
}
