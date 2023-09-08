package p442ar;

import com.tencent.p014mm.autogen.events.CoreNetworkReadyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import p778zq.C39435b;

/* renamed from: ar.c */
public class C28111c extends IStaticListener<CoreNetworkReadyEvent> {
    public boolean callback(IEvent iEvent) {
        CoreNetworkReadyEvent coreNetworkReadyEvent = (CoreNetworkReadyEvent) iEvent;
        C39435b bVar = (C39435b) C86312j.m106911c(C39435b.class);
        bVar.getClass();
        if (!C86709a0.m107522a()) {
            return false;
        }
        Log.m105924i("MicroMsg.FCM.FCMFeatureService", "fcmRegisterEventListener callback loadFCM=" + C39435b.f105930d);
        if (!C39435b.f105930d) {
            return false;
        }
        bVar.vx0();
        return false;
    }
}
