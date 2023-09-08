package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderDraftOpEvent */
public final class FinderDraftOpEvent extends IEvent {

    /* renamed from: d */
    public C55123a f154766d = new C55123a();

    /* renamed from: com.tencent.mm.autogen.events.FinderDraftOpEvent$a */
    public static final class C55123a {

        /* renamed from: a */
        public int f154767a;

        /* renamed from: b */
        public long f154768b;
    }

    public FinderDraftOpEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderDraftOpEvent)) {
            return false;
        }
        C55123a aVar = ((FinderDraftOpEvent) iEvent).f154766d;
        return C46238a.m51546a(Integer.valueOf(this.f154766d.f154767a), Integer.valueOf(aVar.f154767a)) && C46238a.m51546a(Long.valueOf(this.f154766d.f154768b), Long.valueOf(aVar.f154768b));
    }
}
