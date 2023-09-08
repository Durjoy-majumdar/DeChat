package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.app.C81207z0;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.keylogger.C83226n;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84217q;
import com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.q$$f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WebView;
import com.tencent.xweb.XWebSdk;
import hp3.C87581a;
import p176jc.C87919d;
import p194lc.C88453o;

/* renamed from: com.tencent.mm.plugin.appbrand.v0 */
public class C84804v0 implements C87581a<C83928t1, Void> {

    /* renamed from: a */
    public final /* synthetic */ String f247241a;

    /* renamed from: b */
    public final /* synthetic */ C81688d0 f247242b;

    public C84804v0(C81688d0 d0Var, String str) {
        this.f247242b = d0Var;
        this.f247241a = str;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        q$$f q__f = C84331q.f246221a;
        C83928t1 t1Var = null;
        if (XWebSdk.isSysWebView()) {
            this.f247242b.mo114031f("doAheadPreloadPageView INTERRUPTED by kernel(%s)", WebView.getCurrentModuleWebCoreType().name());
            C83226n.m102125b(this.f247241a, KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
        } else if (this.f247242b.f239738d) {
            this.f247242b.mo114030e("doAheadPreloadPageView INTERRUPTED by runtime destroyed", new Object[0]);
        } else {
            ICommLibReader O1 = this.f247242b.f239736b.mo113184O1(false);
            if (O1 == null) {
                this.f247242b.mo114030e("doAheadPreloadPageView get NULL LibReader from Runtime, WTF", new Object[0]);
            } else {
                if (this.f247242b.f239736b.mo113210l1().mo111293d()) {
                    int i = C81207z0.f238545a;
                    Log.m105924i("MicroMsg.MMSkylineBootGuard", "<clinit>");
                    t1Var = (!Boolean.parseBoolean(O1.Yk0("skyline")) || !C87919d.f254457a.mo122386a()) ? new C83928t1() : new C83928t1(C88453o.class);
                } else {
                    t1Var = new C83928t1();
                }
                t1Var.mo114850V(ICommLibReader.class, O1);
                C84217q qVar = C84217q.PreloadBeforeRuntimeInit;
                t1Var.mo124768F1(qVar);
                try {
                    C84185b.m103770c(this.f247241a, true).f245843D = qVar;
                } catch (Exception unused) {
                    this.f247242b.mo114030e("doAheadPreloadPageView DONE but get NULL session", new Object[0]);
                }
                this.f247242b.mo114031f("doAheadPreloadPageView DONE", new Object[0]);
                C83226n.m102128e(this.f247241a, KSProcessWeAppLaunch.stepWaitForWebViewAheadPreloadDone);
            }
        }
        return t1Var;
    }
}
