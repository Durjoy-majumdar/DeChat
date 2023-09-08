package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.p014mm.modelappbrand.LaunchParamsOptional;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator.C82816p;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.p014mm.plugin.appbrand.launching.C83341j;
import com.tencent.p014mm.plugin.appbrand.launching.C83351k;
import com.tencent.p014mm.plugin.appbrand.launching.C83387n;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83482f;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import di3.C86312j;
import gy3.C87412m;
import ky2.C10432i;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.k */
public class C83421k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LaunchParcel f243785d;

    /* renamed from: e */
    public final /* synthetic */ String f243786e;

    /* renamed from: f */
    public final /* synthetic */ C83410a f243787f;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.k$a */
    public class C83422a implements C83341j.C83342a<AppBrandInitConfigWC> {

        /* renamed from: a */
        public final /* synthetic */ long f243788a;

        public C83422a(long j) {
            this.f243788a = j;
        }

        /* renamed from: a */
        public void mo115495a(AppBrandInitConfigLU appBrandInitConfigLU, AppBrandStatObject appBrandStatObject, int i) {
            AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) appBrandInitConfigLU;
            Object[] objArr = new Object[5];
            int i2 = 0;
            objArr[0] = Boolean.valueOf(appBrandInitConfigWC != null);
            LaunchParcel launchParcel = C83421k.this.f243785d;
            objArr[1] = launchParcel.f243730d;
            objArr[2] = launchParcel.f243731e;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Long.valueOf(Util.currentTicks() - this.f243788a);
            Log.m105925i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "AppBrandPreLaunchProcessWC.onResult, config?:%b, username:%s, appId:%s, result:%d, cost:%d", objArr);
            if (!C83421k.this.f243787f.mo115707b()) {
                if (appBrandInitConfigWC == null) {
                    LaunchParcel launchParcel2 = C83421k.this.f243785d;
                    C82816p.m101563c(launchParcel2.f243731e, launchParcel2.f243735i, launchParcel2.f243738o);
                    C83421k.this.f243787f.mo115709e((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
                    return;
                }
                C83421k.this.f243785d.mo115681b(appBrandInitConfigWC);
                WeAppOpenUICallbackIPCProxy.C83284b.m102229b(appBrandInitConfigWC, C83421k.this.f243785d);
                C83421k kVar = C83421k.this;
                LaunchParcel launchParcel3 = kVar.f243785d;
                appBrandInitConfigWC.f234807K = launchParcel3.f243743t;
                appBrandInitConfigWC.f234809M = launchParcel3.f243744u;
                appBrandInitConfigWC.f239384o1 = launchParcel3.f243712D;
                appBrandInitConfigWC.f239390u1 = launchParcel3.f243719K;
                LaunchParamsOptional launchParamsOptional = launchParcel3.f243740q;
                if (launchParamsOptional != null) {
                    i2 = launchParamsOptional.f237922h;
                }
                appBrandInitConfigWC.f234819T0 = i2;
                appBrandInitConfigWC.f234799C = launchParamsOptional == null ? "" : launchParamsOptional.f237923i;
                C83414e eVar = new C83414e(this, appBrandInitConfigWC);
                if (WeChatBrands.Business.Entries.GlobalAppbrand.checkAvailableSlient(kVar.f243787f.mo115710f(), new C83415f(this))) {
                    C83416g gVar = new C83416g(this, appBrandInitConfigWC, eVar);
                    if (C1926l.f11800a.mo1819a(appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f234815R0.mo76931c(), appBrandInitConfigWC.f239373d1)) {
                        AppBrandProcessProxyUI.m100645J7(C83421k.this.f243787f.getBaseContext(), (ActivityStarterIpcDelegate) null, new C83417h(this, gVar));
                        return;
                    }
                    AppBrandStatObject appBrandStatObject2 = C83421k.this.f243785d.f243738o;
                    Integer valueOf = Integer.valueOf(appBrandStatObject2 != null ? appBrandStatObject2.f245533f : -1);
                    LaunchParcel launchParcel4 = C83421k.this.f243785d;
                    if (!C83482f.m102439a(appBrandInitConfigWC, valueOf, launchParcel4.f243730d, launchParcel4.f243733g)) {
                        String str = appBrandInitConfigWC.f239362d;
                        C87412m.m108594g(str, "appId");
                        if (!((C10432i) C86312j.m106911c(C10432i.class)).mo10738JD(1, "weapp_" + str)) {
                            C83421k.this.f243787f.mo115712h(new C83419j(this, appBrandInitConfigWC, gVar));
                            return;
                        }
                    }
                    gVar.run();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.k$b */
    public class C83423b implements C83387n.C83389b {

        /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.k$b$a */
        public class C83424a implements Runnable {
            public C83424a() {
            }

            public void run() {
                if (C83421k.this.f243787f.getBaseContext() instanceof AppBrandLaunchProxyUI) {
                    AppBrandLaunchProxyUI appBrandLaunchProxyUI = (AppBrandLaunchProxyUI) C83421k.this.f243787f.getBaseContext();
                    boolean z = true;
                    Object[] objArr = new Object[1];
                    if (!appBrandLaunchProxyUI.isFinishing() && !appBrandLaunchProxyUI.isDestroyed()) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    Log.m105919d("MicroMsg.AppBrandLaunchProxyUI", "revealProgressLayoutImmediately destroyed[%b]", objArr);
                    appBrandLaunchProxyUI.f243126o.removeCallbacks(appBrandLaunchProxyUI.f243127p);
                    appBrandLaunchProxyUI.f243126o.post(appBrandLaunchProxyUI.f243127p);
                }
            }
        }

        public C83423b() {
        }

        /* renamed from: a */
        public void mo115665a() {
            C83421k kVar = C83421k.this;
            LaunchParcel launchParcel = kVar.f243785d;
            C83410a aVar = kVar.f243787f;
            int i = C83410a.f243759i;
            Log.m105925i("MicroMsg.AppBrand.Precondition.AbstractLaunchPreconditionProcess", "AppBrandPreLaunchProcessWC showPrompt, username[%s] appId[%s] currentInUiEnv[%b]", launchParcel.f243730d, launchParcel.f243731e, Boolean.valueOf(aVar.mo115706a()));
            C83421k.this.f243787f.mo115712h(new C83424a());
        }
    }

    public C83421k(C83410a aVar, LaunchParcel launchParcel, String str) {
        this.f243787f = aVar;
        this.f243785d = launchParcel;
        this.f243786e = str;
    }

    public void run() {
        new C83351k(this.f243785d, this.f243786e, false, new C83422a(Util.currentTicks()), new C83423b()).run();
    }
}
