package com.tencent.liteav.base.util;

import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.liteav.base.util.l */
public final class C17118l {

    /* renamed from: a */
    public final ThreadPoolExecutor f46165a;

    /* renamed from: b */
    public final C17111b f46166b;

    /* renamed from: c */
    public final Map<Runnable, C17119a> f46167c;

    /* renamed from: com.tencent.liteav.base.util.l$a */
    public class C17119a {

        /* renamed from: a */
        public final Runnable f46168a;

        /* renamed from: b */
        public final Runnable f46169b = C17122o.m16933a(this);

        /* renamed from: c */
        public final long f46170c;

        public C17119a(Runnable runnable, long j) {
            this.f46168a = C17121n.m16932a(this, runnable);
            this.f46170c = j;
        }
    }

    public C17118l() {
        this(60);
    }

    /* renamed from: a */
    public final void mo19369a(Runnable runnable) {
        this.f46165a.execute(runnable);
    }

    /* renamed from: b */
    public final void mo19371b(Runnable runnable) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f46165a.execute(C17120m.m16931a(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public final void mo19372c(Runnable runnable) {
        C17119a remove;
        if (runnable != null) {
            this.f46165a.remove(runnable);
            synchronized (this) {
                remove = this.f46167c.remove(runnable);
            }
            if (remove != null) {
                C17118l.this.f46166b.removeCallbacks(remove.f46169b);
                C17118l.this.f46165a.remove(remove.f46168a);
            }
        }
    }

    public C17118l(int i) {
        this.f46165a = new ThreadPoolExecutor(0, 1, (long) i, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f46166b = new C17111b(Looper.getMainLooper());
        this.f46167c = new HashMap();
    }

    /* renamed from: a */
    public final void mo19370a(Runnable runnable, long j) {
        C17119a aVar = new C17119a(runnable, j);
        synchronized (this) {
            this.f46167c.put(runnable, aVar);
        }
        C17118l.this.f46166b.postDelayed(aVar.f46169b, aVar.f46170c);
    }
}
