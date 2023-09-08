package com.tencent.liteav.base.util;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.base.util.b */
public final class C17111b extends Handler {

    /* renamed from: a */
    private static final long f46153a = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: b */
    private final Handler f46154b;

    /* renamed from: c */
    private Runnable f46155c;

    public C17111b(Looper looper) {
        super(looper);
        this.f46154b = new Handler(Looper.getMainLooper());
        this.f46155c = C17112c.m16921a(this);
    }

    /* renamed from: a */
    public final boolean mo19361a(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean post = post(C17114e.m16923a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return post;
    }

    /* renamed from: b */
    public static /* synthetic */ void m16917b(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    public C17111b(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f46154b = new Handler(Looper.getMainLooper());
        this.f46155c = C17113d.m16922a(this);
    }

    /* renamed from: a */
    public final boolean mo19362a(Runnable runnable, long j) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        boolean post = post(C17115f.m16924a(runnable, countDownLatch));
        if (post) {
            try {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        return post;
    }

    /* renamed from: a */
    public static /* synthetic */ void m16914a(Runnable runnable, CountDownLatch countDownLatch) {
        runnable.run();
        countDownLatch.countDown();
    }

    /* renamed from: a */
    public final void mo19360a() {
        post(C17117h.m16926a(this, C17116g.m16925a(this)));
        this.f46154b.postDelayed(this.f46155c, f46153a);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m16915a(C17111b bVar) {
        LiteavLog.m16902i("TXCHandler", "queueIdle on %s", Looper.myLooper());
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            bVar.getLooper().quitSafely();
        } else {
            bVar.getLooper().quit();
        }
        bVar.f46154b.removeCallbacks(bVar.f46155c);
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ void m16913a(C17111b bVar, MessageQueue.IdleHandler idleHandler) {
        if (bVar.getLooper() == Looper.getMainLooper()) {
            LiteavLog.m16898e("TXCHandler", "try to quitLooper main looper!");
            return;
        }
        LiteavLog.m16902i("TXCHandler", "add idle handle for %s", bVar.getLooper());
        Looper.myQueue().addIdleHandler(idleHandler);
    }
}
