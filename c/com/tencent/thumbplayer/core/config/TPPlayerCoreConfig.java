package com.tencent.thumbplayer.core.config;

import com.tencent.thumbplayer.core.common.TPNativeLibraryLoader;
import com.tencent.thumbplayer.core.common.TPNativeLog;

public class TPPlayerCoreConfig {
    private static boolean mCoreEventProcessEnable = false;
    private static boolean mMediaDrmReuseEnable = false;
    private static int mVideoMediaCodecCoexistMaxCnt = 0;
    private static boolean mVideoMediaCodecStuckCheckEnable = true;
    private static String mWidevineProvisioningServerUrl = "";

    private static native void _setMediaDrmReuseEnable(boolean z);

    private static native void _setWidevineProvisioningServerUrl(String str);

    public static boolean getCoreEventProcessEnable() {
        return mCoreEventProcessEnable;
    }

    public static boolean getMediaDrmReuseEnable() {
        return mMediaDrmReuseEnable;
    }

    public static int getVideoMediaCodecCoexistMaxCnt() {
        return mVideoMediaCodecCoexistMaxCnt;
    }

    public static String getWidevineProvisioningServerUrl() {
        return mWidevineProvisioningServerUrl;
    }

    public static void setCoreEventProcessEnable(boolean z) {
        mCoreEventProcessEnable = z;
    }

    public static void setMediaDrmReuseEnable(boolean z) {
        if (!TPNativeLibraryLoader.isLibLoaded()) {
            TPNativeLog.printLog(3, "setMediaDrmReuseEnable, PlayerCore library has not been loaded");
            return;
        }
        mMediaDrmReuseEnable = z;
        try {
            _setMediaDrmReuseEnable(z);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.toString());
        }
    }

    public static void setVideoMediaCodecCoexistMaxCnt(int i) {
        mVideoMediaCodecCoexistMaxCnt = i;
    }

    public static void setVideoMediaCodecStuckCheckEnable(Boolean bool) {
        TPNativeLog.printLog(2, "setVideoMediaCodecStuckCheckEnable, enable:" + bool);
        mVideoMediaCodecStuckCheckEnable = bool.booleanValue();
    }

    public static void setWidevineProvisioningServerUrl(String str) {
        if (!TPNativeLibraryLoader.isLibLoaded()) {
            TPNativeLog.printLog(3, "setWidevineProvisioningServerUrl,PlayerCore library has not been loaded");
            return;
        }
        mWidevineProvisioningServerUrl = str;
        try {
            _setWidevineProvisioningServerUrl(str);
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.toString());
        }
    }
}
