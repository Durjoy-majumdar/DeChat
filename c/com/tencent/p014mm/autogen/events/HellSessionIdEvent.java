package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HellSessionIdEvent */
public final class HellSessionIdEvent extends IEvent {

    /* renamed from: d */
    public C24256a f69423d = new C24256a();

    /* renamed from: com.tencent.mm.autogen.events.HellSessionIdEvent$a */
    public static final class C24256a {

        /* renamed from: a */
        public String f69424a;

        /* renamed from: b */
        public String f69425b;
    }

    public HellSessionIdEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HellSessionIdEvent)) {
            return false;
        }
        C24256a aVar = ((HellSessionIdEvent) iEvent).f69423d;
        return C46238a.m51546a(this.f69423d.f69424a, aVar.f69424a) && C46238a.m51546a(this.f69423d.f69425b, aVar.f69425b);
    }
}
