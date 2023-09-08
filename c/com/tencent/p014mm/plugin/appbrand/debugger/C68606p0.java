package com.tencent.p014mm.plugin.appbrand.debugger;

import com.tencent.p014mm.C0966R;

/* renamed from: com.tencent.mm.plugin.appbrand.debugger.p0 */
public class C68606p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C68600m0 f197068d;

    public C68606p0(C68600m0 m0Var) {
        this.f197068d = m0Var;
    }

    public void run() {
        C68600m0.m80857b(this.f197068d);
        C68600m0 m0Var = this.f197068d;
        m0Var.f197052j.setText(m0Var.getContext().getString(C0966R.string.f7851tr, new Object[]{Integer.valueOf(m0Var.f197046d.f239895q.size()), Integer.valueOf(m0Var.f197046d.f239894p.size()), Long.valueOf(m0Var.f197046d.f239901w)}));
    }
}
