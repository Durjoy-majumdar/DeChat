package com.tencent.p014mm.plugin.appbrand.utils;

import com.tencent.p014mm.plugin.appbrand.utils.C84712a.C84713a;
import fy3.C32224a;
import gy3.C87412m;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.a */
public abstract class C84712a<T extends C84713a> {

    /* renamed from: d */
    public final int f247101d;

    /* renamed from: e */
    public final LinkedBlockingQueue<T> f247102e = new LinkedBlockingQueue<>();

    /* renamed from: f */
    public final AtomicInteger f247103f = new AtomicInteger(0);

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.a$a */
    public interface C84713a {
    }

    public C84712a(int i) {
        this.f247101d = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo117441d(T r3) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f247103f
            int r0 = r0.incrementAndGet()
            int r1 = r2.f247101d
            if (r0 > r1) goto L_0x0013
            com.tencent.mm.plugin.appbrand.utils.b r0 = new com.tencent.mm.plugin.appbrand.utils.b
            r0.<init>(r2)
            r2.mo114562g(r3, r0)
            return
        L_0x0013:
            java.util.concurrent.LinkedBlockingQueue<T> r0 = r2.f247102e
            r0.offer(r3)
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f247103f
            int r3 = r3.decrementAndGet()
            int r0 = r2.f247101d
            if (r3 < r0) goto L_0x0023
            return
        L_0x0023:
            java.util.concurrent.LinkedBlockingQueue<T> r3 = r2.f247102e
            java.lang.Object r3 = r3.poll()
            com.tencent.mm.plugin.appbrand.utils.a$a r3 = (com.tencent.p014mm.plugin.appbrand.utils.C84712a.C84713a) r3
            if (r3 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.utils.C84712a.mo117441d(com.tencent.mm.plugin.appbrand.utils.a$a):void");
    }

    /* renamed from: e */
    public boolean mo114561e(T t) {
        C87412m.m108594g(t, "task");
        return false;
    }

    /* renamed from: f */
    public void mo117442f() {
    }

    /* renamed from: g */
    public abstract void mo114562g(T t, C32224a<C13598b0> aVar);
}
