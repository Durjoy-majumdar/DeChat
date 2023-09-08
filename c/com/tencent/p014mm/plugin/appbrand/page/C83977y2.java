package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C40478h;
import rq0.C90087f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.y2 */
public final class C83977y2 implements C82531i.C82538g {

    /* renamed from: a */
    public final /* synthetic */ C83928t1 f245165a;

    /* renamed from: b */
    public final /* synthetic */ C40478h f245166b;

    public C83977y2(C83928t1 t1Var, C40478h hVar) {
        this.f245165a = t1Var;
        this.f245166b = hVar;
    }

    public void onReady() {
        Object E0 = this.f245165a.mo116150E0(C90087f.class);
        C83982z2 z2Var = E0 instanceof C83982z2 ? (C83982z2) E0 : null;
        if (z2Var != null) {
            z2Var.mo116617i(this.f245166b);
        }
        this.f245165a.f244657w.f241645d.remove(this);
    }
}
