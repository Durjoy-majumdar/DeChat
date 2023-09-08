package com.tencent.p014mm.plugin.appbrand.appcache;

import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.r3 */
public final class C81350r3 {

    /* renamed from: a */
    public final String f238824a;

    public C81350r3(String str) {
        C87412m.m108594g(str, "name");
        str = !ModulePkgInfo.MAIN_MODULE_NAME.equals(str) ? C81412d0.m99868b(str, false) : str;
        C87412m.m108591d(str);
        this.f238824a = str;
    }

    public boolean equals(Object obj) {
        String str = null;
        C81350r3 r3Var = obj instanceof C81350r3 ? (C81350r3) obj : null;
        if (r3Var != null) {
            str = r3Var.f238824a;
        }
        return C87412m.m108589b(str, this.f238824a);
    }

    public int hashCode() {
        return this.f238824a.hashCode();
    }
}
