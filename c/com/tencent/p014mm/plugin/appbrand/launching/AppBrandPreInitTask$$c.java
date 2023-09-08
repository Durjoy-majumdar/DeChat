package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask$$c */
public class AppBrandPreInitTask$$c implements C32227p<String, Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandPreInitTask f243154d;

    public AppBrandPreInitTask$$c(AppBrandPreInitTask appBrandPreInitTask) {
        this.f243154d = appBrandPreInitTask;
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        Log.m105925i("MicroMsg.AppBrandPreInitTask", "AppBrandTeenModeTempAuthMgr check callback appId:%s, canGoOn:%b", str, bool);
        if (!str.equals(this.f243154d.f243146p.f239362d) || !bool.booleanValue()) {
            this.f243154d.f243139f.mo114042a((AppBrandInitConfigWC) null, (AppBrandStatObject) null);
        } else {
            AppBrandPreInitTask appBrandPreInitTask = this.f243154d;
            appBrandPreInitTask.f243139f.mo114042a(appBrandPreInitTask.f243146p, appBrandPreInitTask.f243142i.f243738o);
        }
        this.f243154d.mo114397h();
        return null;
    }
}
