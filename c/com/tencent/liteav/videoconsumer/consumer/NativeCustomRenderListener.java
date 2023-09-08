package com.tencent.liteav.videoconsumer.consumer;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videoconsumer.renderer.VideoRenderListener;

@JNINamespace("liteav::video")
public class NativeCustomRenderListener implements VideoRenderListener {
    public static final String TAG = "NativeCustomRenderListener";
    private long mNativeVideoCustomRenderListener;

    private NativeCustomRenderListener(long j) {
        this.mNativeVideoCustomRenderListener = j;
    }

    private native void nativeOnCustomRenderFrame(long j, PixelFrame pixelFrame, int i, int i2, long j2, int i3);

    private synchronized void reset() {
        this.mNativeVideoCustomRenderListener = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onRenderFrame(com.tencent.liteav.videobase.frame.PixelFrame r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mNativeVideoCustomRenderListener     // Catch:{ all -> 0x0035 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0033
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r0 = r10.getPixelFormatType()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x0018
            java.lang.String r10 = "NativeCustomRenderListener"
            java.lang.String r0 = "PixelFrame PixelFormatType is null."
            com.tencent.liteav.base.util.LiteavLog.m16901i(r10, r0)     // Catch:{ all -> 0x0035 }
            monitor-exit(r9)
            return
        L_0x0018:
            long r1 = r9.mNativeVideoCustomRenderListener     // Catch:{ all -> 0x0035 }
            int r4 = r10.getWidth()     // Catch:{ all -> 0x0035 }
            int r5 = r10.getHeight()     // Catch:{ all -> 0x0035 }
            long r6 = r10.getTimestamp()     // Catch:{ all -> 0x0035 }
            com.tencent.liteav.videobase.base.GLConstants$PixelFormatType r0 = r10.getPixelFormatType()     // Catch:{ all -> 0x0035 }
            int r8 = r0.getValue()     // Catch:{ all -> 0x0035 }
            r0 = r9
            r3 = r10
            r0.nativeOnCustomRenderFrame(r1, r3, r4, r5, r6, r8)     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r9)
            return
        L_0x0035:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.videoconsumer.consumer.NativeCustomRenderListener.onRenderFrame(com.tencent.liteav.videobase.frame.PixelFrame):void");
    }

    public void onRenderTargetSizeChanged(int i, int i2) {
    }
}
