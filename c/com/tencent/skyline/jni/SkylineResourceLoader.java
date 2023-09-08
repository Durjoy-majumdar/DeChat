package com.tencent.skyline.jni;

import android.graphics.Bitmap;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.skyline.SkylineLog;
import com.tencent.skyline.jni.ISkylineResourceLoader;

public final class SkylineResourceLoader {
    private static final String TAG = "SkylineResourceLoader";
    public boolean isInit = true;
    private ISkylineResourceLoader mDelegate;

    /* access modifiers changed from: private */
    public native void nativeNotifyBitmapLoad(int i, Bitmap bitmap, int i2, int i3);

    /* access modifiers changed from: private */
    public native void nativeNotifyResourceLoad(long j, byte[] bArr);

    public void init() {
        SkylineLog.INSTANCE.mo120226i(TAG, APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        synchronized (this) {
            this.isInit = true;
        }
    }

    public void initResourceLoader(ISkylineResourceLoader iSkylineResourceLoader) {
        this.mDelegate = iSkylineResourceLoader;
    }

    public Bitmap loadBitmap(String str) {
        ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        if (iSkylineResourceLoader != null) {
            return iSkylineResourceLoader.loadBitmap(str);
        }
        return null;
    }

    public void loadBitmapAsync(final int i, String str) {
        ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        if (iSkylineResourceLoader != null) {
            iSkylineResourceLoader.loadBitmapAsync(str, new ISkylineResourceLoader.BitmapLoadCallback() {
                public void onBitmapLoaded(Bitmap bitmap) {
                    if (bitmap == null) {
                        SkylineLog skylineLog = SkylineLog.INSTANCE;
                        skylineLog.mo120223e(SkylineResourceLoader.TAG, "requestId:" + i + " resource is null, return");
                        SkylineResourceLoader.this.nativeNotifyBitmapLoad(i, (Bitmap) null, 0, 0);
                        return;
                    }
                    SkylineResourceLoader.this.nativeNotifyBitmapLoad(i, bitmap, bitmap.getWidth(), bitmap.getHeight());
                }
            });
        } else {
            nativeNotifyBitmapLoad(i, (Bitmap) null, 0, 0);
        }
    }

    public byte[] loadResource(String str) {
        ISkylineResourceLoader iSkylineResourceLoader = this.mDelegate;
        return iSkylineResourceLoader != null ? iSkylineResourceLoader.loadResource(str) : new byte[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r0.loadResourceAsync(r5, new com.tencent.skyline.jni.SkylineResourceLoader.C860401(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        nativeNotifyResourceLoad(r3, new byte[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r0 = r2.mDelegate;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 == null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadResourceAsync(final long r3, java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isInit     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0010
            com.tencent.skyline.SkylineLog r3 = com.tencent.skyline.SkylineLog.INSTANCE     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = "SkylineResourceLoader"
            java.lang.String r5 = "isInit is false, ignore"
            r3.mo120229w(r4, r5)     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return
        L_0x0010:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            com.tencent.skyline.jni.ISkylineResourceLoader r0 = r2.mDelegate
            if (r0 == 0) goto L_0x001e
            com.tencent.skyline.jni.SkylineResourceLoader$1 r1 = new com.tencent.skyline.jni.SkylineResourceLoader$1
            r1.<init>(r3)
            r0.loadResourceAsync(r5, r1)
            goto L_0x0024
        L_0x001e:
            r5 = 0
            byte[] r5 = new byte[r5]
            r2.nativeNotifyResourceLoad(r3, r5)
        L_0x0024:
            return
        L_0x0025:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.skyline.jni.SkylineResourceLoader.loadResourceAsync(long, java.lang.String):void");
    }

    public void release() {
        SkylineLog.INSTANCE.mo120226i(TAG, "release");
        synchronized (this) {
            this.isInit = false;
        }
    }
}
