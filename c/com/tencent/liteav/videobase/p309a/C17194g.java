package com.tencent.liteav.videobase.p309a;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.liteav.videobase.a.g */
final /* synthetic */ class C17194g implements Runnable {

    /* renamed from: a */
    private final Runnable f46459a;

    /* renamed from: b */
    private final CountDownLatch f46460b;

    private C17194g(Runnable runnable, CountDownLatch countDownLatch) {
        this.f46459a = runnable;
        this.f46460b = countDownLatch;
    }

    /* renamed from: a */
    public static Runnable m17034a(Runnable runnable, CountDownLatch countDownLatch) {
        return new C17194g(runnable, countDownLatch);
    }

    public final void run() {
        C17189b.lambda$runOnDrawAndWaitDone$4(this.f46459a, this.f46460b);
    }
}
