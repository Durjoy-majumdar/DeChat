package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import p749xh.C66259d9;

/* renamed from: com.tencent.mm.autogen.events.UniCommentChangeEvent */
public final class UniCommentChangeEvent extends IEvent {

    /* renamed from: d */
    public C55171a f154888d = new C55171a();

    /* renamed from: com.tencent.mm.autogen.events.UniCommentChangeEvent$a */
    public static final class C55171a {

        /* renamed from: a */
        public long f154889a;

        /* renamed from: b */
        public long f154890b = 0;

        /* renamed from: c */
        public long f154891c = 0;

        /* renamed from: d */
        public int f154892d = 0;

        /* renamed from: e */
        public C66259d9 f154893e;
    }

    public UniCommentChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof UniCommentChangeEvent)) {
            return false;
        }
        C55171a aVar = ((UniCommentChangeEvent) iEvent).f154888d;
        return C46238a.m51546a(Long.valueOf(this.f154888d.f154889a), Long.valueOf(aVar.f154889a)) && C46238a.m51546a(Long.valueOf(this.f154888d.f154890b), Long.valueOf(aVar.f154890b)) && C46238a.m51546a(Long.valueOf(this.f154888d.f154891c), Long.valueOf(aVar.f154891c)) && C46238a.m51546a(Integer.valueOf(this.f154888d.f154892d), Integer.valueOf(aVar.f154892d)) && C46238a.m51546a(this.f154888d.f154893e, aVar.f154893e);
    }
}
