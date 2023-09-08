package com.tencent.p014mm.plugin.appbrand.report;

import android.util.SparseArray;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.report.x */
public final class C84244x {

    /* renamed from: c */
    public static final C84245a f246077c = new C84245a();

    /* renamed from: d */
    public static final SparseArray<C84244x> f246078d = new SparseArray<>();

    /* renamed from: a */
    public final AppBrandUI f246079a;

    /* renamed from: b */
    public int f246080b;

    /* renamed from: com.tencent.mm.plugin.appbrand.report.x$a */
    public static final class C84245a {
    }

    public C84244x(AppBrandUI appBrandUI) {
        C87412m.m108594g(appBrandUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f246079a = appBrandUI;
    }
}
