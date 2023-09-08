package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.VersionUtilities */
public class VersionUtilities {
    public static boolean checkAlphaVersion(int i) {
        int i2 = i & 255;
        return i2 >= 16 && i2 <= 47;
    }

    public static boolean checkDevVersion(int i) {
        return (i & 255) <= 15;
    }

    public static boolean checkGPVersion(int i) {
        int i2 = i & 255;
        return i2 >= 64 && i2 <= 79;
    }

    public static boolean checkRCVersion(int i) {
        int i2 = i & 255;
        return i2 >= 48 && i2 <= 95;
    }

    public static boolean checkTestVersion(int i) {
        return (i & 255) >= 96;
    }
}
