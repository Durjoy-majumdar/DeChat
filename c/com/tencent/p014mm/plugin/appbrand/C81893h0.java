package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.h0 */
public class C81893h0 implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f240223a;

    public C81893h0(C81688d0 d0Var) {
        this.f240223a = d0Var;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C46888b c = C88643g.m110545c();
        boolean n = C84331q.m103959n(C84343y.m103969a(this.f240223a.f239736b.mo121254q1()), new C81880g0(this, c), "AppBrandRuntimeBoostStrategy.preloadAppService");
        if (!n) {
            c.mo72093c(Boolean.FALSE);
        } else {
            C83226n.m102130g(this.f240223a.f239736b.f238147j, KSProcessWeAppLaunch.stepWaitForAppServicePreloadDone);
        }
        return Boolean.valueOf(n);
    }
}
