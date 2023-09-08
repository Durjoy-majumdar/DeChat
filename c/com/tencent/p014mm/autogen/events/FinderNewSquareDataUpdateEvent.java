package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent */
public final class FinderNewSquareDataUpdateEvent extends IEvent {

    /* renamed from: d */
    public C1056a f9233d = new C1056a();

    /* renamed from: com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent$a */
    public static final class C1056a {

        /* renamed from: a */
        public long f9234a;

        /* renamed from: b */
        public boolean f9235b;
    }

    public FinderNewSquareDataUpdateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderNewSquareDataUpdateEvent)) {
            return false;
        }
        C1056a aVar = ((FinderNewSquareDataUpdateEvent) iEvent).f9233d;
        if (!C46238a.m51546a(Long.valueOf(this.f9233d.f9234a), Long.valueOf(aVar.f9234a)) || !C46238a.m51546a(Boolean.valueOf(this.f9233d.f9235b), Boolean.valueOf(aVar.f9235b))) {
            return false;
        }
        this.f9233d.getClass();
        return C46238a.m51546a((Object) null, (Object) null);
    }
}
