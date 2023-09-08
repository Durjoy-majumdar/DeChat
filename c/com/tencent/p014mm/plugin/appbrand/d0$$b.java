package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import hp3.C87581a;
import lp3.C88643g;

/* renamed from: com.tencent.mm.plugin.appbrand.d0$$b */
public class d0$$b implements C87581a<C83928t1, C83928t1> {

    /* renamed from: a */
    public final /* synthetic */ d0$$h f239750a;

    /* renamed from: b */
    public final /* synthetic */ C81688d0 f239751b;

    public d0$$b(C81688d0 d0Var, d0$$h d0__h) {
        this.f239751b = d0Var;
        this.f239750a = d0__h;
    }

    public Object call(Object obj) {
        C83928t1 t1Var = (C83928t1) obj;
        if (t1Var != null) {
            return t1Var;
        }
        if (!this.f239751b.f239738d) {
            C83723p0 p0Var = new C83723p0(this, C88643g.m110545c());
            if (this.f239750a == d0$$h.X_CONFIG) {
                this.f239751b.f239736b.mo113024P0(p0Var);
            } else {
                this.f239751b.f239736b.f238153r.mo117763a(p0Var);
            }
        }
        return null;
    }
}
