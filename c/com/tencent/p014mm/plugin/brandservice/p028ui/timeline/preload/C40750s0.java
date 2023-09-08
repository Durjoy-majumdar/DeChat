package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import ex0.C45700h;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.s0 */
public final class C40750s0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f109501d;

    /* renamed from: e */
    public final /* synthetic */ C45700h.C45701a f109502e;

    public C40750s0(long j, C45700h.C45701a aVar) {
        this.f109501d = j;
        this.f109502e = aVar;
    }

    public final void run() {
        C40746q0.f109488b.put(Long.valueOf(this.f109501d), new WeakReference(this.f109502e));
    }
}
