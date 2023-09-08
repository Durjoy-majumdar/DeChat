package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.HaoKanActionEvent */
public final class HaoKanActionEvent extends IEvent {

    /* renamed from: d */
    public C1088a f9314d = new C1088a();

    /* renamed from: com.tencent.mm.autogen.events.HaoKanActionEvent$a */
    public static final class C1088a {

        /* renamed from: a */
        public String f9315a;

        /* renamed from: b */
        public String f9316b;
    }

    public HaoKanActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof HaoKanActionEvent)) {
            return false;
        }
        C1088a aVar = ((HaoKanActionEvent) iEvent).f9314d;
        return C46238a.m51546a(this.f9314d.f9315a, aVar.f9315a) && C46238a.m51546a(this.f9314d.f9316b, aVar.f9316b);
    }
}
