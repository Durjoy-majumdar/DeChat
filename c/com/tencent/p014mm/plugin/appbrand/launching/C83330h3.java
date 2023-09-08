package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81301p0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81364t3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81393y3;
import com.tencent.p014mm.plugin.appbrand.appcache.IPkgInfo;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import p210o.C11323a;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.h3 */
public final class C83330h3<I, O> implements C11323a {

    /* renamed from: a */
    public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible f243506a;

    /* renamed from: b */
    public final /* synthetic */ ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult f243507b;

    public C83330h3(ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible, ModularizingPkgRetrieverSeparatedPluginsCompatible.IPCCallResult iPCCallResult) {
        this.f243506a = modularizingPkgRetrieverSeparatedPluginsCompatible;
        this.f243507b = iPCCallResult;
    }

    public Object apply(Object obj) {
        AppBrandRuntime appBrandRuntime = (AppBrandRuntime) obj;
        StringBuilder sb = new StringBuilder();
        sb.append("onResultCustomAction, appId:");
        C81364t3 t3Var = null;
        sb.append(appBrandRuntime != null ? appBrandRuntime.f238147j : null);
        sb.append(", module:");
        sb.append(this.f243506a.f243357d);
        sb.append(", succeed:");
        sb.append(this.f243507b.f243377g);
        Log.m105924i("MicroMsg.AppBrand.ModularizingPkgRetrieverSeparatedPluginsCompatible", sb.toString());
        if (!this.f243507b.f243377g) {
            return Boolean.FALSE;
        }
        C87412m.m108593f(appBrandRuntime, "rt");
        boolean z = false;
        C81301p0 k = C81247g3.m99555k(appBrandRuntime, false);
        C81247g3 g3Var = k instanceof C81247g3 ? (C81247g3) k : null;
        Object obj2 = g3Var != null ? g3Var.f238649a : null;
        if (obj2 instanceof C81364t3) {
            t3Var = (C81364t3) obj2;
        }
        if (t3Var != null) {
            List<? extends IPkgInfo> list = this.f243507b.f243376f;
            C87412m.m108591d(list);
            if (!t3Var.f238863h) {
                t3Var.mo113651n(new C81393y3(new LinkedList(list), t3Var));
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
