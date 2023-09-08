package com.tencent.thumbplayer.core.common;

import android.content.Context;

public class TPFeatureCapability {
    private static String TAG = "TPFeatureCapability";
    private static boolean mIsLibLoaded;

    static {
        try {
            TPNativeLibraryLoader.loadLibIfNeeded((Context) null);
            mIsLibLoaded = true;
        } catch (UnsupportedOperationException e) {
            TPNativeLog.printLog(4, e.getMessage());
            mIsLibLoaded = false;
        }
    }

    private static native boolean _isFeatureSupport(int i);

    public static boolean isFeatureSupport(int i) {
        if (isLibLoaded()) {
            try {
                return _isFeatureSupport(i);
            } catch (Throwable th) {
                TPNativeLog.printLog(4, th.getMessage());
                throw new TPNativeLibraryException("Failed to call _isFeatureSupport.");
            }
        } else {
            throw new TPNativeLibraryException("isFeatureSupport: Failed to load native library.");
        }
    }

    private static boolean isLibLoaded() {
        return mIsLibLoaded;
    }
}
