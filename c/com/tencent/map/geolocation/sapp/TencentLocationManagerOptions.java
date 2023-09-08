package com.tencent.map.geolocation.sapp;

public class TencentLocationManagerOptions {
    public static String mKey = "";
    public static boolean sLoadLibrary = true;

    public static String getKey() {
        return mKey;
    }

    public static boolean isLoadLibraryEnabled() {
        return sLoadLibrary;
    }

    public static boolean setKey(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        mKey = str;
        return true;
    }

    public static void setLoadLibraryEnabled(boolean z) {
        sLoadLibrary = z;
    }
}
