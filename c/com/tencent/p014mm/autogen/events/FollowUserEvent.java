package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FollowUserEvent */
public final class FollowUserEvent extends IEvent {

    /* renamed from: d */
    public C55139a f154820d = new C55139a();

    /* renamed from: com.tencent.mm.autogen.events.FollowUserEvent$a */
    public static final class C55139a {

        /* renamed from: a */
        public String f154821a;

        /* renamed from: b */
        public int f154822b;

        /* renamed from: c */
        public boolean f154823c;

        /* renamed from: d */
        public int f154824d;
    }

    public FollowUserEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FollowUserEvent)) {
            return false;
        }
        C55139a aVar = ((FollowUserEvent) iEvent).f154820d;
        return C46238a.m51546a(this.f154820d.f154821a, aVar.f154821a) && C46238a.m51546a(Integer.valueOf(this.f154820d.f154822b), Integer.valueOf(aVar.f154822b)) && C46238a.m51546a(Boolean.valueOf(this.f154820d.f154823c), Boolean.valueOf(aVar.f154823c)) && C46238a.m51546a(Integer.valueOf(this.f154820d.f154824d), Integer.valueOf(aVar.f154824d));
    }
}
