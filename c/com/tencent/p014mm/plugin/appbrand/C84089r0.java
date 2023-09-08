package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import lp3.C88631d;

/* renamed from: com.tencent.mm.plugin.appbrand.r0 */
public class C84089r0 implements C88631d.C88632b<C83928t1> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f245503a;

    public C84089r0(C81688d0 d0Var) {
        this.f245503a = d0Var;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        C83928t1 t1Var = (C83928t1) obj;
        C81688d0 d0Var = this.f245503a;
        boolean z = true;
        Object[] objArr = new Object[1];
        if (t1Var == null) {
            z = false;
        }
        objArr[0] = Boolean.valueOf(z);
        d0Var.mo114031f("pageView onTerminate loaded[%b], countdown", objArr);
        this.f245503a.f239741g = t1Var;
        this.f245503a.mo114033h();
    }
}
