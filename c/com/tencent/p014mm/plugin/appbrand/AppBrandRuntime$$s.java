package com.tencent.p014mm.plugin.appbrand;

import java.util.Comparator;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntime$$s */
public class AppBrandRuntime$$s implements Comparator<Runnable> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f79672d;

    public AppBrandRuntime$$s(AppBrandRuntime appBrandRuntime) {
        this.f79672d = appBrandRuntime;
    }

    public int compare(Object obj, Object obj2) {
        Runnable runnable = (Runnable) obj;
        Runnable runnable2 = (Runnable) obj2;
        if (runnable == runnable2) {
            return 0;
        }
        return runnable.hashCode() - runnable2.hashCode();
    }
}
