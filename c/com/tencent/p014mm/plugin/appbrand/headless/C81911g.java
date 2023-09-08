package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.luggage.sdk.launching.C80247h;
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

/* renamed from: com.tencent.mm.plugin.appbrand.headless.g */
public final class C81911g extends C87413o implements C32228q<AppBrandInitConfigWC, AppBrandStatObject, C84310k, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f240259d;

    /* renamed from: e */
    public final /* synthetic */ C86297n f240260e;

    /* renamed from: f */
    public final /* synthetic */ C81917m f240261f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C81911g(int i, C86297n nVar, C81917m mVar) {
        super(3);
        this.f240259d = i;
        this.f240260e = nVar;
        this.f240261f = mVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        AppBrandInitConfigWC appBrandInitConfigWC = (AppBrandInitConfigWC) obj;
        AppBrandStatObject appBrandStatObject = (AppBrandStatObject) obj2;
        C84310k kVar = (C84310k) obj3;
        C87412m.m108594g(appBrandInitConfigWC, "config");
        C87412m.m108594g(appBrandStatObject, "stat");
        appBrandInitConfigWC.f234829Y0 = C80247h.HEADLESS;
        int i = this.f240259d;
        if (kVar == null || (str = kVar.mo111363h()) == null) {
            str = WeChatProcess.PROCESS_APPBRAND0;
        }
        C87412m.m108593f(str, "process?.processName ?: …Process.PROCESS_APPBRAND0");
        C86297n nVar = this.f240260e;
        C81917m mVar = this.f240261f;
        Log.m105924i("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService requestId:" + i + ", appId:" + appBrandInitConfigWC.f239362d + ", remoteProcessName:" + str);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C81907d dVar = new C81907d(str, i, atomicBoolean, nVar);
        C80907o.m98778a(str, dVar);
        C80907o.m98781d(str, new BindRemoteServiceData(appBrandInitConfigWC, appBrandStatObject, i, mVar != null ? mVar.getClass().getName() : null), C81905b.f240242d.getClass(), new C81906c(atomicBoolean, nVar, str, dVar, i));
        return C13598b0.f38549a;
    }
}
