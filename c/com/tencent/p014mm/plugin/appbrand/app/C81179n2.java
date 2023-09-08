package com.tencent.p014mm.plugin.appbrand.app;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.appbrand.appcache.C29222i;
import com.tencent.p014mm.plugin.appbrand.appcache.C29301t1;
import com.tencent.p014mm.plugin.appbrand.appcache.C81258h3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81286k3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appcache.C81347q0;
import di0.C86296l;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import z04.C112551y;

@C86522b(dependencies = {PluginAppBrand.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.appbrand.app.n2 */
public class C81179n2 extends C86301e implements C86296l {
    public C29301t1 Jo0() {
        return (C29301t1) C81161g2.Bx0(C29301t1.class);
    }

    public C81347q0<? extends C29222i> rq0(String str, int i, int i2, String str2) {
        C81286k3 wxaPkgStorageRouter = ((PluginAppBrand) C86312j.m106911c(PluginAppBrand.class)).getWxaPkgStorageRouter();
        wxaPkgStorageRouter.getClass();
        C87412m.m108594g(str, "pkgKey");
        return !(str2 == null || str2.length() == 0) ? wxaPkgStorageRouter.f238697b : (!C112551y.m153808h(str, "$__PLUGINCODE__", false, 2, (Object) null) || !C81289m.C81290a.m99663a(i)) ? wxaPkgStorageRouter.f238696a : wxaPkgStorageRouter.f238697b;
    }

    /* renamed from: uv */
    public C81258h3 mo113349uv() {
        C81161g2.requireAccountInitializedOnDemand();
        return C81161g2.f238471g;
    }
}
