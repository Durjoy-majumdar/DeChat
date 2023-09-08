package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderIpcResultEvent */
public final class FinderIpcResultEvent extends IEvent {

    /* renamed from: d */
    public C1049a f9214d = new C1049a();

    /* renamed from: com.tencent.mm.autogen.events.FinderIpcResultEvent$a */
    public static final class C1049a {

        /* renamed from: a */
        public String f9215a;
    }

    public FinderIpcResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderIpcResultEvent)) {
            return false;
        }
        C1049a aVar = ((FinderIpcResultEvent) iEvent).f9214d;
        this.f9214d.getClass();
        aVar.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f9214d.f9215a, aVar.f9215a);
    }
}
