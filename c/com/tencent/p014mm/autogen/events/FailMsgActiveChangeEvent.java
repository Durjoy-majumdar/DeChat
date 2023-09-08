package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FailMsgActiveChangeEvent */
public final class FailMsgActiveChangeEvent extends IEvent {

    /* renamed from: d */
    public C28740a f78786d = new C28740a();

    /* renamed from: com.tencent.mm.autogen.events.FailMsgActiveChangeEvent$a */
    public static final class C28740a {
    }

    public FailMsgActiveChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FailMsgActiveChangeEvent)) {
            return false;
        }
        C28740a aVar = ((FailMsgActiveChangeEvent) iEvent).f78786d;
        this.f78786d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
