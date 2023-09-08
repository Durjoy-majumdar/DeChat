package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HellSessionPageIdEvent */
public final class HellSessionPageIdEvent extends IEvent {

    /* renamed from: d */
    public C17683a f48102d = new C17683a();

    /* renamed from: com.tencent.mm.autogen.events.HellSessionPageIdEvent$a */
    public static final class C17683a {

        /* renamed from: a */
        public String f48103a;

        /* renamed from: b */
        public String f48104b;
    }

    public HellSessionPageIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HellSessionPageIdEvent)) {
            return false;
        }
        C17683a aVar = ((HellSessionPageIdEvent) iEvent).f48102d;
        return C46238a.m51546a(this.f48102d.f48103a, aVar.f48103a) && C46238a.m51546a(this.f48102d.f48104b, aVar.f48104b);
    }
}
