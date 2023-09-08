package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.FinderCommentReportEvent */
public final class FinderCommentReportEvent extends IEvent {

    /* renamed from: d */
    public C55121a f154760d = new C55121a();

    /* renamed from: com.tencent.mm.autogen.events.FinderCommentReportEvent$a */
    public static final class C55121a {

        /* renamed from: a */
        public int f154761a;

        /* renamed from: b */
        public long f154762b;
    }

    public FinderCommentReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderCommentReportEvent)) {
            return false;
        }
        C55121a aVar = ((FinderCommentReportEvent) iEvent).f154760d;
        return C46238a.m51546a(Integer.valueOf(this.f154760d.f154761a), Integer.valueOf(aVar.f154761a)) && C46238a.m51546a(Long.valueOf(this.f154760d.f154762b), Long.valueOf(aVar.f154762b));
    }
}
