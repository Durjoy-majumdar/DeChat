package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PageActivityEvent */
public final class PageActivityEvent extends IEvent {

    /* renamed from: d */
    public C80734a f236261d = new C80734a();

    /* renamed from: com.tencent.mm.autogen.events.PageActivityEvent$a */
    public static final class C80734a {

        /* renamed from: a */
        public String f236262a;

        /* renamed from: b */
        public String f236263b;

        /* renamed from: c */
        public int f236264c;
    }

    public PageActivityEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PageActivityEvent)) {
            return false;
        }
        C80734a aVar = ((PageActivityEvent) iEvent).f236261d;
        return C46238a.m51546a(this.f236261d.f236262a, aVar.f236262a) && C46238a.m51546a(this.f236261d.f236263b, aVar.f236263b) && C46238a.m51546a(Integer.valueOf(this.f236261d.f236264c), Integer.valueOf(aVar.f236264c));
    }
}
