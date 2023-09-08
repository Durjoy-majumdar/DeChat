package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.v1 */
public final class C84790v1 implements Runnable {

    /* renamed from: d */
    public final Runnable f247216d;

    /* renamed from: e */
    public final Runnable f247217e;

    /* renamed from: f */
    public volatile boolean f247218f;

    /* renamed from: g */
    public AtomicInteger f247219g;

    public C84790v1(Runnable runnable, int i, Runnable runnable2) {
        C87412m.m108594g(runnable, "runnable");
        this.f247216d = runnable;
        this.f247217e = runnable2;
        this.f247219g = new AtomicInteger(i);
    }

    /* renamed from: a */
    public void mo117505a() {
        Log.m105924i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "countdown, curCount: " + this.f247219g.decrementAndGet());
        if (this.f247219g.get() <= 0) {
            run();
        }
    }

    public void run() {
        if (!(this.f247219g.get() <= 0)) {
            Log.m105924i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, reach0 is false, just return");
        } else if (this.f247218f) {
            Log.m105924i("MicroMsg.AppBrand.OneshotCancelableCountDownAbleRunnable", "run, hasRun");
        } else {
            this.f247216d.run();
            this.f247218f = true;
        }
    }
}
