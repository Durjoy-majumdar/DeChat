package com.tencent.p014mm.plugin.appbrand.jsapi.webview;

import android.view.View;
import bt0.C54553a;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.page.C83789e1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.utils.C84725c;
import rq0.C90088g;
import uj0.C90675f;
import xn0.C91304m;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.n */
public class C83114n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83928t1 f242911d;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.webview.n$a */
    public class C83115a implements C54553a {
        public C83115a() {
        }

        /* renamed from: a */
        public void mo75436a(View view) {
            C91304m I1 = C83114n.this.f242911d.mo116520A1();
            if (I1 != null) {
                I1.f261909q.getView().scrollTo(I1.f261909q.getScrollX(), 0);
            }
        }
    }

    public C83114n(C83118q qVar, C83928t1 t1Var) {
        this.f242911d = t1Var;
    }

    public void run() {
        C90088g gVar = (C90088g) this.f242911d.mo116150E0(C90088g.class);
        if (gVar != null) {
            gVar.mo116503b(true);
            gVar.mo116505d(false);
        } else {
            C83928t1 t1Var = this.f242911d;
            if (t1Var.f241593r && !(t1Var instanceof C90675f)) {
                gVar.mo116503b(true);
            }
        }
        C83928t1 t1Var2 = this.f242911d;
        if (!(t1Var2 instanceof C90675f)) {
            t1Var2.getClass();
            t1Var2.mo109673t(new C83789e1(t1Var2));
            C79808b bVar = this.f242911d.f244554F;
            bVar.f233883C.add(new C83115a());
            bVar.mo109943l(C84725c.f247120e.isEnable(), bVar.getMainTitle());
        }
    }
}
