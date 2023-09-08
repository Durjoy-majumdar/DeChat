package com.tencent.p014mm.plugin.appbrand.task;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.C80279o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandPreLoadingForPluginUI;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84674s4;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import cp0.C86078a;
import cp0.C86080b;
import cp0.C86083e;
import cp0.C86084f;
import cp0.C86085g;
import gy3.C87412m;
import j20.C117292a;
import k20.C9556a;
import o40.C61926c;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.task.m0 */
public final class C26888m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f74772d;

    /* renamed from: e */
    public final /* synthetic */ AppBrandStatObject f74773e;

    /* renamed from: f */
    public final /* synthetic */ C86078a f74774f;

    /* renamed from: g */
    public final /* synthetic */ C80279o f74775g;

    /* renamed from: h */
    public final /* synthetic */ C80264l f74776h;

    public C26888m0(AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject, C86078a aVar, C80279o oVar, C80264l lVar) {
        this.f74772d = appBrandInitConfigWC;
        this.f74773e = appBrandStatObject;
        this.f74774f = aVar;
        this.f74775g = oVar;
        this.f74776h = lVar;
    }

    public final void run() {
        int i;
        String str;
        this.f74772d.f234834c1 = this.f74773e;
        C86078a aVar = this.f74774f;
        aVar.getClass();
        C86083e eVar = C86083e.f250564a;
        C86085g gVar = new C86085g(aVar.f250550a, aVar.f250551b, aVar.f250552c, aVar.f250554e);
        synchronized (eVar) {
            SparseArray<C86085g> sparseArray = C86083e.f250565b;
            int i2 = C86083e.f250566c + 1;
            C86083e.f250566c = i2;
            sparseArray.append(i2, gVar);
            MMHandlerThread.postToMainThreadDelayed(new C86084f(C86083e.f250566c, "MicroMsg.AppBrand.PendingIntentPoster"), 12000);
            i = C86083e.f250566c;
        }
        aVar.f250555f = i;
        Class<? extends Service> cls = aVar.f250553d.f246197j;
        Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "onNeedPreLoadingUI: triggerService = " + cls.getCanonicalName());
        String canonicalName = cls.getCanonicalName();
        C87412m.m108591d(canonicalName);
        ComponentName component = aVar.f250551b.getComponent();
        if (component == null || (str = component.getClassName()) == null) {
            str = "";
        }
        Intent intent = new Intent(aVar.f250550a, aVar.f250552c.f234812Q ? AppBrandPreLoadingForPluginUI.class : aVar.f250553d.f246198k);
        Log.m105924i("MicroMsg.AppBrand.AppBrandPreLoadingLogic", "startPreLoadingActivity, ctx = " + aVar.f250550a);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.name", aVar.f250552c.f239363e);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.icon", aVar.f250552c.f239364f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.serviceName", canonicalName);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.intentKey", aVar.f250555f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.targetActivityName", str);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.splashFlavor", 5);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.appId", aVar.f250552c.f239362d);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.scene", aVar.f250554e.f245533f);
        intent.putExtra("MicroMsg.AppBrandPreLoadingLogic.versionInfo", aVar.f250552c.f234804H);
        intent.addFlags(268435456);
        Context context = aVar.f250550a;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/plugin/appbrand/loading/AppBrandPreLoadingLogic", "startPreLoadingActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        Context context3 = aVar.f250550a;
        if (context3 instanceof Activity) {
            ((C84674s4) C89909e.m112436a(C84674s4.class)).mo111331Gm((Activity) context3, aVar.f250552c);
        }
        C61926c.m72659D("MicroMsg.AppBrand.AppBrandPreLoadingLogic:startService:" + canonicalName, false, new C86080b(aVar, canonicalName), 2, (Object) null);
        aVar.f250552c.f239376g1 = cls.getCanonicalName();
        Log.m105924i("MicroMsg.AppBrandProcessesManager", "onStartWxaApp--END-- strategy:" + this.f74775g + ", app:" + this.f74776h);
    }
}
