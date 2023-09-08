package com.tencent.p014mm.plugin.appbrand;

import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$q */
public class AppBrandRuntime$$q implements Comparator<C29608o3> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f79670d;

    public AppBrandRuntime$$q(AppBrandRuntime appBrandRuntime) {
        this.f79670d = appBrandRuntime;
    }

    public int compare(Object obj, Object obj2) {
        C29608o3 o3Var = (C29608o3) obj;
        C29608o3 o3Var2 = (C29608o3) obj2;
        if (o3Var == o3Var2) {
            return 0;
        }
        return o3Var.hashCode() - o3Var2.hashCode();
    }
}
