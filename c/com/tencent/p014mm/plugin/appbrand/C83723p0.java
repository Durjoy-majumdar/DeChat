package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import lp3.C46888b;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.p0 */
public class C83723p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46888b f244368d;

    /* renamed from: e */
    public final /* synthetic */ d0$$b f244369e;

    /* renamed from: com.tencent.mm.plugin.appbrand.p0$a */
    public class C83724a implements C88631d.C76721a {
        public C83724a() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            C83723p0.this.f244368d.mo72093c(null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.p0$b */
    public class C83725b implements C88631d.C88632b<C83928t1> {
        public C83725b() {
        }

        /* renamed from: a */
        public void mo1772a(Object obj) {
            C83723p0.this.f244368d.mo72093c((C83928t1) obj);
        }
    }

    public C83723p0(d0$$b d0__b, C46888b bVar) {
        this.f244369e = d0__b;
        this.f244368d = bVar;
    }

    public void run() {
        if (this.f244369e.f239751b.f239738d) {
            this.f244368d.mo72093c(null);
            this.f244369e.f239751b.mo114030e("before doAheadPreloadPageView INTERRUPTED by runtime destroyed", new Object[0]);
            return;
        }
        C81688d0 d0Var = this.f244369e.f239751b;
        d0Var.mo114031f("doAheadPreloadPageView START", new Object[0]);
        String str = d0Var.f239736b.f238147j;
        C83226n.m102130g(str, KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
        d0Var.mo114032g("doAheadPreloadPageView").mo123062e(new C84804v0(d0Var, str)).mo114038a(new C83725b()).mo123065b(new C83724a());
    }
}
