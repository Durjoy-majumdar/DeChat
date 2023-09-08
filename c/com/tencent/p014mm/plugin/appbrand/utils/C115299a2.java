package com.tencent.p014mm.plugin.appbrand.utils;

import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.a2 */
public final class C115299a2 implements Runnable {

    /* renamed from: d */
    public final Runnable f345508d;

    /* renamed from: e */
    public volatile boolean f345509e;

    public C115299a2(Runnable runnable) {
        C87412m.m108594g(runnable, "realRunnable");
        this.f345508d = runnable;
    }

    public void run() {
        this.f345508d.run();
        this.f345509e = true;
    }
}
