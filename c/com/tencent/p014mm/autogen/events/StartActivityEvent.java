package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StartActivityEvent */
public final class StartActivityEvent extends IEvent {

    /* renamed from: d */
    public C114695a f343622d = new C114695a();

    /* renamed from: com.tencent.mm.autogen.events.StartActivityEvent$a */
    public static final class C114695a {

        /* renamed from: a */
        public String f343623a;
    }

    public StartActivityEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StartActivityEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f343622d.f343623a, ((StartActivityEvent) iEvent).f343622d.f343623a);
    }
}
