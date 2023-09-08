package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPrepareTask;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.y3 */
public final class C85043y3 implements AppBrandPreInitTask$$e {

    /* renamed from: a */
    public final AppBrandRuntimeWC f247820a;

    /* renamed from: b */
    public final AppBrandPrepareTask f247821b;

    /* renamed from: c */
    public final String f247822c;

    /* renamed from: d */
    public final AtomicBoolean f247823d = new AtomicBoolean(false);

    /* renamed from: com.tencent.mm.plugin.appbrand.y3$a */
    public static final class C85044a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ AppBrandInitConfigWC f247824d;

        /* renamed from: e */
        public final /* synthetic */ AppBrandStatObject f247825e;

        /* renamed from: f */
        public final /* synthetic */ C85043y3 f247826f;

        public C85044a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject, C85043y3 y3Var) {
            this.f247824d = appBrandInitConfigWC;
            this.f247825e = appBrandStatObject;
            this.f247826f = y3Var;
        }

        public final void run() {
            AppBrandInitConfigWC appBrandInitConfigWC = this.f247824d;
            appBrandInitConfigWC.f239389t1 = true;
            appBrandInitConfigWC.f234834c1 = this.f247825e;
            appBrandInitConfigWC.mo111299j();
            AppBrandInitConfigWC appBrandInitConfigWC2 = this.f247824d;
            String str = this.f247826f.f247820a.mo113210l1().f239379j1.f245832d;
            C87412m.m108593f(str, "rt.initConfig.qualityReportSession.instanceId");
            appBrandInitConfigWC2.f234833b1 = new AppBrandRuntimeReloadReportBundle(str, "LocalVersionFallback");
            this.f247826f.f247820a.mo113015J0(this.f247824d, "LocalVersionFallback");
        }
    }

    public C85043y3(AppBrandRuntimeWC appBrandRuntimeWC, AppBrandPrepareTask appBrandPrepareTask) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        C87412m.m108594g(appBrandPrepareTask, "prepareTask");
        this.f247820a = appBrandRuntimeWC;
        this.f247821b = appBrandPrepareTask;
        this.f247822c = "MicroMsg.AppBrand.RuntimeLaunchTimeoutFallbackReloadTask[" + appBrandRuntimeWC.f238147j + '|' + appBrandRuntimeWC.hashCode() + ']';
    }

    /* renamed from: a */
    public void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        if (this.f247823d.get()) {
            Log.m105928w(this.f247822c, "onResult but canceled");
            return;
        }
        String str = this.f247822c;
        Log.m105924i(str, "onResult with config:" + appBrandInitConfigWC);
        this.f247821b.mo115499b();
        if (appBrandInitConfigWC == null) {
            this.f247820a.mo113006E();
        } else {
            this.f247820a.mo113024P0(new C85044a(appBrandInitConfigWC, appBrandStatObject, this));
        }
    }

    /* renamed from: b */
    public final void mo118013b() {
        this.f247823d.set(true);
    }
}
