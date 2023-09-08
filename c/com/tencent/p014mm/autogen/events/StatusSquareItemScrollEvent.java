package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.StatusSquareItemScrollEvent */
public final class StatusSquareItemScrollEvent extends IEvent {

    /* renamed from: d */
    public C40172a f107778d = new C40172a();

    /* renamed from: com.tencent.mm.autogen.events.StatusSquareItemScrollEvent$a */
    public static final class C40172a {

        /* renamed from: a */
        public String f107779a;

        /* renamed from: b */
        public int f107780b = -1;

        /* renamed from: c */
        public int f107781c = -1;
    }

    public StatusSquareItemScrollEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof StatusSquareItemScrollEvent)) {
            return false;
        }
        C40172a aVar = ((StatusSquareItemScrollEvent) iEvent).f107778d;
        return C46238a.m51546a(this.f107778d.f107779a, aVar.f107779a) && C46238a.m51546a(Integer.valueOf(this.f107778d.f107780b), Integer.valueOf(aVar.f107780b)) && C46238a.m51546a(Integer.valueOf(this.f107778d.f107781c), Integer.valueOf(aVar.f107781c));
    }
}
