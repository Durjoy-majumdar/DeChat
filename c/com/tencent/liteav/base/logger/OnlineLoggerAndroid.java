package com.tencent.liteav.base.logger;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
public class OnlineLoggerAndroid {
    private static final int INVALID_INSTANCE = -1;
    private long mNativeOnlineLoggerAndroid = -1;

    /* renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$a */
    public enum C104504a {
        kApi(1),
        kInfo(2),
        kWarning(3),
        kError(4);
        
        public int level;

        private C104504a(int i) {
            this.level = i;
        }
    }

    /* renamed from: com.tencent.liteav.base.logger.OnlineLoggerAndroid$b */
    public enum C104505b {
        kTRTC,
        kLive
    }

    public OnlineLoggerAndroid(C104505b bVar, int i, String str, String str2) {
        this.mNativeOnlineLoggerAndroid = nativeCreate(bVar.ordinal(), i, str, str2);
    }

    private static native long nativeCreate(int i, int i2, String str, String str2);

    private static native void nativeDestroy(long j);

    private static native void nativeLog(long j, int i, String str);

    public synchronized void destroy() {
        long j = this.mNativeOnlineLoggerAndroid;
        if (j != -1) {
            nativeDestroy(j);
            this.mNativeOnlineLoggerAndroid = -1;
        }
    }

    public void finalize() {
        super.finalize();
        destroy();
    }

    public synchronized void log(C104504a aVar, String str) {
        long j = this.mNativeOnlineLoggerAndroid;
        if (j != -1) {
            nativeLog(j, aVar.level, str);
        }
    }
}
