package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ReceiveAANewXmlEvent */
public final class ReceiveAANewXmlEvent extends IEvent {

    /* renamed from: d */
    public C28794a f78902d = new C28794a();

    /* renamed from: com.tencent.mm.autogen.events.ReceiveAANewXmlEvent$a */
    public static final class C28794a {

        /* renamed from: a */
        public int f78903a;

        /* renamed from: b */
        public String f78904b;

        /* renamed from: c */
        public String f78905c;

        /* renamed from: d */
        public String f78906d;

        /* renamed from: e */
        public String f78907e;
    }

    public ReceiveAANewXmlEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ReceiveAANewXmlEvent)) {
            return false;
        }
        C28794a aVar = ((ReceiveAANewXmlEvent) iEvent).f78902d;
        return C46238a.m51546a(Integer.valueOf(this.f78902d.f78903a), Integer.valueOf(aVar.f78903a)) && C46238a.m51546a(this.f78902d.f78904b, aVar.f78904b) && C46238a.m51546a(this.f78902d.f78905c, aVar.f78905c) && C46238a.m51546a(this.f78902d.f78906d, aVar.f78906d) && C46238a.m51546a(this.f78902d.f78907e, aVar.f78907e);
    }
}
