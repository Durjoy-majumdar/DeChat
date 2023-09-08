package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OplogServiceResultEvent */
public final class OplogServiceResultEvent extends IEvent {

    /* renamed from: d */
    public C40152a f107687d = new C40152a();

    /* renamed from: com.tencent.mm.autogen.events.OplogServiceResultEvent$a */
    public static final class C40152a {

        /* renamed from: a */
        public int f107688a;

        /* renamed from: b */
        public String f107689b;

        /* renamed from: c */
        public String f107690c;
    }

    public OplogServiceResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OplogServiceResultEvent)) {
            return false;
        }
        C40152a aVar = ((OplogServiceResultEvent) iEvent).f107687d;
        this.f107687d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f107687d.f107688a), Integer.valueOf(aVar.f107688a)) && C46238a.m51546a(this.f107687d.f107689b, aVar.f107689b) && C46238a.m51546a(this.f107687d.f107690c, aVar.f107690c);
    }
}
