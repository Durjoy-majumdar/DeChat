package com.tencent.p014mm.plugin.appbrand;

import android.util.Log;
import com.tencent.p014mm.plugin.appbrand.C84091r2;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.performance.C83997d;
import com.tencent.p014mm.plugin.appbrand.report.C84106b0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.m0 */
public class C83604m0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46888b f244171d;

    /* renamed from: e */
    public final /* synthetic */ long f244172e;

    /* renamed from: f */
    public final /* synthetic */ C83713o0 f244173f;

    /* renamed from: com.tencent.mm.plugin.appbrand.m0$a */
    public class C83605a implements C84091r2.C84093b {
        public C83605a() {
        }

        /* renamed from: a */
        public void mo115595a() {
            C83226n.m102128e(C83604m0.this.f244173f.f244357a.f239736b.f238147j, KSProcessWeAppLaunch.stepPrepareWebView);
            mo115916c();
        }

        /* renamed from: b */
        public void mo115596b() {
            C83226n.m102125b(C83604m0.this.f244173f.f244357a.f239736b.f238147j, KSProcessWeAppLaunch.stepPrepareWebView);
            mo115916c();
        }

        /* renamed from: c */
        public final void mo115916c() {
            C81688d0 d0Var = C83604m0.this.f244173f.f244357a;
            d0Var.mo114031f("reportXWebPreInit mProcessExpired[%b]", Boolean.valueOf(d0Var.f239738d));
            if (!C83604m0.this.f244173f.f244357a.f239738d) {
                C83604m0.this.f244171d.resume();
                try {
                    C84185b.f245912a.mo116895n(false, C83604m0.this.f244173f.f244357a.f239736b.f238147j, C83604m0.this.f244172e, C84106b0.m103652a((C83928t1) null));
                    C83604m0.this.f244173f.f244357a.f239736b.f238284l1.mo115918e(2, System.currentTimeMillis() - C83604m0.this.f244172e);
                    C83997d.m103521d(C83604m0.this.f244173f.f244357a.f239736b.f238147j, "X5Prepare", C83604m0.this.f244172e, System.currentTimeMillis());
                } catch (Throwable th) {
                    C83604m0.this.f244173f.f244357a.mo114030e("reportXWebPreInit exception stack %s", Log.getStackTraceString(th));
                }
            }
        }
    }

    public C83604m0(C83713o0 o0Var, C46888b bVar, long j) {
        this.f244173f = o0Var;
        this.f244171d = bVar;
        this.f244172e = j;
    }

    public void run() {
        C84091r2.m103628f(new C83605a());
    }
}
