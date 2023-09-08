package com.tencent.maas.instamovie;

import android.os.Handler;
import com.facebook.jni.HybridData;

public class MJResourcePreloader {
    private final HybridData mHybridData;

    public MJResourcePreloader(Handler handler) {
        this.mHybridData = initHybrid(handler);
    }

    private native HybridData initHybrid(Handler handler);

    private native void nativeSetConcurrencyLimit(int i);

    private native void nativeSetPreloadResourceSizeLimit(long j);

    private native void nativeStartPreloading();

    private native void nativeStopPreloading();

    private native void nativeUpdateExpectedResourceUsage(MJResourceUsageDesc mJResourceUsageDesc);

    public void release() {
        this.mHybridData.resetNative();
    }

    public void setConcurrencyLimit(int i) {
        nativeSetConcurrencyLimit(i);
    }

    public void setPreloadResourceSizeLimit(long j) {
        nativeSetPreloadResourceSizeLimit(j);
    }

    public void startPreloading() {
        nativeStartPreloading();
    }

    public void stopPreloading() {
        nativeStopPreloading();
    }

    public void updateExpectedResourceUsage(MJResourceUsageDesc mJResourceUsageDesc) {
        nativeUpdateExpectedResourceUsage(mJResourceUsageDesc);
    }
}
