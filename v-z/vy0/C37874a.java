package vy0;

import com.tencent.p014mm.autogen.events.BypNewSyncEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gy3.C87412m;
import qy0.C36187a;
import qy0.C36193e;
import ry0.C36582e;

/* renamed from: vy0.a */
public final class C37874a extends IStaticListener<BypNewSyncEvent> {
    public boolean callback(IEvent iEvent) {
        C87412m.m108594g((BypNewSyncEvent) iEvent, "event");
        C36193e li = ((C36582e) C86312j.m106911c(C36582e.class)).mo60563li();
        if (li == null) {
            return true;
        }
        C36193e.m40919b(li, C36187a.f96389d, C36193e.C36194a.NEW_SYNC, false, 0, 12, (Object) null);
        return true;
    }
}
