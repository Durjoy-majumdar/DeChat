package com.tencent.liteav.videobase.common;

/* renamed from: com.tencent.liteav.videobase.common.b */
public enum C17206b {
    UNKNOWN(0),
    BASELINE(1),
    MAIN(2),
    HIGH(3),
    BASELINE_RPS(4),
    MAIN_RPS(5),
    HIGH_RPS(6);
    

    /* renamed from: h */
    private static final C17206b[] f46546h = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        f46546h = values();
    }

    private C17206b(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static C17206b m17049a(int i) {
        for (C17206b bVar : f46546h) {
            if (bVar.mValue == i) {
                return bVar;
            }
        }
        return UNKNOWN;
    }
}
