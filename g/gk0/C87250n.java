package gk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lp3.C88631d;
import zq0.C91875g0;
import zq0.C91891k0;
import zq0.C91893l0;
import zq0.C91894m;
import zq0.C91910r;

/* renamed from: gk0.n */
public final class C87250n<T> implements C88631d.C88632b {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f252955a;

    /* renamed from: b */
    public final /* synthetic */ int f252956b;

    /* renamed from: c */
    public final /* synthetic */ C87237e f252957c;

    public C87250n(C83780d1 d1Var, int i, C87237e eVar) {
        this.f252955a = d1Var;
        this.f252956b = i;
        this.f252957c = eVar;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        C82870p.C82871a aVar = (C82870p.C82871a) obj;
        C91893l0 l0Var = C91893l0.f263119a;
        String appId = this.f252955a.getAppId();
        C87412m.m108593f(appId, "env.appId");
        C91891k0 a = l0Var.mo125719a(appId);
        if (a != null) {
            C91910r rVar = C91875g0.f263042b;
            if (rVar == null) {
                rVar = new C91894m();
            }
            rVar.mo121664j(a);
        }
        String appId2 = this.f252955a.getAppId();
        if (appId2 != null) {
            l0Var.mo125722d(appId2);
        }
        Log.m105924i("MicroMsg.JsApiGetPhoneNumberNew", "callResult: " + aVar.f242317b + ' ' + aVar.f242316a);
        this.f252955a.mo109647a(this.f252956b, this.f252957c.mo115112m(aVar.f242317b, aVar.f242316a));
    }
}
