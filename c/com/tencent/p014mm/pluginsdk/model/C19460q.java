package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.pluginsdk.model.C19449k;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.pluginsdk.model.q */
public final class C19460q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f54988d;

    /* renamed from: e */
    public final /* synthetic */ long f54989e;

    public C19460q(String str, long j) {
        this.f54988d = str;
        this.f54989e = j;
    }

    public final void run() {
        C19449k.C19451b bVar = C19449k.f54940b.get(this.f54988d);
        if (bVar != null) {
            long j = this.f54989e;
            bVar.f54961l++;
            C19449k.C19450a aVar = bVar.f54969t.get(3);
            if (aVar != null && aVar.f54946b == 4) {
                Log.m105925i("MicroMsg.BizImageBlankReporter", "alvinluo retryDownload force restart id: %s", bVar.f54968s);
                aVar.f54946b = 1;
                aVar.mo25212b(j);
            }
        }
    }
}
