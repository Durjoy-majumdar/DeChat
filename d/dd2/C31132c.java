package dd2;

import cd2.C28541j;
import com.tencent.p014mm.autogen.events.DismissAllSendFailNotificationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dd2.c */
public class C31132c extends IStaticListener<DismissAllSendFailNotificationEvent> {
    public boolean callback(IEvent iEvent) {
        DismissAllSendFailNotificationEvent dismissAllSendFailNotificationEvent = (DismissAllSendFailNotificationEvent) iEvent;
        C28541j.vx0().xx0().f346877b.mo175868a();
        C28541j.vx0().yx0().f346877b.mo175868a();
        Log.m105924i("DismissAllNotificationListener", "dismiss all fail msg notification");
        return false;
    }
}
