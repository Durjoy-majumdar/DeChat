package com.tencent.p014mm.plugin.appbrand.p026ui;

import ai0.C79557i;
import ai0.C79562l;
import ai0.C79575q;
import ai0.C79580u;
import br0.C79778e;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81114e;
import com.tencent.p014mm.plugin.appbrand.p025ad.jsapi.C81116f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kr0.C88267e;
import rq0.C90086e;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.b */
public class C84483b implements C79557i.C79559b {

    /* renamed from: a */
    public final /* synthetic */ C84518d f246588a;

    public C84483b(C84518d dVar) {
        this.f246588a = dVar;
    }

    /* renamed from: a */
    public void mo109643a(String str) {
        C90086e eVar;
        C79580u uVar = this.f246588a.f246659g;
        if (uVar != null) {
            C79575q qVar = (C79575q) uVar;
            if ("launch".equalsIgnoreCase(str)) {
                C81116f fVar = new C81116f();
                fVar.f238391i = str;
                fVar.mo113281s(qVar.mo109687e());
                C81114e eVar2 = new C81114e();
                eVar2.f238387i = str;
                eVar2.mo113280s(qVar.mo109687e());
                AppBrandRuntimeWC appBrandRuntimeWC = qVar.f233331b;
                Log.m105925i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, reset orientation", appBrandRuntimeWC.f238147j);
                if (!(appBrandRuntimeWC.mo113212m1() == null || appBrandRuntimeWC.mo113212m1().getPageView() == null || (eVar = (C90086e) appBrandRuntimeWC.mo113212m1().getPageView().mo116150E0(C90086e.class)) == null)) {
                    String d = eVar.mo116461d();
                    Log.m105925i("MicroMsg.AppBrandRuntime", "tryResetPageOrientation[AppBrandSplashAd], appId:%s, request orientation:%s", appBrandRuntimeWC.f238147j, d);
                    if (!Util.isNullOrNil(d)) {
                        eVar.mo116463f((C79778e.C79779a) null);
                    }
                }
                qVar.mo109692k();
                Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "onSplashAdViewContainerHide");
                qVar.f233339j = true;
                qVar.mo109684b();
                if (qVar.mo109687e() != null) {
                    Log.m105924i("MicroMsg.AppBrandSplashAdLogic[AppBrandSplashAd]", "destroyServiceAdComponentView");
                    C88267e e = qVar.mo109687e();
                    C79562l lVar = e.f255133S;
                    if (lVar != null) {
                        lVar.mo109674u();
                        e.f255133S = null;
                    }
                }
                qVar.mo109683a();
            }
        }
    }

    public void onDetach() {
        C79580u uVar = this.f246588a.f246659g;
        if (uVar != null) {
            C79575q qVar = (C79575q) uVar;
            qVar.getClass();
            C81116f fVar = new C81116f();
            fVar.f238391i = "launch";
            fVar.mo113281s(qVar.mo109687e());
            C81114e eVar = new C81114e();
            eVar.f238387i = "launch";
            eVar.mo113280s(qVar.mo109687e());
        }
    }
}
