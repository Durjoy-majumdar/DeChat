package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import oa1.C61982a;

/* renamed from: com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent */
public final class NewEdgeSqlUpdateEvent extends IEvent {

    /* renamed from: d */
    public C114684a f343585d = new C114684a();

    /* renamed from: com.tencent.mm.autogen.events.NewEdgeSqlUpdateEvent$a */
    public static final class C114684a {

        /* renamed from: a */
        public long f343586a;

        /* renamed from: b */
        public C61982a f343587b;
    }

    public NewEdgeSqlUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NewEdgeSqlUpdateEvent)) {
            return false;
        }
        C114684a aVar = ((NewEdgeSqlUpdateEvent) iEvent).f343585d;
        return C46238a.m51546a(Long.valueOf(this.f343585d.f343586a), Long.valueOf(aVar.f343586a)) && C46238a.m51546a(this.f343585d.f343587b, aVar.f343587b);
    }
}
