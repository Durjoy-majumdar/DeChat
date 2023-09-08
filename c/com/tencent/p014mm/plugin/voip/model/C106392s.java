package com.tencent.p014mm.plugin.voip.model;

/* renamed from: com.tencent.mm.plugin.voip.model.s */
public class C106392s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f317521d;

    /* renamed from: e */
    public final /* synthetic */ int f317522e;

    /* renamed from: f */
    public final /* synthetic */ C106377r f317523f;

    public C106392s(C106377r rVar, int i, int i2) {
        this.f317523f = rVar;
        this.f317521d = i;
        this.f317522e = i2;
    }

    public void run() {
        C106393s0 s0Var = this.f317523f.f317502z;
        if (s0Var != null) {
            s0Var.mo152490s0(this.f317521d, this.f317522e);
        }
    }
}
