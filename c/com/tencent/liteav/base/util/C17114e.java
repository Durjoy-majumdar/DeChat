package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.liteav.base.util.e */
final /* synthetic */ class C17114e implements Runnable {

    /* renamed from: a */
    private final Runnable f46158a;

    /* renamed from: b */
    private final CountDownLatch f46159b;

    private C17114e(Runnable runnable, CountDownLatch countDownLatch) {
        this.f46158a = runnable;
        this.f46159b = countDownLatch;
    }

    /* renamed from: a */
    public static Runnable m16923a(Runnable runnable, CountDownLatch countDownLatch) {
        return new C17114e(runnable, countDownLatch);
    }

    public final void run() {
        C17111b.m16917b(this.f46158a, this.f46159b);
    }
}
