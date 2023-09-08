package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent */
public final class OnFinderFeedInfoUpdatedEvent extends IEvent {

    /* renamed from: d */
    public C40148a f107671d = new C40148a();

    /* renamed from: com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent$a */
    public static final class C40148a {

        /* renamed from: a */
        public String f107672a;

        /* renamed from: b */
        public boolean f107673b;

        /* renamed from: c */
        public int f107674c;

        /* renamed from: d */
        public boolean f107675d;

        /* renamed from: e */
        public int f107676e;
    }

    public OnFinderFeedInfoUpdatedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnFinderFeedInfoUpdatedEvent)) {
            return false;
        }
        C40148a aVar = ((OnFinderFeedInfoUpdatedEvent) iEvent).f107671d;
        return C46238a.m51546a(this.f107671d.f107672a, aVar.f107672a) && C46238a.m51546a(Boolean.valueOf(this.f107671d.f107673b), Boolean.valueOf(aVar.f107673b)) && C46238a.m51546a(Integer.valueOf(this.f107671d.f107674c), Integer.valueOf(aVar.f107674c)) && C46238a.m51546a(Boolean.valueOf(this.f107671d.f107675d), Boolean.valueOf(aVar.f107675d)) && C46238a.m51546a(Integer.valueOf(this.f107671d.f107676e), Integer.valueOf(aVar.f107676e));
    }
}
