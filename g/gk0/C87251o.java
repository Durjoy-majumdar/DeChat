package gk0;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import lp3.C88631d;
import zq0.C91875g0;
import zq0.C91891k0;
import zq0.C91893l0;
import zq0.C91894m;
import zq0.C91910r;

/* renamed from: gk0.o */
public final class C87251o<T> implements C88631d.C76721a {

    /* renamed from: a */
    public final /* synthetic */ C83780d1 f252958a;

    /* renamed from: b */
    public final /* synthetic */ int f252959b;

    /* renamed from: c */
    public final /* synthetic */ C87237e f252960c;

    public C87251o(C83780d1 d1Var, int i, C87237e eVar) {
        this.f252958a = d1Var;
        this.f252959b = i;
        this.f252960c = eVar;
    }

    /* renamed from: a */
    public final void mo1720a(Object obj) {
        C91893l0 l0Var = C91893l0.f263119a;
        String appId = this.f252958a.getAppId();
        C87412m.m108593f(appId, "env.appId");
        C91891k0 a = l0Var.mo125719a(appId);
        if (a != null) {
            C91910r rVar = C91875g0.f263042b;
            if (rVar == null) {
                rVar = new C91894m();
            }
            rVar.mo121664j(a);
        }
        String appId2 = this.f252958a.getAppId();
        if (appId2 != null) {
            l0Var.mo125722d(appId2);
        }
        if (obj instanceof String) {
            Log.m105920e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:" + obj);
            C83780d1 d1Var = this.f252958a;
            if (d1Var != null) {
                int i = this.f252959b;
                C87237e eVar = this.f252960c;
                d1Var.mo109647a(i, eVar.mo115109j("fail:" + obj));
            }
        } else if (obj instanceof Exception) {
            Log.m105920e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail:{" + obj + ".message}");
            C83780d1 d1Var2 = this.f252958a;
            if (d1Var2 != null) {
                int i2 = this.f252959b;
                C87237e eVar2 = this.f252960c;
                d1Var2.mo109647a(i2, eVar2.mo115109j("fail:{" + obj + ".message}"));
            }
        } else {
            Log.m105920e("MicroMsg.JsApiGetPhoneNumberNew", "getphonenumber fail");
            C83780d1 d1Var3 = this.f252958a;
            if (d1Var3 != null) {
                d1Var3.mo109647a(this.f252959b, this.f252960c.mo115109j("fail"));
            }
        }
    }
}
