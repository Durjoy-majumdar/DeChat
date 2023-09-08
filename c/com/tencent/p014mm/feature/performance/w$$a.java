package com.tencent.p014mm.feature.performance;

import com.tencent.matrix.mallctl.MallCtl;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.feature.performance.w$$a */
public final /* synthetic */ class w$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C28937w f79391d;

    public /* synthetic */ w$$a(C28937w wVar) {
        this.f79391d = wVar;
    }

    public final void run() {
        C28937w wVar = this.f79391d;
        wVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Log.m105924i("MicroMsg.PluginPerformance", "MADV_DONTNEED: do trim");
            MallCtl.m98068a(new C28938x(wVar));
            wVar.f79390j.f237696f = System.currentTimeMillis();
            Log.m105925i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", Long.valueOf(wVar.f79390j.f237696f - currentTimeMillis), Boolean.FALSE);
        } catch (Throwable th) {
            wVar.f79390j.f237696f = System.currentTimeMillis();
            Log.m105925i("MicroMsg.PluginPerformance", "MADV_DONTNEED: trim done. cost [%s]. error[%s]", Long.valueOf(wVar.f79390j.f237696f - currentTimeMillis), Boolean.FALSE);
            throw th;
        }
    }
}
