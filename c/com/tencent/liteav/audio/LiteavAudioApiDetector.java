package com.tencent.liteav.audio;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;

@JNINamespace("liteav::audio")
class LiteavAudioApiDetector {
    private static final boolean DEBUG = true;
    private static final String TAG = "LiteavAudioApiDetector";
    private boolean mIsAAudioSupported;
    private boolean mIsOboeSupported;
    private boolean mIsOpenSLSupported;

    public LiteavAudioApiDetector(long j) {
        storeAudioParameters();
        nativeCacheAudioParameters(j, this.mIsOpenSLSupported, this.mIsAAudioSupported);
    }

    private boolean isAAudioSupported() {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 27;
    }

    private boolean isOboeSupported() {
        return isOpenSLSupported() || isAAudioSupported();
    }

    private boolean isOpenSLSupported() {
        return LiteavSystemInfo.getSystemOSVersionInt() >= 24;
    }

    private static native void nativeCacheAudioParameters(long j, boolean z, boolean z2);

    private void storeAudioParameters() {
        this.mIsOboeSupported = isOboeSupported();
        this.mIsOpenSLSupported = isOpenSLSupported();
        this.mIsAAudioSupported = isAAudioSupported();
    }
}
