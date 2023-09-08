package com.tencent.p014mm.plugin.appbrand;

import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$r */
public class AppBrandRuntime$$r implements Comparator<C83705n3> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f79671d;

    public AppBrandRuntime$$r(AppBrandRuntime appBrandRuntime) {
        this.f79671d = appBrandRuntime;
    }

    public int compare(Object obj, Object obj2) {
        C83705n3 n3Var = (C83705n3) obj;
        C83705n3 n3Var2 = (C83705n3) obj2;
        if (n3Var == n3Var2) {
            return 0;
        }
        return n3Var.hashCode() - n3Var2.hashCode();
    }
}
