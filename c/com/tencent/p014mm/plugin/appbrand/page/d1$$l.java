package com.tencent.p014mm.plugin.appbrand.page;

import bt0.C79808b;
import bt0.C79815i;

/* renamed from: com.tencent.mm.plugin.appbrand.page.d1$$l */
public class d1$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f244603d;

    /* renamed from: e */
    public final /* synthetic */ C83780d1 f244604e;

    public d1$$l(C83780d1 d1Var, int i) {
        this.f244604e = d1Var;
        this.f244603d = i;
    }

    public void run() {
        C79808b bVar = this.f244604e.f244554F;
        if (bVar != null) {
            bVar.setForegroundColor(this.f244603d);
            this.f244604e.mo116201v1((this.f244603d == -1 ? C79815i.C79816a.WHITE : C79815i.C79816a.BLACK).name());
        }
    }
}
