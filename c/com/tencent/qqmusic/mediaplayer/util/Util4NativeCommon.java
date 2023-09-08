package com.tencent.qqmusic.mediaplayer.util;

import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;
import com.tencent.qqmusic.mediaplayer.NativeLibs;

public class Util4NativeCommon {
    private static final String TAG = "Util4NativeCommon";

    static {
        try {
            AudioPlayerConfigure.getSoLibraryLoader().load(NativeLibs.audioCommon.getName());
        } catch (Throwable th) {
            Logger.m21790e(TAG, th);
        }
    }

    public static native boolean isSupportARMv7();

    public static native boolean isSupportNeon();
}
