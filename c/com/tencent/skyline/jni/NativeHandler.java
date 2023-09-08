package com.tencent.skyline.jni;

public class NativeHandler implements INativeHandler {
    private static final String TAG = "NativeHandler";
    private INativeHandler nativeHandlerProxy;

    public void checkAndPost(long j) {
        checkAndPost((Runnable) NativeRunnable.Create(j));
    }

    public void init(INativeHandler iNativeHandler) {
        this.nativeHandlerProxy = iNativeHandler;
    }

    public void checkAndPost(Runnable runnable) {
        INativeHandler iNativeHandler = this.nativeHandlerProxy;
        if (iNativeHandler != null) {
            iNativeHandler.checkAndPost(runnable);
        }
    }
}
