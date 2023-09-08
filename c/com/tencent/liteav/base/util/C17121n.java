package com.tencent.liteav.base.util;

import com.tencent.liteav.base.util.C17118l;

/* renamed from: com.tencent.liteav.base.util.n */
final /* synthetic */ class C17121n implements Runnable {

    /* renamed from: a */
    private final C17118l.C17119a f46174a;

    /* renamed from: b */
    private final Runnable f46175b;

    private C17121n(C17118l.C17119a aVar, Runnable runnable) {
        this.f46174a = aVar;
        this.f46175b = runnable;
    }

    /* renamed from: a */
    public static Runnable m16932a(C17118l.C17119a aVar, Runnable runnable) {
        return new C17121n(aVar, runnable);
    }

    public final void run() {
        C17118l.C17119a aVar = this.f46174a;
        Runnable runnable = this.f46175b;
        runnable.run();
        synchronized (C17118l.this) {
            C17118l.this.f46167c.remove(runnable);
        }
    }
}
