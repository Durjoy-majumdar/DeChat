package com.tencent.maas;

public final class MJMaasNativeVersion {
    public static String getBuildNumber() {
        return nativeGetBuildNumber();
    }

    public static String getFullVersion() {
        return nativeGetFullVersion();
    }

    public static int getVersionIntValue() {
        return nativeGetVersionIntValue();
    }

    public static String getVersionNumber() {
        return nativeGetVersionNumber();
    }

    private static native String nativeGetBuildNumber();

    private static native String nativeGetFullVersion();

    private static native int nativeGetVersionIntValue();

    private static native String nativeGetVersionNumber();
}
