package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¨\u0006\u0003"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/AppBrandRuntime;", "", "isGame", "plugin-appbrand-integration_release"}, mo182095k = 2, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWCAccessible */
public final class AppBrandRuntimeWCAccessible {
    /* renamed from: a */
    public static final String m99325a(C82381f fVar) {
        AppBrandInitConfigWC M1;
        C82554k kVar = fVar instanceof C82554k ? (C82554k) fVar : null;
        AppBrandRuntime runtime = kVar != null ? kVar.getRuntime() : null;
        AppBrandRuntimeWC appBrandRuntimeWC = runtime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) runtime : null;
        if (appBrandRuntimeWC == null || (M1 = appBrandRuntimeWC.mo113210l1()) == null) {
            return null;
        }
        return M1.f234839s;
    }

    /* renamed from: b */
    public static final boolean m99326b(AppBrandInitConfig appBrandInitConfig) {
        AppBrandInitConfigWC appBrandInitConfigWC = appBrandInitConfig instanceof AppBrandInitConfigWC ? (AppBrandInitConfigWC) appBrandInitConfig : null;
        if (appBrandInitConfigWC != null) {
            return appBrandInitConfigWC.mo111300k();
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m99327c(C82381f fVar) {
        AppBrandRuntime runtime;
        C82554k kVar = fVar instanceof C82554k ? (C82554k) fVar : null;
        if (kVar == null || (runtime = kVar.getRuntime()) == null) {
            return false;
        }
        return isGame(runtime);
    }

    /* renamed from: d */
    public static final boolean m99328d(AppBrandRuntime appBrandRuntime) {
        AppBrandRuntimeWC appBrandRuntimeWC = appBrandRuntime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) appBrandRuntime : null;
        if (appBrandRuntimeWC != null) {
            return appBrandRuntimeWC.mo113194Y1();
        }
        return false;
    }

    public static final boolean isGame(AppBrandRuntime appBrandRuntime) {
        AppBrandRuntimeWC appBrandRuntimeWC = appBrandRuntime instanceof AppBrandRuntimeWC ? (AppBrandRuntimeWC) appBrandRuntime : null;
        if (appBrandRuntimeWC != null) {
            return appBrandRuntimeWC.mo121254q1();
        }
        return false;
    }
}
