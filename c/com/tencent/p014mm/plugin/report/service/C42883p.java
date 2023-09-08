package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import mj2.C47057f;

/* renamed from: com.tencent.mm.plugin.report.service.p */
public class C42883p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C115669n f116110d;

    public C42883p(C115669n nVar) {
        this.f116110d = nVar;
    }

    public void run() {
        C115669n nVar = this.f116110d;
        nVar.getClass();
        Log.m105924i("MicroMsg.cLog", "Update CLog ratio from server.");
        C114770g gVar = C86709a0.m107524d().f256809d;
        if (gVar == null) {
            Log.m105924i("MicroMsg.ReportManagerKvCheck", "dispatcher is null, just return.");
        } else {
            new C47057f(nVar.f346960h, nVar.f346961i).doScene(gVar, new C42881o(nVar));
        }
    }
}
