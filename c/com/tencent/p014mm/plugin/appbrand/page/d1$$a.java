package com.tencent.p014mm.plugin.appbrand.page;

import java.util.Objects;
import java.util.concurrent.Callable;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$a */
public final /* synthetic */ class d1$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f244586d;

    /* renamed from: e */
    public final /* synthetic */ int f244587e;

    public /* synthetic */ d1$$a(C83780d1 d1Var, int i) {
        this.f244586d = d1Var;
        this.f244587e = i;
    }

    public final Object call() {
        Integer valueOf;
        C83780d1 d1Var = this.f244586d;
        int i = this.f244587e;
        synchronized (d1Var.f244565Q0) {
            int min = Math.min(d1Var.mo116148C0() - 1, Math.max(i, 0));
            for (int i2 = 0; i2 < min; i2++) {
                C83859n4 n4Var = d1Var.f244571T0;
                Objects.requireNonNull(n4Var);
                ((C83787e) n4Var).mo116250i();
            }
            valueOf = Integer.valueOf(min);
        }
        return valueOf;
    }
}
