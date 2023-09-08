package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PreloadProcessChangeEvent */
public final class PreloadProcessChangeEvent extends IEvent {

    /* renamed from: d */
    public C55157a f154859d = new C55157a();

    /* renamed from: com.tencent.mm.autogen.events.PreloadProcessChangeEvent$a */
    public static final class C55157a {

        /* renamed from: a */
        public String f154860a;

        /* renamed from: b */
        public int f154861b;

        /* renamed from: c */
        public int f154862c;

        /* renamed from: d */
        public int f154863d;

        /* renamed from: e */
        public boolean f154864e;

        /* renamed from: f */
        public String f154865f;
    }

    public PreloadProcessChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PreloadProcessChangeEvent)) {
            return false;
        }
        C55157a aVar = ((PreloadProcessChangeEvent) iEvent).f154859d;
        if (!C46238a.m51546a(this.f154859d.f154860a, aVar.f154860a) || !C46238a.m51546a(Integer.valueOf(this.f154859d.f154861b), Integer.valueOf(aVar.f154861b))) {
            return false;
        }
        this.f154859d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f154859d.f154862c), Integer.valueOf(aVar.f154862c)) && C46238a.m51546a(Integer.valueOf(this.f154859d.f154863d), Integer.valueOf(aVar.f154863d)) && C46238a.m51546a(Boolean.valueOf(this.f154859d.f154864e), Boolean.valueOf(aVar.f154864e)) && C46238a.m51546a(this.f154859d.f154865f, aVar.f154865f);
    }
}
