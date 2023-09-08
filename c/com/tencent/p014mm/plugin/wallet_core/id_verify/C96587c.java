package com.tencent.p014mm.plugin.wallet_core.id_verify;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import o60.C100284b;
import rx3.C13598b0;
import w60.C102355h;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.c */
public final class C96587c implements C100284b.C100285a {

    /* renamed from: a */
    public final /* synthetic */ C100284b.C100286b f282751a;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.c$a */
    public static final class C96588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100284b.C100286b f282752d;

        /* renamed from: e */
        public final /* synthetic */ C102355h<?> f282753e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96588a(C100284b.C100286b bVar, C102355h<?> hVar) {
            super(0);
            this.f282752d = bVar;
            this.f282753e = hVar;
        }

        public Object invoke() {
            this.f282752d.mo126150b(this.f282753e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.c$b */
    public static final class C96589b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100284b.C100286b f282754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96589b(C100284b.C100286b bVar) {
            super(0);
            this.f282754d = bVar;
        }

        public Object invoke() {
            this.f282754d.mo126149a();
            return C13598b0.f38549a;
        }
    }

    public C96587c(C100284b.C100286b bVar) {
        this.f282751a = bVar;
    }

    /* renamed from: a */
    public void mo129424a() {
        C61926c.m72668M(new C96589b(this.f282751a));
    }

    /* renamed from: b */
    public void mo129425b(C102355h<?> hVar) {
        C87412m.m108594g(hVar, "resp");
        C61926c.m72668M(new C96588a(this.f282751a, hVar));
    }
}
