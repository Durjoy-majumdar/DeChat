package com.tencent.qqmusic.mediaplayer;

import com.tencent.qqmusic.mediaplayer.util.Logger;

class NativeLog {
    private static final String TAG = "NativeLog";

    static {
        if (NativeLibs.audioCommon.load()) {
            Logger.m21791i(TAG, "[static initializer] NativeLog load succeed.");
        }
    }

    public static native int init(String str);
}
