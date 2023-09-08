package com.tencent.liteav.videoconsumer.consumer;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.TakeSnapshotListener;

@JNINamespace("liteav::video")
public class NativeSnapshotListener implements TakeSnapshotListener {
    private long mNativeVideoSnapListener;

    private NativeSnapshotListener(long j) {
        this.mNativeVideoSnapListener = j;
    }

    private native void nativeDestroy(long j);

    private native void nativeOnComplete(long j, Bitmap bitmap);

    public void finalize() {
        long j = this.mNativeVideoSnapListener;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeVideoSnapListener = 0;
        }
        super.finalize();
    }

    public void onComplete(Bitmap bitmap) {
        long j = this.mNativeVideoSnapListener;
        if (j != 0) {
            nativeOnComplete(j, bitmap);
            this.mNativeVideoSnapListener = 0;
        }
    }
}
