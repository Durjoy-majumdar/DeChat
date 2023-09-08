package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.sdk.platformtools.Log;
import wi0.C90975b0;
import xm0.C91291c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.z0 */
public class C83526z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ WxaAttributes f244039d;

    /* renamed from: e */
    public final /* synthetic */ C83287a1 f244040e;

    public C83526z0(C83287a1 a1Var, WxaAttributes wxaAttributes) {
        this.f244040e = a1Var;
        this.f244039d = wxaAttributes;
    }

    public void run() {
        WxaPkgWrappingInfo wxaPkgWrappingInfo;
        try {
            WxaAttributes wxaAttributes = this.f244039d;
            String str = wxaAttributes.field_appId;
            C83518x0 x0Var = this.f244040e.f243399d;
            String str2 = x0Var.f244004e;
            String str3 = x0Var.f244005f;
            int i = x0Var.f244003d;
            WxaAttributes.WxaVersionInfo o2 = wxaAttributes.mo113942o2();
            C83518x0 x0Var2 = this.f244040e.f243399d;
            C83497u3 u3Var = new C83497u3(str, 0, str2, str3, i, o2, x0Var2.f244002c, x0Var2.f244010k, x0Var2.f244008i, x0Var2.f244009j, true);
            u3Var.mo115733g(false);
            wxaPkgWrappingInfo = u3Var.call();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "%s, prepare pkg exp = %s", this.f244039d.field_appId, e);
            wxaPkgWrappingInfo = null;
        }
        ((IPCUpdateStateNotifier) this.f244040e.f243399d.f244007h).mo115556a(wxaPkgWrappingInfo == null ? C91291c.UPDATE_FAILED : C91291c.UPDATE_READY, this.f244039d.mo113942o2().f239452d, this.f244039d.mo113942o2().f239453e, (String) null, (String) null);
        if (wxaPkgWrappingInfo != null) {
            try {
                WxaAttributes LL = C81161g2.Cx0().mo114000LL(this.f244040e.f243399d.f244000a, new String[0]);
                if (LL.mo113942o2().f239452d == this.f244039d.mo113942o2().f239452d) {
                    ((C90975b0) C81161g2.Bx0(C90975b0.class)).mo125053nP(LL);
                }
            } catch (Exception unused) {
                C83518x0 x0Var3 = this.f244040e.f243399d;
                Log.m105921e("MicroMsg.AppBrand.Launching.ContactSilentSyncProcess", "appUsername(%s) appId(%s) update backup attr get exception", x0Var3.f244000a, x0Var3.f244001b);
            }
        }
    }
}
