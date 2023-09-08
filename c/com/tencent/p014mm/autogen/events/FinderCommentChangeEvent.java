package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import p749xh.C66279z2;

/* renamed from: com.tencent.mm.autogen.events.FinderCommentChangeEvent */
public final class FinderCommentChangeEvent extends IEvent {

    /* renamed from: d */
    public C55120a f154754d = new C55120a();

    /* renamed from: com.tencent.mm.autogen.events.FinderCommentChangeEvent$a */
    public static final class C55120a {

        /* renamed from: a */
        public long f154755a;

        /* renamed from: b */
        public long f154756b = 0;

        /* renamed from: c */
        public long f154757c = 0;

        /* renamed from: d */
        public int f154758d = 0;

        /* renamed from: e */
        public C66279z2 f154759e;
    }

    public FinderCommentChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof FinderCommentChangeEvent)) {
            return false;
        }
        C55120a aVar = ((FinderCommentChangeEvent) iEvent).f154754d;
        return C46238a.m51546a(Long.valueOf(this.f154754d.f154755a), Long.valueOf(aVar.f154755a)) && C46238a.m51546a(Long.valueOf(this.f154754d.f154756b), Long.valueOf(aVar.f154756b)) && C46238a.m51546a(Long.valueOf(this.f154754d.f154757c), Long.valueOf(aVar.f154757c)) && C46238a.m51546a(Integer.valueOf(this.f154754d.f154758d), Integer.valueOf(aVar.f154758d)) && C46238a.m51546a(this.f154754d.f154759e, aVar.f154759e);
    }
}
