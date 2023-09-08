package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FeedLikeEvent */
public final class FeedLikeEvent extends IEvent {

    /* renamed from: d */
    public C1036a f9157d = new C1036a();

    /* renamed from: com.tencent.mm.autogen.events.FeedLikeEvent$a */
    public static final class C1036a {
    }

    public FeedLikeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FeedLikeEvent)) {
            return false;
        }
        C1036a aVar = ((FeedLikeEvent) iEvent).f9157d;
        this.f9157d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        this.f9157d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9157d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
