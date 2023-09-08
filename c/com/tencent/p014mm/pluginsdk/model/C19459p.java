package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;

/* renamed from: com.tencent.mm.pluginsdk.model.p */
public final class C19459p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f54987d;

    public C19459p(long j) {
        this.f54987d = j;
    }

    public final void run() {
        Log.m105918d("MicroMsg.BizImageBlankReporter", "alvinluo resumeAll");
        C19449k.f54943e = false;
        Set<String> keySet = C19449k.f54940b.keySet();
        C87412m.m108593f(keySet, "reportInfoMap.keys");
        long j = this.f54987d;
        for (String str : keySet) {
            C19449k.C19451b bVar = C19449k.f54940b.get(str);
            if (bVar != null && bVar.f54967r) {
                C19449k kVar = C19449k.f54939a;
                C87412m.m108593f(str, "url");
                Log.m105919d("MicroMsg.BizImageBlankReporter", "alvinluo resume Scroll_Fling id: %s", kVar.mo25209b(str));
                bVar.mo25214b(9, j);
            }
        }
    }
}
