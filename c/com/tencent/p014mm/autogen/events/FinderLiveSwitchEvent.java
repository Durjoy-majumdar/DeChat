package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderLiveSwitchEvent */
public final class FinderLiveSwitchEvent extends IEvent {

    /* renamed from: d */
    public C55130a f154791d = new C55130a();

    /* renamed from: com.tencent.mm.autogen.events.FinderLiveSwitchEvent$a */
    public static final class C55130a {

        /* renamed from: a */
        public int f154792a;

        /* renamed from: b */
        public String f154793b;
    }

    public FinderLiveSwitchEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderLiveSwitchEvent)) {
            return false;
        }
        C55130a aVar = ((FinderLiveSwitchEvent) iEvent).f154791d;
        return C46238a.m51546a(Integer.valueOf(this.f154791d.f154792a), Integer.valueOf(aVar.f154792a)) && C46238a.m51546a(this.f154791d.f154793b, aVar.f154793b);
    }
}
