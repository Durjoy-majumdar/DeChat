package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent */
public final class OnSearchSearchBoxCtrlInfoChangedEvent extends IEvent {

    /* renamed from: d */
    public C92537a f264957d = new C92537a();

    /* renamed from: com.tencent.mm.autogen.events.OnSearchSearchBoxCtrlInfoChangedEvent$a */
    public static final class C92537a {

        /* renamed from: a */
        public int f264958a;

        /* renamed from: b */
        public String f264959b;

        /* renamed from: c */
        public String f264960c;

        /* renamed from: d */
        public String f264961d;

        /* renamed from: e */
        public int f264962e;

        /* renamed from: f */
        public int f264963f;

        /* renamed from: g */
        public String f264964g;
    }

    public OnSearchSearchBoxCtrlInfoChangedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OnSearchSearchBoxCtrlInfoChangedEvent)) {
            return false;
        }
        C92537a aVar = ((OnSearchSearchBoxCtrlInfoChangedEvent) iEvent).f264957d;
        return C46238a.m51546a(Integer.valueOf(this.f264957d.f264958a), Integer.valueOf(aVar.f264958a)) && C46238a.m51546a(this.f264957d.f264959b, aVar.f264959b) && C46238a.m51546a(this.f264957d.f264960c, aVar.f264960c) && C46238a.m51546a(this.f264957d.f264961d, aVar.f264961d) && C46238a.m51546a(Integer.valueOf(this.f264957d.f264962e), Integer.valueOf(aVar.f264962e)) && C46238a.m51546a(Integer.valueOf(this.f264957d.f264963f), Integer.valueOf(aVar.f264963f)) && C46238a.m51546a(this.f264957d.f264964g, aVar.f264964g);
    }
}
