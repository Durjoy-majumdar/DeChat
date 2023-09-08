package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.appbrand.task.C84310k;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di0.C86297n;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicBoolean;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.u */
public final class C84345u extends C87413o implements C32228q<AppBrandInitConfigWC, AppBrandStatObject, C84310k, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f246277d;

    /* renamed from: e */
    public final /* synthetic */ C86297n f246278e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84345u(int i, C86297n nVar) {
        super(3);
        this.f246277d = i;
        this.f246278e = nVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) obj;
        AppBrandStatObject appBrandStatObject = (AppBrandStatObject) obj2;
        C84310k kVar = (C84310k) obj3;
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        int i = this.f246277d;
        if (kVar == null || (str = kVar.mo111363h()) == null) {
            str = WeChatProcess.PROCESS_APPBRAND0;
        }
        C87412m.m108593f(str, "process?.processName ?: …Process.PROCESS_APPBRAND0");
        C86297n nVar = this.f246278e;
        Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService id:" + i + ", appId:" + appBrandInitConfigWC.f239362d + ", remoteProcessName:" + str);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C84247s sVar = new C84247s(str, i, atomicBoolean, nVar);
        C80907o.m98778a(str, sVar);
        C80907o.m98781d(str, new BindRemoteServiceData(appBrandInitConfigWC, appBrandStatObject, i), C84070q.f245453d.getClass(), new C84088r(i, nVar, atomicBoolean, str, sVar));
        return C13598b0.f38549a;
    }
}
