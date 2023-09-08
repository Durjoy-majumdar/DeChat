package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NavigateBackH5Event */
public final class NavigateBackH5Event extends IEvent {

    /* renamed from: d */
    public C1095a f9347d = new C1095a();

    /* renamed from: com.tencent.mm.autogen.events.NavigateBackH5Event$a */
    public static final class C1095a {

        /* renamed from: a */
        public int f9348a;

        /* renamed from: b */
        public String f9349b;

        /* renamed from: c */
        public String f9350c;
    }

    public NavigateBackH5Event() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NavigateBackH5Event)) {
            return false;
        }
        C1095a aVar = ((NavigateBackH5Event) iEvent).f9347d;
        return C46238a.m51546a(Integer.valueOf(this.f9347d.f9348a), Integer.valueOf(aVar.f9348a)) && C46238a.m51546a(this.f9347d.f9349b, aVar.f9349b) && C46238a.m51546a(this.f9347d.f9350c, aVar.f9350c);
    }
}
