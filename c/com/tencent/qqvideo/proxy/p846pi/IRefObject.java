package com.tencent.qqvideo.proxy.p846pi;

/* renamed from: com.tencent.qqvideo.proxy.pi.IRefObject */
public class IRefObject {
    private long mNativePtr;

    public IRefObject(long j) {
        this.mNativePtr = j;
    }

    private static native void freeNativePtr(long j);

    private synchronized long getNativePtr() {
        return this.mNativePtr;
    }

    public native void finalize();

    public native synchronized void release();

    public native synchronized void retain();
}
