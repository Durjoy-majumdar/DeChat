package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderSeekEvent */
public final class FinderSeekEvent extends IEvent {

    /* renamed from: d */
    public C55134a f154807d = new C55134a();

    /* renamed from: com.tencent.mm.autogen.events.FinderSeekEvent$a */
    public static final class C55134a {

        /* renamed from: a */
        public long f154808a;

        /* renamed from: b */
        public String f154809b;

        /* renamed from: c */
        public int f154810c;

        /* renamed from: d */
        public int f154811d;
    }

    public FinderSeekEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderSeekEvent)) {
            return false;
        }
        C55134a aVar = ((FinderSeekEvent) iEvent).f154807d;
        return C46238a.m51546a(Long.valueOf(this.f154807d.f154808a), Long.valueOf(aVar.f154808a)) && C46238a.m51546a(this.f154807d.f154809b, aVar.f154809b) && C46238a.m51546a(Integer.valueOf(this.f154807d.f154810c), Integer.valueOf(aVar.f154810c)) && C46238a.m51546a(Integer.valueOf(this.f154807d.f154811d), Integer.valueOf(aVar.f154811d));
    }
}
