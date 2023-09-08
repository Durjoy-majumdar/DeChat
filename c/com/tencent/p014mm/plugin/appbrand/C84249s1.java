package com.tencent.p014mm.plugin.appbrand;

import com.tencent.luggage.sdk.processes.main.LuggageClearDuplicatedTask;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p959ec.C86499a;

/* renamed from: com.tencent.mm.plugin.appbrand.s1 */
public class C84249s1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f246088d;

    public C84249s1(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f246088d = appBrandRuntimeWC;
    }

    public void run() {
        AppBrandRuntimeWC b = C81682d.m100222b(this.f246088d.f238147j);
        if (!(b == null || this.f246088d == b)) {
            Log.m105925i("MicroMsg.AppBrandRuntimeWC", "clearDuplicatedInstanceOnAppCreate duplicated[%d] this[%d]", Integer.valueOf(b.hashCode()), Integer.valueOf(hashCode()));
            b.mo113175G1();
        }
        AppBrandRuntimeWC appBrandRuntimeWC = this.f246088d;
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        new LuggageClearDuplicatedTask(C86499a.m107251a(appBrandRuntimeWC)).mo114395c();
    }
}
