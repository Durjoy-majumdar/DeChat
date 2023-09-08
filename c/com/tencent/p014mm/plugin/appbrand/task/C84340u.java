package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.luggage.sdk.launching.ActivityStarterIpcDelegate;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80279o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84583r2;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.appbrand.task.u */
public final class C84340u implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandProcessesManager f246261d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandInitConfigWC f246262e;

    /* renamed from: f */
    public final /* synthetic */ C84310k f246263f;

    /* renamed from: g */
    public final /* synthetic */ Intent f246264g;

    /* renamed from: h */
    public final /* synthetic */ AppBrandStatObject f246265h;

    /* renamed from: i */
    public final /* synthetic */ Activity f246266i;

    /* renamed from: j */
    public final /* synthetic */ C80279o f246267j;

    /* renamed from: n */
    public final /* synthetic */ C80264l f246268n;

    /* renamed from: o */
    public final /* synthetic */ C84274b0 f246269o;

    /* renamed from: p */
    public final /* synthetic */ Context f246270p;

    public C84340u(Activity activity, AppBrandProcessesManager appBrandProcessesManager, AppBrandInitConfigWC appBrandInitConfigWC, C84310k kVar, Intent intent, AppBrandStatObject appBrandStatObject, C84274b0 b0Var, Context context, C80279o oVar, C80264l lVar) {
        this.f246266i = activity;
        this.f246261d = appBrandProcessesManager;
        this.f246262e = appBrandInitConfigWC;
        this.f246263f = kVar;
        this.f246264g = intent;
        this.f246265h = appBrandStatObject;
        this.f246269o = b0Var;
        this.f246270p = context;
        this.f246267j = oVar;
        this.f246268n = lVar;
    }

    public final void run() {
        String str = "super";
        if (this.f246266i != null) {
            AppBrandProcessesManager.m103870J(this.f246261d, this.f246262e, this.f246263f, this.f246264g);
            this.f246266i.startActivityForResult(this.f246264g, -1, (Bundle) null);
            AppBrandInitConfigWC appBrandInitConfigWC = this.f246262e;
            appBrandInitConfigWC.f234834c1 = this.f246265h;
            C84583r2.INSTANCE.mo111331Gm(this.f246266i, appBrandInitConfigWC);
            str = "Activity(" + this.f246266i + ')';
        } else if (this.f246269o.f246146f == null) {
            AppBrandProcessesManager.m103870J(this.f246261d, this.f246262e, this.f246263f, this.f246264g);
            C84340u.super.mo111411y(this.f246270p, this.f246264g, this.f246269o, this.f246267j, this.f246268n);
        } else if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_appbrand_open_by_h5_intent_forward, 1) == 1) {
            AppBrandProcessesManager.m103870J(this.f246261d, this.f246262e, this.f246263f, this.f246264g);
            ActivityStarterIpcDelegate activityStarterIpcDelegate = this.f246269o.f246146f;
            Intent intent = this.f246264g;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activityStarterIpcDelegate, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityStarterIpcDelegate.mo880b((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activityStarterIpcDelegate, "com/tencent/mm/plugin/appbrand/task/AppBrandProcessesManager$onStartWxaApp$6", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            str = "ActivityStarterIpcDelegate";
        } else {
            AppBrandProcessesManager.m103870J(this.f246261d, this.f246262e, this.f246263f, this.f246264g);
            C84340u.super.mo111411y(this.f246270p, this.f246264g, this.f246269o, this.f246267j, this.f246268n);
        }
        Log.m105924i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- method:" + str + ", strategy:" + this.f246267j + ", app:" + this.f246268n);
    }
}
