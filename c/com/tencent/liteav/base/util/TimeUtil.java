package com.tencent.liteav.base.util;

public class TimeUtil {
    /* renamed from: a */
    public static long m16909a() {
        return nativeGetTimestamp();
    }

    private static native long nativeGetTimestamp();
}
