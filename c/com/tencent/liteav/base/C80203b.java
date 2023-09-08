package com.tencent.liteav.base;

import android.os.StrictMode;
import java.io.Closeable;

/* renamed from: com.tencent.liteav.base.b */
public final class C80203b implements Closeable {

    /* renamed from: a */
    private final StrictMode.ThreadPolicy f234751a;

    /* renamed from: b */
    private final StrictMode.VmPolicy f234752b;

    private C80203b(StrictMode.ThreadPolicy threadPolicy) {
        this.f234751a = threadPolicy;
        this.f234752b = null;
    }

    /* renamed from: a */
    public static C80203b m97552a() {
        return new C80203b(StrictMode.allowThreadDiskWrites(), (byte) 0);
    }

    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f234751a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f234752b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private C80203b(StrictMode.ThreadPolicy threadPolicy, byte b) {
        this(threadPolicy);
    }
}
