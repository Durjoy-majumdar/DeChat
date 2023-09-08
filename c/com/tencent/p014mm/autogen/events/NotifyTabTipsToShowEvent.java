package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C49170dn1;

/* renamed from: com.tencent.mm.autogen.events.NotifyTabTipsToShowEvent */
public final class NotifyTabTipsToShowEvent extends IEvent {

    /* renamed from: d */
    public C55151a f154849d = new C55151a();

    /* renamed from: com.tencent.mm.autogen.events.NotifyTabTipsToShowEvent$a */
    public static final class C55151a {

        /* renamed from: a */
        public C49170dn1 f154850a;

        /* renamed from: b */
        public int f154851b;
    }

    public NotifyTabTipsToShowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NotifyTabTipsToShowEvent)) {
            return false;
        }
        C55151a aVar = ((NotifyTabTipsToShowEvent) iEvent).f154849d;
        return C46238a.m51546a(this.f154849d.f154850a, aVar.f154850a) && C46238a.m51546a(Integer.valueOf(this.f154849d.f154851b), Integer.valueOf(aVar.f154851b));
    }
}
