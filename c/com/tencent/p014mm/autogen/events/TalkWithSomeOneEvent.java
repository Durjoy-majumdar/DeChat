package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TalkWithSomeOneEvent */
public final class TalkWithSomeOneEvent extends IEvent {

    /* renamed from: d */
    public C28841a f79032d = new C28841a();

    /* renamed from: com.tencent.mm.autogen.events.TalkWithSomeOneEvent$a */
    public static final class C28841a {
    }

    public TalkWithSomeOneEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TalkWithSomeOneEvent)) {
            return false;
        }
        C28841a aVar = ((TalkWithSomeOneEvent) iEvent).f79032d;
        this.f79032d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
