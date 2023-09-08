package com.tencent.p014mm.plugin.profile.p088ui;

import cw0.C116541b;

/* renamed from: com.tencent.mm.plugin.profile.ui.q0 */
public class C42672q0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C42660o0 f115525d;

    public C42672q0(C42660o0 o0Var) {
        this.f115525d = o0Var;
    }

    public void run() {
        if (!this.f115525d.f115487d.isFinishing()) {
            C42660o0 o0Var = this.f115525d;
            C116541b.m164352b(o0Var.f115487d, o0Var.f115489f.getUsername(), true);
            C116541b.m164360j(this.f115525d.f115487d);
        }
    }
}
