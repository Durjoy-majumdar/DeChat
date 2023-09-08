package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.r1$$a */
public final /* synthetic */ class r1$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C84090r1 f245508d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandRuntimeWC f245509e;

    public /* synthetic */ r1$$a(C84090r1 r1Var, AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f245508d = r1Var;
        this.f245509e = appBrandRuntimeWC;
    }

    public final void run() {
        C84090r1 r1Var = this.f245508d;
        AppBrandRuntimeWC appBrandRuntimeWC = this.f245509e;
        r1Var.getClass();
        boolean z = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_wxaapp_restart_on_notify_lowest_version, 1) == 1;
        boolean z2 = appBrandRuntimeWC.mo113210l1().f234833b1 != null && "NeedLatestVersion".equals(appBrandRuntimeWC.mo113210l1().f234833b1.f243876e);
        Log.m105925i("MicroMsg.AppBrandRuntimeUpdateRunnerForAttrAsyncUpdated", "notify exptOpen:%b, isRestartedBySameReason:%b, appId:%s", Boolean.valueOf(z), Boolean.valueOf(z2), appBrandRuntimeWC.f238147j);
        if (z && !z2 && C81289m.C81290a.m99664b(appBrandRuntimeWC.f238149o.f239365g)) {
            ((C119157j) C119157j.f356862d).mo183895z(new r1$$b(r1Var));
        }
    }
}
