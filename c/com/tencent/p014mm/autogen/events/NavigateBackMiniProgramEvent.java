package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent */
public final class NavigateBackMiniProgramEvent extends IEvent {

    /* renamed from: d */
    public C80729a f236239d = new C80729a();

    /* renamed from: com.tencent.mm.autogen.events.NavigateBackMiniProgramEvent$a */
    public static final class C80729a {

        /* renamed from: a */
        public int f236240a;

        /* renamed from: b */
        public String f236241b;

        /* renamed from: c */
        public String f236242c;
    }

    public NavigateBackMiniProgramEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof NavigateBackMiniProgramEvent)) {
            return false;
        }
        C80729a aVar = ((NavigateBackMiniProgramEvent) iEvent).f236239d;
        return C46238a.m51546a(Integer.valueOf(this.f236239d.f236240a), Integer.valueOf(aVar.f236240a)) && C46238a.m51546a(this.f236239d.f236241b, aVar.f236241b) && C46238a.m51546a(this.f236239d.f236242c, aVar.f236242c);
    }
}
