package com.tencent.p014mm.plugin.appbrand.page;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$s */
public class m0$$s implements m0$$x {

    /* renamed from: d */
    public final AtomicBoolean f244815d = new AtomicBoolean(false);

    /* renamed from: e */
    public final /* synthetic */ Runnable f244816e;

    public m0$$s(C83849m0 m0Var, Runnable runnable) {
        this.f244816e = runnable;
    }

    /* renamed from: h5 */
    public /* synthetic */ void mo116384h5(boolean z) {
    }

    public void run() {
        if (!this.f244815d.getAndSet(true)) {
            this.f244816e.run();
        }
    }
}
