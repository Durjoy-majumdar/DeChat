package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.s0 */
public class C84248s0 implements C87581a<C83928t1, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ String f246086a;

    /* renamed from: b */
    public final /* synthetic */ C81688d0 f246087b;

    public C84248s0(C81688d0 d0Var, String str) {
        this.f246087b = d0Var;
        this.f246086a = str;
    }

    public Object call(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f246087b.f239738d) {
            this.f246087b.mo114030e("tryGetProcessPreloadedPageView process EXPIRED, hasWaited[%b]", bool);
            return null;
        }
        C83928t1 f = C84331q.m103951f(C84343y.WASERVICE);
        C81688d0 d0Var = this.f246087b;
        Object[] objArr = new Object[2];
        objArr[0] = bool;
        objArr[1] = Boolean.valueOf(f != null);
        d0Var.mo114031f("tryGetProcessPreloadedPageView hasWaited[%b] loaded[%b]", objArr);
        if (f == null) {
            return null;
        }
        if (!bool.booleanValue()) {
            C83226n.m102130g(this.f246087b.f239736b.f238147j, KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
        }
        if (this.f246087b.f239736b.mo113184O1(false) == null) {
            C88643g.m110544b().mo72091a(new RuntimeException("Runtime.getLibReader() == NULL"));
            f.mo114329F();
            return null;
        }
        boolean z = f.mo114272k().compareTo(this.f246087b.f239736b.mo113184O1(false)) == 0;
        this.f246087b.mo114031f("tryGetProcessPreloadedPageView process preloaded, hasWaited[%b] commLibMatched[%b]", bool, Boolean.valueOf(z));
        if (!z) {
            f.mo114329F();
            C83226n.m102125b(this.f246087b.f239736b.f238147j, KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
            return null;
        }
        C83226n.m102128e(this.f246087b.f239736b.f238147j, KSProcessWeAppLaunch.stepWaitForWebViewPreloadDone);
        try {
            C84185b.m103770c(this.f246086a, true).f245843D = C84217q.PreloadOnProcessCreated;
        } catch (Exception unused) {
            this.f246087b.mo114030e("tryGetProcessPreloadedPageView process preloaded but get NULL session", new Object[0]);
        }
        return f;
    }
}
