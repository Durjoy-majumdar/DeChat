package com.tencent.p014mm.plugin.appbrand.page;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.C84091r2;
import gy3.C87412m;
import p170ic.C87688b;
import p963fc.C86812g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d5 */
public final class C83784d5 implements m0$$y, C84091r2.C84093b {

    /* renamed from: a */
    public final m0$$y f244620a;

    /* renamed from: b */
    public final C86812g f244621b;

    /* renamed from: c */
    public final C87688b f244622c = new C87688b(new C83785a(this), 2);

    /* renamed from: com.tencent.mm.plugin.appbrand.page.d5$a */
    public static final class C83785a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C83784d5 f244623d;

        /* renamed from: com.tencent.mm.plugin.appbrand.page.d5$a$a */
        public static final class C83786a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C83784d5 f244624d;

            public C83786a(C83784d5 d5Var) {
                this.f244624d = d5Var;
            }

            public final void run() {
                this.f244624d.f244620a.proceed();
            }
        }

        public C83785a(C83784d5 d5Var) {
            this.f244623d = d5Var;
        }

        public final void run() {
            C83784d5 d5Var = this.f244623d;
            d5Var.f244621b.mo113024P0(new C83786a(d5Var));
        }
    }

    public C83784d5(m0$$y m0__y, C86812g gVar) {
        C87412m.m108594g(m0__y, FirebaseAnalytics.C113379b.ORIGIN);
        C87412m.m108594g(gVar, "runtime");
        this.f244620a = m0__y;
        this.f244621b = gVar;
        C84091r2.m103628f(this);
    }

    /* renamed from: a */
    public void mo115595a() {
        this.f244622c.mo122118a();
    }

    /* renamed from: b */
    public void mo115596b() {
        this.f244622c.mo122118a();
    }

    /* renamed from: c */
    public void mo116241c(String str, Object obj) {
        this.f244620a.mo116241c(str, obj);
    }

    public void cancel() {
        this.f244620a.cancel();
    }

    public void proceed() {
        this.f244622c.mo122118a();
    }

    public void setAnimationEnabled(boolean z) {
        this.f244620a.setAnimationEnabled(z);
    }
}
