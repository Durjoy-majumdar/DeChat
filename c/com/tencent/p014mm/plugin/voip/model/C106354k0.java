package com.tencent.p014mm.plugin.voip.model;

import l33.C109246a;

/* renamed from: com.tencent.mm.plugin.voip.model.k0 */
public class C106354k0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f317382d;

    /* renamed from: e */
    public final /* synthetic */ C106350h0 f317383e;

    public C106354k0(C106350h0 h0Var, String str) {
        this.f317383e = h0Var;
        this.f317382d = str;
    }

    public void run() {
        C109246a aVar = this.f317383e.f317333b;
        if (aVar != null) {
            aVar.mo152468f0(this.f317382d);
        }
    }
}
