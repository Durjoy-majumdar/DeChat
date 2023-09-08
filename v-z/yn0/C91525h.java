package yn0;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83108g;
import com.tencent.p014mm.plugin.appbrand.report.C84240s;
import com.tencent.p014mm.plugin.report.service.C115669n;

/* renamed from: yn0.h */
public final class C91525h implements C83108g {

    /* renamed from: a */
    public final /* synthetic */ C91521g f262342a;

    public C91525h(C91521g gVar) {
        this.f262342a = gVar;
    }

    /* renamed from: a */
    public void mo115359a(int i, int i2) {
        C115669n.INSTANCE.mo175911u(this.f262342a.getId(), i2);
        try {
            AppBrandRuntimeWC rt = this.f262342a.getRt();
            C84240s.m103843i(this.f262342a.getAppId(), rt.mo113210l1().f234802F, rt.f238149o.f239365g, this.f262342a.getId(), i2, 1);
        } catch (NullPointerException unused) {
        }
    }
}
