package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedStickyEvent */
public final class FeedStickyEvent extends IEvent {

    /* renamed from: d */
    public C1040a f9169d = new C1040a();

    /* renamed from: com.tencent.mm.autogen.events.FeedStickyEvent$a */
    public static final class C1040a {

        /* renamed from: a */
        public long f9170a;

        /* renamed from: b */
        public int f9171b;

        /* renamed from: c */
        public int f9172c;
    }

    public FeedStickyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedStickyEvent)) {
            return false;
        }
        C1040a aVar = ((FeedStickyEvent) iEvent).f9169d;
        return C46238a.m51546a(Long.valueOf(this.f9169d.f9170a), Long.valueOf(aVar.f9170a)) && C46238a.m51546a(Integer.valueOf(this.f9169d.f9171b), Integer.valueOf(aVar.f9171b)) && C46238a.m51546a(Integer.valueOf(this.f9169d.f9172c), Integer.valueOf(aVar.f9172c));
    }
}
