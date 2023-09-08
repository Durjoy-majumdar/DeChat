package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.C83606m1;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.C81648d;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$b */
public final /* synthetic */ class AppBrandPreInitTask$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPreInitTask f243151d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandInitConfigWC f243152e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandStatObject f243153f;

    public /* synthetic */ AppBrandPreInitTask$$b(AppBrandPreInitTask appBrandPreInitTask, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        this.f243151d = appBrandPreInitTask;
        this.f243152e = appBrandInitConfigWC;
        this.f243153f = appBrandStatObject;
    }

    public final void run() {
        AppBrandPreInitTask appBrandPreInitTask = this.f243151d;
        AppBrandInitConfigWC appBrandInitConfigWC = this.f243152e;
        AppBrandStatObject appBrandStatObject = this.f243153f;
        appBrandPreInitTask.getClass();
        appBrandInitConfigWC.f239377h1 = true;
        if (AppLaunchPrepareProcess.m102197i(appBrandInitConfigWC.f234838r) == null) {
            Log.m105925i("MicroMsg.AppBrandPreInitTask", "[applaunch] init AppLaunchPrepareProcess boost instance, appId:%s, versionType:%d", appBrandInitConfigWC.f239362d, Integer.valueOf(appBrandInitConfigWC.f239365g));
            Objects.requireNonNull(appBrandStatObject);
            new AppLaunchPrepareProcess(appBrandInitConfigWC, appBrandStatObject).mo115526n();
            C83606m1.m102639c(21, appBrandInitConfigWC.f239362d, appBrandInitConfigWC.f234802F, appBrandInitConfigWC.f239365g, appBrandInitConfigWC.mo111300k());
        }
        C81648d.m100144g().mo124412e(appBrandInitConfigWC.f234839s, appBrandInitConfigWC.mo111294e());
        appBrandPreInitTask.mo114394b();
    }
}
