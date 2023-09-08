package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Set;

/* renamed from: com.tencent.mm.pluginsdk.model.s */
public final class C19462s implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f54992d;

    public C19462s(long j) {
        this.f54992d = j;
    }

    public final void run() {
        Log.m105918d("MicroMsg.BizImageBlankReporter", "alvinluo stopAllByFling");
        C19449k.f54943e = true;
        Set<String> keySet = C19449k.f54940b.keySet();
        C87412m.m108593f(keySet, "reportInfoMap.keys");
        long j = this.f54992d;
        for (String str : keySet) {
            C19449k.C19451b bVar = C19449k.f54940b.get(str);
            if (bVar != null && !bVar.f54965p) {
                C19449k.C19450a aVar = bVar.f54969t.get(1);
                if (!(aVar == null || aVar.f54946b == 4)) {
                    Log.m105927v("MicroMsg.BizImageBlankReporter", "alvinluo stopAllByFling task not running and start SCROLL_FLING id: %s, %s", C19449k.f54939a.mo25209b(bVar.f54956g), bVar.f54956g);
                    bVar.mo25215c(9, j);
                }
            }
        }
    }
}
