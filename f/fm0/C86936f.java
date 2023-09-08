package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83801f1;

/* renamed from: fm0.f */
public final class C86936f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252359d;

    /* renamed from: e */
    public final /* synthetic */ int f252360e;

    /* renamed from: f */
    public final /* synthetic */ C86939g f252361f;

    public C86936f(C81879g gVar, int i, C86939g gVar2) {
        this.f252359d = gVar;
        this.f252360e = i;
        this.f252361f = gVar2;
    }

    public final void run() {
        C81879g gVar = this.f252359d;
        C83780d1 l0 = gVar instanceof C83780d1 ? (C83780d1) gVar : gVar instanceof C81925i2 ? ((C81925i2) gVar).mo114341l0() : null;
        if (l0 == null) {
            this.f252359d.mo109647a(this.f252360e, this.f252361f.mo115109j("fail:page don't exist"));
            return;
        }
        l0.mo109673t(new C83801f1(l0));
        this.f252359d.mo109647a(this.f252360e, this.f252361f.mo115109j("ok"));
    }
}
