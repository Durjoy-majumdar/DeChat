package com.tencent.p014mm.plugin.multitalk.ilinkservice;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.x0 */
public class C105717x0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f314309d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f314310e;

    /* renamed from: f */
    public final /* synthetic */ C105720y0 f314311f;

    public C105717x0(C105720y0 y0Var, int i, byte[] bArr) {
        this.f314311f = y0Var;
        this.f314309d = i;
        this.f314310e = bArr;
    }

    public void run() {
        C105724z zVar = this.f314311f.f314330b;
        C105724z zVar2 = C105724z.INSTANCE;
        zVar.mo150604n();
        int i = this.f314309d;
        int i2 = i == 18 ? i : -5;
        C105720y0 y0Var = this.f314311f;
        C105724z zVar3 = y0Var.f314330b;
        C105598b bVar = y0Var.f314329a;
        zVar3.mo150601k(bVar, -10086, i2, "join room callback failed: " + this.f314309d, this.f314310e);
    }
}
