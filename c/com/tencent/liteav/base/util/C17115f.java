package com.tencent.liteav.base.util;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.liteav.base.util.f */
final /* synthetic */ class C17115f implements Runnable {

    /* renamed from: a */
    private final Runnable f46160a;

    /* renamed from: b */
    private final CountDownLatch f46161b;

    private C17115f(Runnable runnable, CountDownLatch countDownLatch) {
        this.f46160a = runnable;
        this.f46161b = countDownLatch;
    }

    /* renamed from: a */
    public static Runnable m16924a(Runnable runnable, CountDownLatch countDownLatch) {
        return new C17115f(runnable, countDownLatch);
    }

    public final void run() {
        C17111b.m16914a(this.f46160a, this.f46161b);
    }
}
