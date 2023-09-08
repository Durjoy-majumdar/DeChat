package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveTypingEvent */
public final class ReceiveTypingEvent extends IEvent {

    /* renamed from: d */
    public C67770a f193873d = new C67770a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveTypingEvent$a */
    public static final class C67770a {
    }

    public ReceiveTypingEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveTypingEvent)) {
            return false;
        }
        C67770a aVar = ((ReceiveTypingEvent) iEvent).f193873d;
        this.f193873d.getClass();
        aVar.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
