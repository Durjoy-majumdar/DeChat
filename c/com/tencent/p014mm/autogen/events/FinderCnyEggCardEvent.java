package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderCnyEggCardEvent */
public final class FinderCnyEggCardEvent extends IEvent {

    /* renamed from: d */
    public C92517a f264865d = new C92517a();

    /* renamed from: com.tencent.mm.autogen.events.FinderCnyEggCardEvent$a */
    public static final class C92517a {

        /* renamed from: a */
        public int f264866a;

        /* renamed from: b */
        public String f264867b;

        /* renamed from: c */
        public String f264868c;
    }

    public FinderCnyEggCardEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderCnyEggCardEvent)) {
            return false;
        }
        C92517a aVar = ((FinderCnyEggCardEvent) iEvent).f264865d;
        return C46238a.m51546a(Integer.valueOf(this.f264865d.f264866a), Integer.valueOf(aVar.f264866a)) && C46238a.m51546a(this.f264865d.f264867b, aVar.f264867b) && C46238a.m51546a(this.f264865d.f264868c, aVar.f264868c);
    }
}
