package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent */
public final class BizFinderLineStatusChangedEvent extends IEvent {

    /* renamed from: d */
    public C40040a f107369d = new C40040a();

    /* renamed from: com.tencent.mm.autogen.events.BizFinderLineStatusChangedEvent$a */
    public static final class C40040a {

        /* renamed from: a */
        public String f107370a;

        /* renamed from: b */
        public String f107371b;

        /* renamed from: c */
        public int f107372c = 0;
    }

    public BizFinderLineStatusChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BizFinderLineStatusChangedEvent)) {
            return false;
        }
        C40040a aVar = ((BizFinderLineStatusChangedEvent) iEvent).f107369d;
        return C46238a.m51546a(this.f107369d.f107370a, aVar.f107370a) && C46238a.m51546a(this.f107369d.f107371b, aVar.f107371b) && C46238a.m51546a(Integer.valueOf(this.f107369d.f107372c), Integer.valueOf(aVar.f107372c));
    }
}
