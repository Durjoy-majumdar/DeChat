package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.plugin.scanner.model.C106067f0;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.scanner.model.g0 */
public final class C106070g0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f315814d;

    /* renamed from: e */
    public final /* synthetic */ C106067f0.C106068a f315815e;

    public C106070g0(int i, C106067f0.C106068a aVar) {
        this.f315814d = i;
        this.f315815e = aVar;
    }

    public final void run() {
        ArrayList arrayList = C106067f0.f315808e.get(Integer.valueOf(this.f315814d));
        if (arrayList == null) {
            arrayList = new ArrayList();
            C106067f0.f315808e.put(Integer.valueOf(this.f315814d), arrayList);
        }
        C106067f0.C106068a aVar = this.f315815e;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        if (C106067f0.f315809f.containsKey(Integer.valueOf(this.f315814d))) {
            Log.m105928w("MicroMsg.ScanConfigSyncManager", "alvinluo syncScanConfig netScene is running and ignore");
            return;
        }
        C86709a0.m107524d().mo123455a(1812, C106067f0.f315807d);
        C42911v vVar = new C42911v(this.f315814d);
        C86709a0.m107524d().mo123460f(vVar);
        C106067f0.f315809f.put(Integer.valueOf(this.f315814d), vVar);
    }
}
