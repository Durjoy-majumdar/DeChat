package com.tencent.liteav.videobase.utils;

public enum Rotation {
    NORMAL(0),
    ROTATION_90(90),
    ROTATION_180(180),
    ROTATION_270(270);
    

    /* renamed from: e */
    private static final Rotation[] f309804e = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        f309804e = values();
    }

    private Rotation(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static Rotation m139836a(int i) {
        for (Rotation rotation : f309804e) {
            if (rotation.mValue == i) {
                return rotation;
            }
        }
        return NORMAL;
    }

    /* renamed from: b */
    public static boolean m139837b(int i) {
        return i == 0 || i == 90 || i == 180 || i == 270;
    }
}
