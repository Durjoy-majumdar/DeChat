package vy0;

import com.tencent.p014mm.autogen.events.BypNotifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import qy0.C36193e;
import ry0.C36582e;

/* renamed from: vy0.c */
public final class C37876c extends IStaticListener<BypNotifyEvent> {
    public boolean callback(IEvent iEvent) {
        BypNotifyEvent bypNotifyEvent = (BypNotifyEvent) iEvent;
        C87412m.m108594g(bypNotifyEvent, "event");
        C36193e li = ((C36582e) C86312j.m106911c(C36582e.class)).mo60563li();
        if (li == null) {
            return true;
        }
        LinkedList<Integer> linkedList = bypNotifyEvent.f78733d.f78734a.f138654d;
        C87412m.m108593f(linkedList, "event.data.data.selector");
        C36193e.m40919b(li, linkedList, C36193e.C36194a.NOTIFY, false, 0, 12, (Object) null);
        return true;
    }
}
