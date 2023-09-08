package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import hp3.C87581a;
import lp3.C88643g;
import nr3.C89059e;

/* renamed from: com.tencent.mm.plugin.appbrand.k0 */
public class C83192k0 implements C87581a<C83928t1, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C81688d0 f242992a;

    public C83192k0(C81688d0 d0Var) {
        this.f242992a = d0Var;
    }

    public Object call(Object obj) {
        C89059e<_Ret> eVar;
        Boolean bool = (Boolean) obj;
        C81688d0 d0Var = this.f242992a;
        if (d0Var.f239738d) {
            d0Var.mo114030e("tryGetProcessPreloadedPageView EXPIRED return null", new Object[0]);
            eVar = null;
        } else {
            d0Var.mo114031f("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", "tryGetProcessPreloadedPageView, entered");
            String str = d0Var.f239736b.f238147j;
            eVar = d0Var.mo114032g("tryGetProcessPreloadedPageView").mo123064p(new C84346u0(d0Var));
            eVar.mo123420E(new C84248s0(d0Var, str));
        }
        if (eVar != null) {
            C88643g.m110543a(eVar);
        }
        return null;
    }
}
