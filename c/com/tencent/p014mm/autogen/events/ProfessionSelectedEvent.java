package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ProfessionSelectedEvent */
public final class ProfessionSelectedEvent extends IEvent {

    /* renamed from: d */
    public C67757a f193831d = new C67757a();

    /* renamed from: com.tencent.mm.autogen.events.ProfessionSelectedEvent$a */
    public static final class C67757a {

        /* renamed from: a */
        public String f193832a;

        /* renamed from: b */
        public int f193833b;
    }

    public ProfessionSelectedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ProfessionSelectedEvent)) {
            return false;
        }
        C67757a aVar = ((ProfessionSelectedEvent) iEvent).f193831d;
        return C46238a.m51546a(this.f193831d.f193832a, aVar.f193832a) && C46238a.m51546a(Integer.valueOf(this.f193831d.f193833b), Integer.valueOf(aVar.f193833b));
    }
}
