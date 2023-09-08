package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import gy3.C87412m;
import jp3.C9486a;
import ms0.C88840a;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.c0 */
public final class C82579c0 implements C88840a.C88842b, C9486a {

    /* renamed from: d */
    public AppBrandRuntime f241692d;

    /* renamed from: e */
    public C88840a.C88842b f241693e;

    public C82579c0(AppBrandRuntime appBrandRuntime, C88840a.C88842b bVar) {
        C87412m.m108594g(appBrandRuntime, "runtime");
        C87412m.m108594g(bVar, "delegate");
        this.f241692d = appBrandRuntime;
        this.f241693e = bVar;
        appBrandRuntime.keep(this);
    }

    public void dead() {
        this.f241693e = null;
        AppBrandRuntime appBrandRuntime = this.f241692d;
        if (appBrandRuntime != null) {
            appBrandRuntime.mo1963B7(this);
        }
        this.f241692d = null;
    }

    /* renamed from: f */
    public void mo114898f(int i, String str, C88840a.C88841a aVar) {
        C88840a.C88842b bVar = this.f241693e;
        if (bVar != null) {
            bVar.mo114898f(i, str, aVar);
        }
        dead();
    }
}
