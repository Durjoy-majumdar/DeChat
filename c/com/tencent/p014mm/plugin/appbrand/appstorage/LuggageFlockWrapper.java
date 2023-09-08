package com.tencent.p014mm.plugin.appbrand.appstorage;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageFlockWrapper */
public final class LuggageFlockWrapper {
    private static native int isFileLocked(String str);

    public static boolean isFileLockedJNI(String str) {
        return isFileLocked(str) == 1;
    }

    private static native int lockFile(String str);

    public static void lockFileJNI(String str) {
        lockFile(str);
    }
}
