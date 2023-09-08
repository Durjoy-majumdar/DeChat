package com.tencent.p014mm.plugin.offline.p085ui;

import android.os.Looper;
import com.tencent.p014mm.autogen.events.SyncOfflineTokenEvent;
import com.tencent.p014mm.plugin.offline.C69963m;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.offline.ui.l0 */
public class C30335l0 extends IStaticListener<SyncOfflineTokenEvent> {

    /* renamed from: d */
    public MMHandler f81878d = new MMHandler(Looper.getMainLooper());

    public boolean callback(IEvent iEvent) {
        SyncOfflineTokenEvent syncOfflineTokenEvent = (SyncOfflineTokenEvent) iEvent;
        if (C86709a0.m107522a() && (syncOfflineTokenEvent instanceof SyncOfflineTokenEvent)) {
            Log.m105924i("MicroMsg.SyncOfflineTokenListener", "SyncOfflineTokenListener -> updateToken()");
            SyncOfflineTokenEvent.C28838a aVar = syncOfflineTokenEvent.f79021d;
            boolean z = aVar.f79022a;
            boolean z2 = true;
            if (aVar.f79023b != 1) {
                z2 = false;
            }
            if (z2) {
                C115669n.INSTANCE.idkeyStat(135, 25, 1, true);
            }
            if (z) {
                this.f81878d.postDelayed(new C30334k0(this, syncOfflineTokenEvent, z2), 10000);
            } else {
                syncOfflineTokenEvent.f79021d.getClass();
                C69963m.wx0().Bx0().mo96270e(z2);
            }
        }
        return false;
    }
}
