package com.tencent.xweb.skia_canvas;

class NativeRunnable implements Runnable {
    private boolean mHasRun;
    private final long mNativePeer;

    private NativeRunnable(long j) {
        this.mNativePeer = j;
    }

    public static NativeRunnable Create(long j) {
        return new NativeRunnable(j);
    }

    private native void releaseNative(long j);

    private native void runNative(long j);

    public void finalize() {
        super.finalize();
        if (!this.mHasRun) {
            releaseNative(this.mNativePeer);
        }
    }

    public void run() {
        if (!this.mHasRun) {
            runNative(this.mNativePeer);
            releaseNative(this.mNativePeer);
            this.mHasRun = true;
        }
    }
}
