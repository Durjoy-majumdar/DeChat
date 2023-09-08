package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.q */
public class C83644q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C83631l f244260d;

    public C83644q(C83631l lVar) {
        this.f244260d = lVar;
    }

    public void run() {
        C83631l lVar = this.f244260d;
        long j = lVar.f244233l;
        lVar.mo115951o();
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "startTimer");
        MTimerHandler mTimerHandler = new MTimerHandler(new C83640m(lVar), false);
        lVar.f244231j = mTimerHandler;
        mTimerHandler.startTimer(j);
    }
}
