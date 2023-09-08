package com.tencent.p014mm.plugin.appbrand.debugger;

import te3.ew4;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.q0 */
public class C68607q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f197069d;

    /* renamed from: e */
    public final /* synthetic */ ew4 f197070e;

    /* renamed from: f */
    public final /* synthetic */ C68600m0 f197071f;

    public C68607q0(C68600m0 m0Var, int i, ew4 ew4) {
        this.f197071f = m0Var;
        this.f197069d = i;
        this.f197070e = ew4;
    }

    public void run() {
        C68600m0 m0Var = this.f197071f;
        C68600m0.m80856a(m0Var, "cmdId " + this.f197069d + ", errCode " + this.f197070e.f133149d);
    }
}
