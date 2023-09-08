package com.tencent.p014mm.plugin.appbrand.utils;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.g2 */
public class C2039g2 {
    /* renamed from: a */
    public static boolean m1987a() {
        return Looper.getMainLooper() == Looper.myLooper() || Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    /* renamed from: b */
    public static void m1988b(Runnable runnable) {
        if (m1987a()) {
            runnable.run();
        } else {
            MMHandlerThread.postToMainThread(runnable);
        }
    }
}
