package com.tencent.p014mm.booter;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.RecordStateChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.booter.BackgroundPlayer$2 */
class BackgroundPlayer$2 extends IListener<RecordStateChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ C92614a f194711d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundPlayer$2(C92614a aVar, C0125s sVar) {
        super(sVar);
        this.f194711d = aVar;
        this.__eventId = -1119788006;
    }

    public boolean callback(IEvent iEvent) {
        int i = ((RecordStateChangeEvent) iEvent).f193878d.f193879a;
        if (i == 0) {
            Log.m105918d("MicroMsg.BackgroundPlayer", "jacks record resume event");
            this.f194711d.mo126634a();
            return false;
        } else if (i != 1) {
            return false;
        } else {
            Log.m105918d("MicroMsg.BackgroundPlayer", "jacks record pause event");
            this.f194711d.mo126635b();
            return false;
        }
    }
}
