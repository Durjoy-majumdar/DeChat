package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.videobase.C17259f;

@JNINamespace("liteav::video")
public class VideoConsumerReporter extends C17259f {
    public VideoConsumerReporter(long j) {
        this.mNativeVideoReporter = j;
    }

    public native void nativeNotifyError(long j, int i, String str);

    public native void nativeNotifyEvent(long j, int i, String str);

    public native void nativeNotifyWarning(long j, int i, String str);

    public native void nativeUpdateKeyStatus(long j, int i, int i2, double d);

    public native void nativeUpdateKeyStatusObject(long j, int i, int i2, Object obj);

    public native void nativeUpdateStatus(long j, int i, double d);

    public native void nativeUpdateStatusObject(long j, int i, Object obj);

    public native void nativeUpdateStatusString(long j, int i, String str);

    public synchronized long resetNativeHandle() {
        long j;
        j = this.mNativeVideoReporter;
        this.mNativeVideoReporter = 0;
        return j;
    }
}
