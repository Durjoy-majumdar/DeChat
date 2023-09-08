package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RepairerActionEvent */
public final class RepairerActionEvent extends IEvent {

    /* renamed from: d */
    public C28799a f78918d = new C28799a();

    /* renamed from: com.tencent.mm.autogen.events.RepairerActionEvent$a */
    public static final class C28799a {

        /* renamed from: a */
        public int f78919a = 0;

        /* renamed from: b */
        public String f78920b;

        /* renamed from: c */
        public String f78921c;
    }

    public RepairerActionEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RepairerActionEvent)) {
            return false;
        }
        C28799a aVar = ((RepairerActionEvent) iEvent).f78918d;
        return C46238a.m51546a(Integer.valueOf(this.f78918d.f78919a), Integer.valueOf(aVar.f78919a)) && C46238a.m51546a(this.f78918d.f78920b, aVar.f78920b) && C46238a.m51546a(this.f78918d.f78921c, aVar.f78921c);
    }
}
