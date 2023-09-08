package vy0;

import com.tencent.p014mm.autogen.events.BypNotifyActionEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import qy0.C36187a;
import qy0.C36193e;
import ry0.C36582e;
import te3.C49298el;

/* renamed from: vy0.e */
public final class C37878e extends IStaticListener<BypNotifyActionEvent> {

    /* renamed from: d */
    public final String f100261d = "BypSyncNewNotifyEventListener";

    public boolean callback(IEvent iEvent) {
        BypNotifyActionEvent bypNotifyActionEvent = (BypNotifyActionEvent) iEvent;
        C36193e.C36194a aVar = C36193e.C36194a.NOTIFY;
        Class cls = C36582e.class;
        C87412m.m108594g(bypNotifyActionEvent, "event");
        if (bypNotifyActionEvent.f78730d.f78731a != 2) {
            return true;
        }
        C49298el elVar = new C49298el();
        elVar.parseFrom(bypNotifyActionEvent.f78730d.f78732b);
        if (elVar.f132991f) {
            Log.m105924i(this.f100261d, "sync_all_selector true");
            C36193e li = ((C36582e) C86312j.m106911c(cls)).mo60563li();
            if (li == null) {
                return true;
            }
            C36193e.m40919b(li, C36187a.f96389d, aVar, false, 0, 12, (Object) null);
            return true;
        }
        C36193e li4 = ((C36582e) C86312j.m106911c(cls)).mo60563li();
        if (li4 == null) {
            return true;
        }
        LinkedList<Integer> linkedList = elVar.f132989d;
        C87412m.m108593f(linkedList, "actionNotify.selector");
        C36193e.m40919b(li4, linkedList, aVar, false, 0, 12, (Object) null);
        return true;
    }
}
