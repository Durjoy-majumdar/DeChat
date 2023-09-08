package com.tencent.p014mm.plugin.appbrand;

import com.tencent.luggage.sdk.processes.main.LuggagePopRuntimeTask;
import com.tencent.luggage.sdk.processes.main.LuggageStashRuntimeTask;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.sdk.platformtools.Log;
import dr0.C86395a;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import p959ec.C86499a;
import u24.C90595a;

/* renamed from: com.tencent.mm.plugin.appbrand.v */
public final class C84803v {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, AppBrandRuntimeWC> f247240a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static final AppBrandRuntimeWC m104483a(AppBrandInitConfigWC appBrandInitConfigWC, C81820e3 e3Var) {
        C87412m.m108594g(appBrandInitConfigWC, "cfg");
        C87412m.m108594g(e3Var, "container");
        AppBrandRuntimeWC remove = f247240a.remove(appBrandInitConfigWC.f239362d);
        if (remove == null) {
            return null;
        }
        new LuggagePopRuntimeTask(C86499a.m107251a(remove)).mo114396f();
        boolean z = false;
        Boolean[] boolArr = {Boolean.valueOf(remove.f238116N), Boolean.valueOf(!remove.f238117P), Boolean.valueOf(!remove.mo113064k0())};
        Log.m105924i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "pollOrCreate, existed runtime[" + remove.f238147j + "], conditions[" + C90595a.m113499c(boolArr, "{}") + ']');
        Boolean bool = Boolean.TRUE;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = true;
                break;
            } else if (!C87412m.m108589b(boolArr[i], bool)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return null;
        }
        remove.mo113033U0(e3Var);
        return remove;
    }

    /* renamed from: b */
    public static final void m104484b(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "runtime");
        Log.m105924i("MicroMsg.AppBrandProcessSharedPersistentRuntimeStore", "stash " + appBrandRuntimeWC);
        if (!(appBrandRuntimeWC.f238142e instanceof C86395a)) {
            appBrandRuntimeWC.mo113033U0((C81820e3) null);
        }
        ConcurrentHashMap<String, AppBrandRuntimeWC> concurrentHashMap = f247240a;
        String str = appBrandRuntimeWC.f238147j;
        C87412m.m108593f(str, "runtime.appId");
        concurrentHashMap.put(str, appBrandRuntimeWC);
        new LuggageStashRuntimeTask(C86499a.m107251a(appBrandRuntimeWC)).mo114396f();
    }
}
