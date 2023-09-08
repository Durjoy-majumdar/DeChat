package com.tencent.p014mm.plugin.appbrand.media.record;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.appbrand.media.record.m */
public class C83640m implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C83631l f244255d;

    public C83640m(C83631l lVar) {
        this.f244255d = lVar;
    }

    public boolean onTimerExpired() {
        Log.m105924i("MicroMsg.Record.AudioRecordMgr", "timer, onTimerExpired to stop record");
        this.f244255d.mo115950n();
        return true;
    }
}
