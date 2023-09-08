package com.tencent.p014mm.plugin.voip.model;

/* renamed from: com.tencent.mm.plugin.voip.model.l0 */
public class C106356l0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C106359m0 f317385d;

    public C106356l0(C106359m0 m0Var) {
        this.f317385d = m0Var;
    }

    public void run() {
        this.f317385d.mo152662g(2);
        C106377r rVar = this.f317385d.f317396a;
        rVar.mo152692F();
        rVar.f317470U.post(new C106395t(rVar));
    }
}
