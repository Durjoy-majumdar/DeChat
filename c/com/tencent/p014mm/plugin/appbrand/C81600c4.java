package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.RuntimeMigrateRestartHelper;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import gy3.C87412m;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.appbrand.c4 */
public final class C81600c4<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f239264d;

    /* renamed from: e */
    public final /* synthetic */ String f239265e;

    public C81600c4(AppBrandRuntimeWC appBrandRuntimeWC, String str) {
        this.f239264d = appBrandRuntimeWC;
        this.f239265e = str;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult migrateRestartPreLaunchResult = (RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult) obj;
        if (migrateRestartPreLaunchResult == null || !migrateRestartPreLaunchResult.f238367d) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f239264d;
            String str = this.f239265e;
            appBrandRuntimeWC.mo113052e("MigrateRestartPreLaunch for " + str + " failed", new Object[0]);
            appBrandRuntimeWC.mo113006E();
            return;
        }
        AppBrandRuntimeWC appBrandRuntimeWC2 = this.f239264d;
        appBrandRuntimeWC2.mo113052e("MigrateRestartPreLaunch for " + this.f239265e + " succeed, container:" + this.f239264d.f238142e, new Object[0]);
        AppBrandRuntimeWC appBrandRuntimeWC3 = this.f239264d;
        C81820e3 e3Var = appBrandRuntimeWC3.f238142e;
        if (e3Var == null) {
            appBrandRuntimeWC3.mo113006E();
            return;
        }
        AppBrandInitConfigWC appBrandInitConfigWC = migrateRestartPreLaunchResult.f238368e;
        AppBrandStatObject appBrandStatObject = migrateRestartPreLaunchResult.f238369f;
        C87412m.m108591d(appBrandInitConfigWC);
        appBrandInitConfigWC.f234834c1 = appBrandStatObject;
        C61926c.m72668M(new C81553b4(e3Var, appBrandInitConfigWC, this.f239264d));
    }
}
