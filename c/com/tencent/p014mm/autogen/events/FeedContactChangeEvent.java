package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import fe1.C58969q;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedContactChangeEvent */
public final class FeedContactChangeEvent extends IEvent {

    /* renamed from: d */
    public C55118a f154748d = new C55118a();

    /* renamed from: com.tencent.mm.autogen.events.FeedContactChangeEvent$a */
    public static final class C55118a {

        /* renamed from: a */
        public String f154749a;

        /* renamed from: b */
        public C58969q f154750b;
    }

    public FeedContactChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedContactChangeEvent)) {
            return false;
        }
        C55118a aVar = ((FeedContactChangeEvent) iEvent).f154748d;
        return C46238a.m51546a(this.f154748d.f154749a, aVar.f154749a) && C46238a.m51546a(this.f154748d.f154750b, aVar.f154750b);
    }
}
