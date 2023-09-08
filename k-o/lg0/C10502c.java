package lg0;

import com.tencent.p014mm.autogen.events.CheckCanSyncAddrBookEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import hg0.C76186t;

/* renamed from: lg0.c */
public class C10502c extends IStaticListener<CheckCanSyncAddrBookEvent> {
    public boolean callback(IEvent iEvent) {
        CheckCanSyncAddrBookEvent checkCanSyncAddrBookEvent = (CheckCanSyncAddrBookEvent) iEvent;
        if (!(checkCanSyncAddrBookEvent instanceof CheckCanSyncAddrBookEvent)) {
            return false;
        }
        checkCanSyncAddrBookEvent.f9042d.f9043a = C76186t.m91533a();
        return false;
    }
}
