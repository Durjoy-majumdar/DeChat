package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.liteav.base.util.m */
final /* synthetic */ class C17120m implements Runnable {

    /* renamed from: a */
    private final Runnable f46172a;

    /* renamed from: b */
    private final CountDownLatch f46173b;

    private C17120m(Runnable runnable, CountDownLatch countDownLatch) {
        this.f46172a = runnable;
        this.f46173b = countDownLatch;
    }

    /* renamed from: a */
    public static Runnable m16931a(Runnable runnable, CountDownLatch countDownLatch) {
        return new C17120m(runnable, countDownLatch);
    }

    public final void run() {
        Runnable runnable = this.f46172a;
        CountDownLatch countDownLatch = this.f46173b;
        runnable.run();
        countDownLatch.countDown();
    }
}
