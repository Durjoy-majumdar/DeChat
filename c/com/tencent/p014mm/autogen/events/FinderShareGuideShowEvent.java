package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderShareGuideShowEvent */
public final class FinderShareGuideShowEvent extends IEvent {

    /* renamed from: d */
    public C1062a f9248d = new C1062a();

    /* renamed from: com.tencent.mm.autogen.events.FinderShareGuideShowEvent$a */
    public static final class C1062a {

        /* renamed from: a */
        public int f9249a;

        /* renamed from: b */
        public int f9250b;
    }

    public FinderShareGuideShowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderShareGuideShowEvent)) {
            return false;
        }
        C1062a aVar = ((FinderShareGuideShowEvent) iEvent).f9248d;
        return C46238a.m51546a(Integer.valueOf(this.f9248d.f9249a), Integer.valueOf(aVar.f9249a)) && C46238a.m51546a(Integer.valueOf(this.f9248d.f9250b), Integer.valueOf(aVar.f9250b));
    }
}
