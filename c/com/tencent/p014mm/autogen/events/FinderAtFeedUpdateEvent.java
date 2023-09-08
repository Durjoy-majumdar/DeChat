package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderAtFeedUpdateEvent */
public final class FinderAtFeedUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1042a f9187d = new C1042a();

    /* renamed from: com.tencent.mm.autogen.events.FinderAtFeedUpdateEvent$a */
    public static final class C1042a {
    }

    public FinderAtFeedUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderAtFeedUpdateEvent)) {
            return false;
        }
        C1042a aVar = ((FinderAtFeedUpdateEvent) iEvent).f9187d;
        this.f9187d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9187d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f9187d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f9187d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
