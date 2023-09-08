package com.tencent.p014mm.plugin.report.service;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import g40.C87134f;

/* renamed from: com.tencent.mm.plugin.report.service.n$$q */
public class n$$q implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ Runnable f81929d;

    public n$$q(C115669n nVar, Runnable runnable) {
        this.f81929d = runnable;
    }

    /* renamed from: e */
    public void mo1180e() {
        C86709a0.m107528h().mo121101p(this);
        Log.m105924i("MicroMsg.ReportManagerKvCheck", "Delay report");
        this.f81929d.run();
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
    }
}
