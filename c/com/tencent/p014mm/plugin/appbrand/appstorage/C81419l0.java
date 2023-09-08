package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82554k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hr0.C87584b;
import p224ra.C89909e;
import wi0.C90988l;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.l0 */
public final class C81419l0 {
    /* renamed from: a */
    public static final void m99894a(int i, int i2, int i3, int i4, long j, C82554k kVar) {
        C87412m.m108594g(kVar, "service");
        AppBrandRuntime runtime = kVar.getRuntime();
        C90988l d0 = runtime != null ? runtime.mo113051d0() : null;
        if (d0 == null) {
            Log.m105924i("KVStoragePerformanceReport", "sysConfig is null");
        } else if (!d0.f261074t) {
            Log.m105924i("KVStoragePerformanceReport", "performance report off");
        } else {
            Log.m105924i("KVStoragePerformanceReport", "report scheme=" + i + "  action=" + i2 + "  dataSize=" + i3 + "  count=" + i4 + "  cost=" + j);
            ((C87584b) C89909e.m112439d(C87584b.class, true)).mo121691h(16336, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(j));
        }
    }
}
