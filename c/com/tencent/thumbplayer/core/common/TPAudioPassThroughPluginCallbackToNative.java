package com.tencent.thumbplayer.core.common;

import com.tencent.thumbplayer.core.common.TPAudioPassThroughPluginDetector;

public class TPAudioPassThroughPluginCallbackToNative implements TPAudioPassThroughPluginDetector.AudioPassThroughPluginListener {
    private static final String TAG = "TPAudioPassThroughPluginCallback";
    private long mNativeContext;

    private TPAudioPassThroughPluginCallbackToNative(long j) {
        this.mNativeContext = j;
    }

    private native void _onAudioPassThroughStateChanged(boolean z);

    private long getNativeContext() {
        return this.mNativeContext;
    }

    private void registerCallback() {
        TPAudioPassThroughPluginDetector.addListener(this);
    }

    private void unregisterCallback() {
        TPAudioPassThroughPluginDetector.removeListener(this);
    }

    public void onAudioPassThroughPlugin(boolean z) {
        TPNativeLog.printLog(2, TAG, "onAudioPassThroughPlugin bPlugin:" + z);
        _onAudioPassThroughStateChanged(z);
    }
}
