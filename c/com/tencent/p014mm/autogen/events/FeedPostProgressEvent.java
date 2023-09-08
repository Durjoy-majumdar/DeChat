package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedPostProgressEvent */
public final class FeedPostProgressEvent extends IEvent {

    /* renamed from: d */
    public C55119a f154751d = new C55119a();

    /* renamed from: com.tencent.mm.autogen.events.FeedPostProgressEvent$a */
    public static final class C55119a {

        /* renamed from: a */
        public long f154752a;

        /* renamed from: b */
        public int f154753b;
    }

    public FeedPostProgressEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedPostProgressEvent)) {
            return false;
        }
        C55119a aVar = ((FeedPostProgressEvent) iEvent).f154751d;
        return C46238a.m51546a(Long.valueOf(this.f154751d.f154752a), Long.valueOf(aVar.f154752a)) && C46238a.m51546a(Integer.valueOf(this.f154751d.f154753b), Integer.valueOf(aVar.f154753b));
    }
}
