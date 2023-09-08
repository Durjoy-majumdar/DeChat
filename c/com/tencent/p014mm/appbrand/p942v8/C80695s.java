package com.tencent.p014mm.appbrand.p942v8;

/* renamed from: com.tencent.mm.appbrand.v8.s */
public class C80695s extends C80693r {

    /* renamed from: n */
    public static final ThreadLocal<C80695s> f236111n = new ThreadLocal<>();

    /* renamed from: m */
    public final C80696a f236112m;

    /* renamed from: com.tencent.mm.appbrand.v8.s$a */
    public interface C80696a {
    }

    public C80695s(C80696a aVar, boolean z) {
        super(z);
        this.f236112m = aVar;
    }

    /* renamed from: m */
    public void mo112492m() {
        super.mo112492m();
        C80696a aVar = this.f236112m;
        if (aVar != null) {
            C80691q.this.f236093y.getV8().pumpMessageLoopDirect();
        }
    }
}
