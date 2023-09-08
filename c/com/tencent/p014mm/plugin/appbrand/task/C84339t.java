package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80279o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.t */
public final class C84339t extends C87413o implements C32226l<Activity, C13598b0> {

    /* renamed from: B */
    public final /* synthetic */ AppBrandProcessesManager f246253B;

    /* renamed from: C */
    public final /* synthetic */ C84310k f246254C;

    /* renamed from: D */
    public final /* synthetic */ Intent f246255D;

    /* renamed from: E */
    public final /* synthetic */ Activity f246256E;

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f246257d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandStatObject f246258e;

    /* renamed from: g */
    public final /* synthetic */ C80279o f246259g;

    /* renamed from: h */
    public final /* synthetic */ C80264l f246260h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84339t(AppBrandProcessesManager appBrandProcessesManager, AppBrandInitConfigWC appBrandInitConfigWC, C84310k kVar, Intent intent, AppBrandStatObject appBrandStatObject, Activity activity, C80279o oVar, C80264l lVar) {
        super(1);
        this.f246253B = appBrandProcessesManager;
        this.f246257d = appBrandInitConfigWC;
        this.f246254C = kVar;
        this.f246255D = intent;
        this.f246258e = appBrandStatObject;
        this.f246256E = activity;
        this.f246259g = oVar;
        this.f246260h = lVar;
    }

    public Object invoke(Object obj) {
        Activity activity = (Activity) obj;
        C87412m.m108594g(activity, LocaleUtil.ITALIAN);
        AppBrandProcessesManager.m103870J(this.f246253B, this.f246257d, this.f246254C, this.f246255D);
        activity.startActivityForResult(this.f246255D, -1, (Bundle) null);
        AppBrandInitConfigWC appBrandInitConfigWC = this.f246257d;
        appBrandInitConfigWC.f234834c1 = this.f246258e;
        C84583r2.INSTANCE.mo111331Gm(this.f246256E, appBrandInitConfigWC);
        Log.m105924i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- by LaunchInBackgroundGuard strategy:" + this.f246259g + ", app:" + this.f246260h);
        return C13598b0.f38549a;
    }
}
