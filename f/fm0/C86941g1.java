package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83789e1;

/* renamed from: fm0.g1 */
public final class C86941g1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252362d;

    /* renamed from: e */
    public final /* synthetic */ int f252363e;

    /* renamed from: f */
    public final /* synthetic */ C86944h1 f252364f;

    public C86941g1(C81879g gVar, int i, C86944h1 h1Var) {
        this.f252362d = gVar;
        this.f252363e = i;
        this.f252364f = h1Var;
    }

    public final void run() {
        C81879g gVar = this.f252362d;
        C83780d1 l0 = gVar instanceof C83780d1 ? (C83780d1) gVar : gVar instanceof C81925i2 ? ((C81925i2) gVar).mo114341l0() : null;
        if (l0 == null) {
            this.f252362d.mo109647a(this.f252363e, this.f252364f.mo115109j("fail:page don't exist"));
            return;
        }
        l0.mo109673t(new C83789e1(l0));
        this.f252362d.mo109647a(this.f252363e, this.f252364f.mo115109j("ok"));
    }
}
