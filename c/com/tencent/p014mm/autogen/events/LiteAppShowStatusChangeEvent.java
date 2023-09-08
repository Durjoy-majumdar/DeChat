package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent */
public final class LiteAppShowStatusChangeEvent extends IEvent {

    /* renamed from: d */
    public C40132a f107623d = new C40132a();

    /* renamed from: com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent$a */
    public static final class C40132a {

        /* renamed from: a */
        public String f107624a;

        /* renamed from: b */
        public String f107625b;

        /* renamed from: c */
        public Long f107626c;

        /* renamed from: d */
        public Long f107627d;

        /* renamed from: e */
        public boolean f107628e;
    }

    public LiteAppShowStatusChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LiteAppShowStatusChangeEvent)) {
            return false;
        }
        C40132a aVar = ((LiteAppShowStatusChangeEvent) iEvent).f107623d;
        return C46238a.m51546a(this.f107623d.f107624a, aVar.f107624a) && C46238a.m51546a(this.f107623d.f107625b, aVar.f107625b) && C46238a.m51546a(this.f107623d.f107626c, aVar.f107626c) && C46238a.m51546a(this.f107623d.f107627d, aVar.f107627d) && C46238a.m51546a(Boolean.valueOf(this.f107623d.f107628e), Boolean.valueOf(aVar.f107628e));
    }
}
