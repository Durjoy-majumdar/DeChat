package p442ar;

import com.tencent.p014mm.autogen.events.FcmUnRegisterEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p778zq.C39435b;

/* renamed from: ar.e */
public class C28114e extends IStaticListener<FcmUnRegisterEvent> {
    public boolean callback(IEvent iEvent) {
        FcmUnRegisterEvent fcmUnRegisterEvent = (FcmUnRegisterEvent) iEvent;
        C39435b bVar = (C39435b) C86312j.m106911c(C39435b.class);
        bVar.getClass();
        Log.m105924i("MicroMsg.FCM.FCMFeatureService", "fcmUnRegisterEventListener callback loadFCM=" + C39435b.f105930d);
        if (!C39435b.f105930d) {
            return false;
        }
        bVar.wx0();
        return false;
    }
}
