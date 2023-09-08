package com.tencent.p014mm.plugin.appbrand;

import android.content.DialogInterface;
import com.tencent.p014mm.plugin.appbrand.launching.AppBrandPreInitTask;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.p014mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import wi0.C90981g;

/* renamed from: com.tencent.mm.plugin.appbrand.h4$$a */
public final /* synthetic */ class h4$$a implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f240234d;

    public /* synthetic */ h4$$a(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f240234d = appBrandRuntimeWC;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AppBrandRuntimeWC appBrandRuntimeWC = this.f240234d;
        Log.m105925i("MicroMsg.AppBrand.RuntimeRestartHelper", "restartAppImplOnLaunchRequestedLatestVersion appId:%s", appBrandRuntimeWC.f238147j);
        LaunchParcel a = C90981g.m114148a(appBrandRuntimeWC.mo113210l1());
        a.mo115684d();
        a.f243718J = new AppBrandRuntimeReloadReportBundle(appBrandRuntimeWC.mo113210l1().f239379j1.f245832d, "NeedLatestVersion");
        AppBrandPreInitTask appBrandPreInitTask = new AppBrandPreInitTask(appBrandRuntimeWC.f238141d, a, false, new d4$$a(appBrandRuntimeWC));
        appBrandPreInitTask.f243144n = true;
        appBrandPreInitTask.mo115494v();
    }
}
