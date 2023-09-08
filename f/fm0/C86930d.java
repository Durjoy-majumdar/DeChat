package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83799f;
import gy3.C87412m;

/* renamed from: fm0.d */
public final class C86930d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83780d1 f252350d;

    /* renamed from: e */
    public final /* synthetic */ C81879g f252351e;

    /* renamed from: f */
    public final /* synthetic */ int f252352f;

    /* renamed from: g */
    public final /* synthetic */ C86933e f252353g;

    public C86930d(C83780d1 d1Var, C81879g gVar, int i, C86933e eVar) {
        this.f252350d = d1Var;
        this.f252351e = gVar;
        this.f252352f = i;
        this.f252353g = eVar;
    }

    public final void run() {
        C83780d1 d1Var = this.f252350d;
        if (d1Var.f244554F == null) {
            C83799f fVar = d1Var.f244560L;
            if (fVar != null) {
                fVar.f244649b = true;
            }
        } else {
            d1Var.mo116165T0();
        }
        C81879g gVar = this.f252351e;
        C87412m.m108591d(gVar);
        gVar.mo109647a(this.f252352f, this.f252353g.mo115109j("ok"));
    }
}
