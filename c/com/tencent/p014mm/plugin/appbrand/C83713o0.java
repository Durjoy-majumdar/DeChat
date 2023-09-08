package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.o0 */
public class C83713o0 implements C87581a<Boolean, Void> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f244357a;

    public C83713o0(C81688d0 d0Var) {
        this.f244357a = d0Var;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        boolean e = C84091r2.m103627e();
        this.f244357a.mo114031f("ensureXWebPreLoaded xwebLoaded %b", Boolean.valueOf(e));
        if (e) {
            return Boolean.TRUE;
        }
        C46888b c = C88643g.m110545c();
        C83226n.m102130g(this.f244357a.f239736b.f238147j, KSProcessWeAppLaunch.stepPrepareWebView);
        this.f244357a.f239736b.mo113022O0(new C83604m0(this, c, System.currentTimeMillis()));
        this.f244357a.f239736b.mo113024P0(new C83703n0(this));
        return Boolean.FALSE;
    }
}
