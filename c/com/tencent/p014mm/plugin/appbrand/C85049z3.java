package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.RuntimeMigrateRestartHelper;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask$$e;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;

/* renamed from: com.tencent.mm.plugin.appbrand.z3 */
public final class C85049z3 implements AppBrandPreInitTask$$e {

    /* renamed from: a */
    public final /* synthetic */ C1256g<RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult> f247833a;

    public C85049z3(C1256g<RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult> gVar) {
        this.f247833a = gVar;
    }

    /* renamed from: a */
    public final void mo114042a(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        C1256g<RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult> gVar = this.f247833a;
        if (gVar != null) {
            gVar.mo894a(new RuntimeMigrateRestartHelper.MigrateRestartPreLaunchResult(appBrandInitConfigWC != null, appBrandInitConfigWC, appBrandStatObject));
        }
    }
}
