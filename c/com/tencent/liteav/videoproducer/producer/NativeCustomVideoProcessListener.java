package com.tencent.liteav.videoproducer.producer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;

@JNINamespace("liteav::video")
public class NativeCustomVideoProcessListener implements CustomVideoProcessListener {
    private long mNativeVideoCustomProcessListener;

    private NativeCustomVideoProcessListener(long j) {
        this.mNativeVideoCustomProcessListener = j;
    }

    private native void nativeOnGLContextCreated(long j);

    private native void nativeOnGLContextDestroy(long j);

    private native void nativeOnProcessFrame(long j, PixelFrame pixelFrame, PixelFrame pixelFrame2, int i, int i2, long j2, int i3);

    private synchronized void reset() {
        this.mNativeVideoCustomProcessListener = 0;
    }

    public synchronized void onGLContextCreated() {
        long j = this.mNativeVideoCustomProcessListener;
        if (j != 0) {
            nativeOnGLContextCreated(j);
        }
    }

    public synchronized void onGLContextDestroy() {
        long j = this.mNativeVideoCustomProcessListener;
        if (j != 0) {
            nativeOnGLContextDestroy(j);
        }
    }

    public synchronized void onProcessFrame(PixelFrame pixelFrame, PixelFrame pixelFrame2) {
        long j = this.mNativeVideoCustomProcessListener;
        if (j != 0) {
            nativeOnProcessFrame(j, pixelFrame, pixelFrame2, pixelFrame.getWidth(), pixelFrame.getHeight(), pixelFrame.getTimestamp(), pixelFrame.getPixelFormatType().getValue());
        }
    }
}
