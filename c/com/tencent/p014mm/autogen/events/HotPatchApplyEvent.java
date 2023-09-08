package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HotPatchApplyEvent */
public final class HotPatchApplyEvent extends IEvent {

    /* renamed from: d */
    public C28763a f78833d = new C28763a();

    /* renamed from: com.tencent.mm.autogen.events.HotPatchApplyEvent$a */
    public static final class C28763a {

        /* renamed from: a */
        public String f78834a;

        /* renamed from: b */
        public String f78835b;

        /* renamed from: c */
        public String f78836c;

        /* renamed from: d */
        public String f78837d;

        /* renamed from: e */
        public String f78838e;

        /* renamed from: f */
        public int f78839f = 0;
    }

    public HotPatchApplyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HotPatchApplyEvent)) {
            return false;
        }
        C28763a aVar = ((HotPatchApplyEvent) iEvent).f78833d;
        return C46238a.m51546a(this.f78833d.f78834a, aVar.f78834a) && C46238a.m51546a(this.f78833d.f78835b, aVar.f78835b) && C46238a.m51546a(this.f78833d.f78836c, aVar.f78836c) && C46238a.m51546a(this.f78833d.f78837d, aVar.f78837d) && C46238a.m51546a(this.f78833d.f78838e, aVar.f78838e) && C46238a.m51546a(Integer.valueOf(this.f78833d.f78839f), Integer.valueOf(aVar.f78839f));
    }
}
