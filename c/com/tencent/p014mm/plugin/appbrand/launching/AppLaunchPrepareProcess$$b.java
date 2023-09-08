package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import s24.C90125c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppLaunchPrepareProcess$$b */
public class AppLaunchPrepareProcess$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppLaunchPrepareProcess f243284d;

    public AppLaunchPrepareProcess$$b(AppLaunchPrepareProcess appLaunchPrepareProcess) {
        this.f243284d = appLaunchPrepareProcess;
    }

    public void run() {
        ICommLibReader iCommLibReader;
        try {
            AppLaunchPrepareProcess appLaunchPrepareProcess = this.f243284d;
            appLaunchPrepareProcess.mo115522g(appLaunchPrepareProcess.mo115516a());
            C83226n.m102128e(this.f243284d.f243263p, KSProcessWeAppLaunch.stepPrepareResourceProcess);
            iCommLibReader = this.f243284d.f243272x;
            if (iCommLibReader == null) {
                return;
            }
        } catch (Throwable th) {
            ICommLibReader iCommLibReader2 = this.f243284d.f243272x;
            if (iCommLibReader2 != null) {
                C90125c.m112774a(iCommLibReader2);
            }
            throw th;
        }
        C90125c.m112774a(iCommLibReader);
    }
}
