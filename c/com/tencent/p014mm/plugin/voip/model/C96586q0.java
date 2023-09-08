package com.tencent.p014mm.plugin.voip.model;

import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import te3.iv4;

/* renamed from: com.tencent.mm.plugin.voip.model.q0 */
public class C96586q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ iv4 f282748d;

    /* renamed from: e */
    public final /* synthetic */ boolean f282749e;

    /* renamed from: f */
    public final /* synthetic */ C106373o0 f282750f;

    public C96586q0(C106373o0 o0Var, iv4 iv4, boolean z) {
        this.f282750f = o0Var;
        this.f282748d = iv4;
        this.f282749e = z;
    }

    public void run() {
        C106373o0 o0Var = this.f282750f;
        iv4 iv4 = this.f282748d;
        boolean z = this.f282749e;
        o0Var.getClass();
        MMHandlerThread.postToMainThread(new C96585p0(o0Var, iv4, z));
    }
}
