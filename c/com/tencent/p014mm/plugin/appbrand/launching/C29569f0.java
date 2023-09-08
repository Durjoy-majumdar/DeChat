package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C53916l;
import java.util.concurrent.TimeoutException;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.f0 */
public final class C29569f0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C53916l<C13598b0> f80486d;

    public C29569f0(C53916l<? super C13598b0> lVar) {
        this.f80486d = lVar;
    }

    public final void run() {
        if (this.f80486d.mo74597a()) {
            this.f80486d.mo74591G(new TimeoutException());
        }
    }
}
