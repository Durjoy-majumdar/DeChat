package p284zb;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83185u;
import gy3.C87412m;

/* renamed from: zb.n */
public final class C91647n implements C91646m {

    /* renamed from: a */
    public final C83185u f262621a;

    /* renamed from: b */
    public final C40480g f262622b;

    public C91647n(C83185u uVar) {
        C87412m.m108594g(uVar, "contextManager");
        this.f262621a = uVar;
        this.f262622b = uVar.mo115378X();
    }

    /* renamed from: a */
    public void mo125538a(C40480g gVar) {
        C87412m.m108594g(gVar, "context");
        this.f262622b.mo63256J(gVar, "WeixinJSContext");
    }

    /* renamed from: b */
    public void mo125539b() {
        this.f262621a.mo115383z().mo63256J(this.f262622b, "WeixinJSContext");
    }
}
