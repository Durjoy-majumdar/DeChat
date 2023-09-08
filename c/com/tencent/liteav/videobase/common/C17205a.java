package com.tencent.liteav.videobase.common;

/* renamed from: com.tencent.liteav.videobase.common.a */
public enum C17205a {
    UNKNOWN(65535),
    IDR(0),
    P(1),
    B(2),
    SEI(3),
    I(4),
    P_MULTI_REF(5),
    SPS(18),
    PPS(19),
    VPS(20);
    

    /* renamed from: k */
    private static final C17205a[] f46537k = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        f46537k = values();
    }

    private C17205a(int i) {
        this.mValue = i;
    }

    /* renamed from: a */
    public static C17205a m17048a(int i) {
        for (C17205a aVar : f46537k) {
            if (aVar.mValue == i) {
                return aVar;
            }
        }
        return UNKNOWN;
    }
}
