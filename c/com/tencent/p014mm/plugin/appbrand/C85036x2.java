package com.tencent.p014mm.plugin.appbrand;

import ak0.C79584a;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.x2 */
public final class C85036x2 {

    /* renamed from: a */
    public final AppBrandRuntimeWC f247807a;

    /* renamed from: b */
    public String f247808b = "";

    /* renamed from: c */
    public int f247809c;

    /* renamed from: d */
    public AtomicBoolean f247810d = new AtomicBoolean(false);

    /* renamed from: e */
    public final C82531i.C82534c f247811e = new C85037a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.x2$a */
    public static final class C85037a implements C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C85036x2 f247812d;

        public C85037a(C85036x2 x2Var) {
            this.f247812d = x2Var;
        }

        public void onDestroy() {
            Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "page view destroyed, don't resume embed wxa for this page view  [" + hashCode() + ']');
            C85036x2 x2Var = this.f247812d;
            x2Var.f247808b = "";
            x2Var.f247809c = 0;
            x2Var.f247810d.set(false);
        }
    }

    public C85036x2(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "mHostRuntime");
        this.f247807a = appBrandRuntimeWC;
    }

    /* renamed from: a */
    public final boolean mo118003a(AppBrandRuntime appBrandRuntime, boolean z, Runnable runnable) {
        C87412m.m108594g(appBrandRuntime, "host");
        C87412m.m108594g(runnable, "afterCloseTask");
        C81820e3 e3Var = appBrandRuntime.f238142e;
        AppBrandRuntime activeRuntime = e3Var != null ? e3Var.getActiveRuntime() : null;
        if (activeRuntime == null || !C79584a.f233382a.mo109700c((AppBrandRuntimeWC) appBrandRuntime)) {
            return false;
        }
        activeRuntime.mo113066m((Object) null, runnable);
        Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "[onCloseEmbedWxaBeforeHostClose] mark down embedded wxa appid for re-show when host back to the front");
        if (z) {
            mo118004b((AppBrandRuntimeWC) activeRuntime);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.tencent.mm.plugin.appbrand.AppBrandRuntime] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118004b(com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC r4) {
        /*
            r3 = this;
            java.lang.String r0 = r4.f238147j
            java.lang.String r1 = "embedWxaRuntime.appId"
            gy3.C87412m.m108593f(r0, r1)
            r3.f247808b = r0
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r3.f247807a
            com.tencent.mm.plugin.appbrand.page.t1 r0 = r0.mo113178J1()
            r1 = 0
            if (r0 == 0) goto L_0x0017
            int r0 = r0.hashCode()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.f247809c = r0
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r0 = r4.mo113210l1()
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig r0 = r0.f234815R0
            java.lang.String r2 = "embedWxa.initConfig.halfScreenConfig"
            gy3.C87412m.m108593f(r0, r2)
            boolean r2 = r0.mo76931c()
            if (r2 == 0) goto L_0x0032
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r0 = r0.f157932C
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig$e r2 = com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig.C55455e.EMBED
            if (r0 != r2) goto L_0x0032
            r1 = 1
        L_0x0032:
            r0 = 0
            if (r1 == 0) goto L_0x0047
            com.tencent.mm.plugin.appbrand.e3 r1 = r4.f238142e
            if (r1 != 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            boolean r2 = r1.mo113124e(r4)
            if (r2 == 0) goto L_0x0047
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r4 = r1.mo113136o(r4)
            r0 = r4
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = (com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC) r0
        L_0x0047:
            if (r0 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.page.AppBrandPageContainerWC r4 = r0.mo113212m1()
            if (r4 == 0) goto L_0x007e
            com.tencent.mm.plugin.appbrand.page.d1 r4 = r4.getPageView()
            if (r4 == 0) goto L_0x007e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "addOnDestroyListener for page view["
            r0.append(r1)
            int r1 = r4.hashCode()
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.EmbedHalfScreenWxaManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            com.tencent.mm.plugin.appbrand.jsapi.i$c r0 = r3.f247811e
            r4.mo114867r(r0)
            com.tencent.mm.plugin.appbrand.jsapi.i$c r0 = r3.f247811e
            r4.mo114865m(r0)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C85036x2.mo118004b(com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC):void");
    }

    /* renamed from: c */
    public final void mo118005c(AppBrandInitConfigWC appBrandInitConfigWC) {
        C87412m.m108594g(appBrandInitConfigWC, "initConfigWC");
        if ((this.f247808b.length() > 0) && !appBrandInitConfigWC.f234815R0.mo76931c() && 1038 != appBrandInitConfigWC.f234834c1.f245533f) {
            Log.m105924i("MicroMsg.EmbedHalfScreenWxaManager", "[onInitConfigUpdated] mark should re-show embedded wxa");
            this.f247810d.set(true);
        }
    }
}
