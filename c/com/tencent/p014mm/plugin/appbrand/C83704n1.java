package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic;
import com.tencent.p014mm.plugin.appbrand.app.AppBrandProcessSuicideLogic$$d;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.n1 */
public final class C83704n1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ boolean f244330d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C83704n1(boolean z) {
        super(0);
        this.f244330d = z;
    }

    public Object invoke() {
        boolean publish = new AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent().publish();
        boolean z = this.f244330d;
        Log.m105924i("MicroMsg.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent", "callback handled:" + publish);
        if (!publish && C81682d.m100223c() == 0 && z) {
            AppBrandProcessSuicideLogic.m99381N(AppBrandProcessSuicideLogic$$d.NO_RUNTIMES_LEFT);
        }
        return C13598b0.f38549a;
    }
}
