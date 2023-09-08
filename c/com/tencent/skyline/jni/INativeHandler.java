package com.tencent.skyline.jni;

public interface INativeHandler {
    void checkAndPost(Runnable runnable);
}
