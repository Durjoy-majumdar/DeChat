package hg0;

import com.tencent.p014mm.autogen.events.FMsgGetNameEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: hg0.m */
public class C76172m extends IStaticListener<FMsgGetNameEvent> {
    public boolean callback(IEvent iEvent) {
        FMsgGetNameEvent fMsgGetNameEvent = (FMsgGetNameEvent) iEvent;
        fMsgGetNameEvent.f193612e.f193615a = C76186t.m91537e(fMsgGetNameEvent.f193611d.f193613a);
        if (!Util.isNullOrNil(fMsgGetNameEvent.f193612e.f193615a)) {
            return false;
        }
        fMsgGetNameEvent.f193612e.f193615a = C76186t.m91537e(fMsgGetNameEvent.f193611d.f193614b);
        return false;
    }
}
