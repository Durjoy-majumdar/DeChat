package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.j1 */
public class C105647j1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C105724z.C105727d f314141d;

    public C105647j1(C105724z.C105727d dVar) {
        this.f314141d = dVar;
    }

    public void run() {
        C105724z zVar = C105724z.this;
        if (zVar.f314403o != C105724z.C85291s.ReasonManual) {
            zVar.f314403o = C105724z.C85291s.ReasonInterrupted;
        }
        zVar.f314406p0.mo150490c(8, zVar.f314366S0, (byte[]) null);
    }
}
