package com.tencent.thumbplayer.core.drm;

import com.tencent.thumbplayer.core.common.TPNativeLog;

public final class TPDrmInterruptCallbackProxy implements ITPDrmInterruptCallback {
    private long mNativeContext;

    private TPDrmInterruptCallbackProxy() {
    }

    private native boolean native_isInterrupted();

    public boolean isInterrupted() {
        try {
            return native_isInterrupted();
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
            return false;
        }
    }
}
