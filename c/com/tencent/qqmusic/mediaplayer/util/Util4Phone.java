package com.tencent.qqmusic.mediaplayer.util;

public class Util4Phone {
    private static final String TAG = "Util4Phone";

    public static boolean isSupportARMv7() {
        try {
            return Util4NativeCommon.isSupportARMv7();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "isSupportARMv7", th);
            return true;
        }
    }

    public static boolean isSupportNeon() {
        try {
            return Util4NativeCommon.isSupportNeon();
        } catch (Throwable th) {
            Logger.m21788e(TAG, "isSupportNeon", th);
            return false;
        }
    }
}
