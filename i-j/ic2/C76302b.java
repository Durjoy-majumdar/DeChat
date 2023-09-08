package ic2;

import com.tencent.p014mm.autogen.events.NotifyPushNewTipsEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gc2.C75902d;

/* renamed from: ic2.b */
public class C76302b extends IStaticListener<NotifyPushNewTipsEvent> {
    public boolean callback(IEvent iEvent) {
        NotifyPushNewTipsEvent notifyPushNewTipsEvent = (NotifyPushNewTipsEvent) iEvent;
        if (notifyPushNewTipsEvent != null && !Util.isNullOrNil(notifyPushNewTipsEvent.f193768d.f193769a)) {
            Log.m105925i("NotifyPushNewTipsEventIListener", "NotifyPushNewTipsEvent %s", notifyPushNewTipsEvent.f193768d.f193769a);
            C75902d.C75903a aVar = C75902d.f222578a.get(notifyPushNewTipsEvent.f193768d.f193769a);
            if (aVar != null) {
                aVar.mo102635a();
            }
        }
        return true;
    }
}
