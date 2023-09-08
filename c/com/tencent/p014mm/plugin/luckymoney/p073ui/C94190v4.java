package com.tencent.p014mm.plugin.luckymoney.p073ui;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import o60.C100284b;
import rx3.C13598b0;
import w60.C102355h;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.v4 */
public final class C94190v4 implements C100284b.C100285a {

    /* renamed from: a */
    public final /* synthetic */ C100284b.C100286b f272106a;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.v4$a */
    public static final class C94191a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100284b.C100286b f272107d;

        /* renamed from: e */
        public final /* synthetic */ C102355h<?> f272108e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94191a(C100284b.C100286b bVar, C102355h<?> hVar) {
            super(0);
            this.f272107d = bVar;
            this.f272108e = hVar;
        }

        public Object invoke() {
            this.f272107d.mo126150b(this.f272108e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.v4$b */
    public static final class C94192b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C100284b.C100286b f272109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94192b(C100284b.C100286b bVar) {
            super(0);
            this.f272109d = bVar;
        }

        public Object invoke() {
            this.f272109d.mo126149a();
            return C13598b0.f38549a;
        }
    }

    public C94190v4(C100284b.C100286b bVar) {
        this.f272106a = bVar;
    }

    /* renamed from: a */
    public void mo129424a() {
        C61926c.m72668M(new C94192b(this.f272106a));
    }

    /* renamed from: b */
    public void mo129425b(C102355h<?> hVar) {
        C87412m.m108594g(hVar, "resp");
        C61926c.m72668M(new C94191a(this.f272106a, hVar));
    }
}
