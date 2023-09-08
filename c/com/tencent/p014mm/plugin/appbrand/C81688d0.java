package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.launching.C83499v;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kr0.C88267e;
import lp3.C88633e;
import nr3.C89059e;
import p170ic.C87688b;
import p176jc.C87919d;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.appbrand.d0 */
public final class C81688d0 extends AppBrandRuntime$$z {

    /* renamed from: b */
    public final AppBrandRuntimeWC f239736b;

    /* renamed from: c */
    public final C87688b f239737c;

    /* renamed from: d */
    public volatile boolean f239738d = false;

    /* renamed from: e */
    public volatile boolean f239739e = false;

    /* renamed from: f */
    public volatile d0$$h f239740f;

    /* renamed from: g */
    public volatile C83928t1 f239741g;

    /* renamed from: h */
    public volatile C88267e f239742h;

    /* renamed from: i */
    public final AtomicBoolean f239743i = new AtomicBoolean(false);

    /* renamed from: j */
    public final AtomicBoolean f239744j = new AtomicBoolean(false);

    /* renamed from: k */
    public final AtomicBoolean f239745k = new AtomicBoolean(false);

    /* renamed from: l */
    public final LinkedList<Runnable> f239746l = new LinkedList<>();

    /* renamed from: m */
    public C88633e<C88267e> f239747m;

    /* renamed from: n */
    public C88633e<C83928t1> f239748n;

    public C81688d0(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f239736b = appBrandRuntimeWC;
        this.f239737c = new C87688b(new d0$$c(this), 2);
    }

    /* renamed from: a */
    public void mo113113a() {
        mo114030e("interrupt()", new Object[0]);
        this.f239738d = true;
        C88267e eVar = this.f239742h;
        this.f239742h = null;
        if (eVar != null) {
            try {
                eVar.mo114329F();
            } catch (Throwable th) {
                mo114030e("interrupt() cleanup service e=%s", th);
            }
        }
        C88633e<C88267e> eVar2 = this.f239747m;
        if (eVar2 != null) {
            eVar2.mo123069i(true);
        }
        C83928t1 t1Var = this.f239741g;
        this.f239741g = null;
        if (t1Var != null) {
            try {
                t1Var.mo114329F();
            } catch (Throwable th4) {
                mo114030e("interrupt() cleanup page e=%s", th4);
            }
        }
        C88633e<C83928t1> eVar3 = this.f239748n;
        if (eVar3 != null) {
            eVar3.mo123069i(true);
        }
    }

    /* renamed from: b */
    public void mo54191b() {
        C87688b bVar = new C87688b(new d0$$e(this), 2);
        C83226n.m102130g(this.f239736b.f238147j, KSProcessWeAppLaunch.stepInstallLibraries);
        ((C87790d) C86312j.m106911c(C87790d.class)).nx0(new d0$$f(this, bVar));
        C83499v.m102464a(this.f239736b, new d0$$g(this, bVar));
    }

    /* renamed from: d */
    public final String mo114029d() {
        return String.format(Locale.US, "Runtime[%s %d %s]~~%d~~ ", new Object[]{this.f239736b.f238147j, Integer.valueOf(this.f239736b.f238149o.f239365g), C84343y.m103969a(this.f239736b.mo121254q1()).name(), Integer.valueOf(hashCode())});
    }

    /* renamed from: e */
    public final void mo114030e(String str, Object... objArr) {
        Log.m105921e("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", mo114029d() + str, objArr);
    }

    /* renamed from: f */
    public final void mo114031f(String str, Object... objArr) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", mo114029d() + str, objArr);
    }

    /* renamed from: g */
    public final C89059e<Void> mo114032g(String str) {
        d0$$d d0__d = new d0$$d(this, str);
        d0__d.mo11397F(this.f239736b);
        d0__d.mo123423K(new Object[0]);
        return d0__d;
    }

    /* renamed from: h */
    public final void mo114033h() {
        if (!this.f239743i.getAndSet(true)) {
            this.f239737c.mo122118a();
        }
    }

    /* renamed from: i */
    public final void mo114034i() {
        if (!this.f239744j.getAndSet(true)) {
            this.f239737c.mo122118a();
        }
    }

    /* renamed from: j */
    public void mo114035j(d0$$h d0__h) {
        C88267e eVar;
        if (!this.f239738d && (eVar = this.f239742h) != null && !this.f239736b.mo121254q1() && this.f239736b.mo113210l1().mo111293d() && C87919d.f254457a.mo122386a()) {
            ICommLibReader k = eVar.mo114272k();
            C87412m.m108591d(k);
            if (Boolean.parseBoolean(k.Yk0("skyline"))) {
                eVar.mo122652Q0();
            }
        }
        if (this.f239748n == null || this.f239738d) {
            mo114031f("tryPreloadBeforeResourceDone mPageViewPipeline null || mProcessExpired", new Object[0]);
        } else if (this.f239739e) {
            mo114031f("tryPreloadBeforeResourceDone function already appended by reason[%s]", this.f239740f);
        } else {
            mo114031f("tryPreloadBeforeResourceDone tryDoAheadPreloadPageView by reason[%s]", d0__h);
            this.f239739e = true;
            this.f239740f = d0__h;
            if (this.f239748n.f255910d) {
                mo114031f("mPageViewPipeline has stopped", new Object[0]);
            } else {
                this.f239748n.mo123061d(new d0$$b(this, d0__h));
            }
        }
    }
}
