package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderGamePostEvent */
public final class FinderGamePostEvent extends IEvent {

    /* renamed from: d */
    public C55125a f154773d = new C55125a();

    /* renamed from: com.tencent.mm.autogen.events.FinderGamePostEvent$a */
    public static final class C55125a {

        /* renamed from: a */
        public boolean f154774a;

        /* renamed from: b */
        public boolean f154775b;
    }

    public FinderGamePostEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderGamePostEvent)) {
            return false;
        }
        C55125a aVar = ((FinderGamePostEvent) iEvent).f154773d;
        return C46238a.m51546a(Boolean.valueOf(this.f154773d.f154774a), Boolean.valueOf(aVar.f154774a)) && C46238a.m51546a(Boolean.valueOf(this.f154773d.f154775b), Boolean.valueOf(aVar.f154775b));
    }
}
