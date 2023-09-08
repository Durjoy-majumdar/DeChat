package pn2;

import com.tencent.p014mm.autogen.events.ShakeMessageStorageNotifyEvent;
import com.tencent.p014mm.autogen.events.SwitcherEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import nn2.C76942m;

/* renamed from: pn2.h */
public class C47513h extends IStaticListener<SwitcherEvent> {
    public boolean callback(IEvent iEvent) {
        SwitcherEvent switcherEvent = (SwitcherEvent) iEvent;
        Class cls = C76942m.class;
        if (!switcherEvent.f107783d.f107785b.equals(ShakeMessageStorageNotifyEvent.class.getName())) {
            return false;
        }
        if (switcherEvent.f107783d.f107784a == 1) {
            ((C76942m) C86312j.m106911c(cls)).f224857j.mo62402c();
            return false;
        }
        ((C76942m) C86312j.m106911c(cls)).f224857j.mo62403d();
        return false;
    }
}
