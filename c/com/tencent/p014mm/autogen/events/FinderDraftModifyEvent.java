package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderDraftModifyEvent */
public final class FinderDraftModifyEvent extends IEvent {

    /* renamed from: d */
    public C55122a f154763d = new C55122a();

    /* renamed from: com.tencent.mm.autogen.events.FinderDraftModifyEvent$a */
    public static final class C55122a {

        /* renamed from: a */
        public long f154764a;

        /* renamed from: b */
        public int f154765b;
    }

    public FinderDraftModifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderDraftModifyEvent)) {
            return false;
        }
        C55122a aVar = ((FinderDraftModifyEvent) iEvent).f154763d;
        return C46238a.m51546a(Long.valueOf(this.f154763d.f154764a), Long.valueOf(aVar.f154764a)) && C46238a.m51546a(Integer.valueOf(this.f154763d.f154765b), Integer.valueOf(aVar.f154765b));
    }
}
