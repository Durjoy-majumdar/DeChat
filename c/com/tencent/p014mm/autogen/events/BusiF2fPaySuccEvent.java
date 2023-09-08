package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.BusiF2fPaySuccEvent */
public final class BusiF2fPaySuccEvent extends IEvent {

    /* renamed from: d */
    public C67663a f193493d = new C67663a();

    /* renamed from: com.tencent.mm.autogen.events.BusiF2fPaySuccEvent$a */
    public static final class C67663a {

        /* renamed from: a */
        public String f193494a;

        /* renamed from: b */
        public String f193495b;

        /* renamed from: c */
        public boolean f193496c = false;

        /* renamed from: d */
        public int f193497d;

        /* renamed from: e */
        public double f193498e = 0.0d;

        /* renamed from: f */
        public int f193499f;

        /* renamed from: g */
        public int f193500g;

        /* renamed from: h */
        public int f193501h;

        /* renamed from: i */
        public String f193502i;
    }

    public BusiF2fPaySuccEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof BusiF2fPaySuccEvent)) {
            return false;
        }
        C67663a aVar = ((BusiF2fPaySuccEvent) iEvent).f193493d;
        if (!C46238a.m51546a(this.f193493d.f193494a, aVar.f193494a)) {
            return false;
        }
        this.f193493d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(this.f193493d.f193495b, aVar.f193495b) && C46238a.m51546a(Boolean.valueOf(this.f193493d.f193496c), Boolean.valueOf(aVar.f193496c)) && C46238a.m51546a(Integer.valueOf(this.f193493d.f193497d), Integer.valueOf(aVar.f193497d)) && C46238a.m51546a(Double.valueOf(this.f193493d.f193498e), Double.valueOf(aVar.f193498e)) && C46238a.m51546a(Integer.valueOf(this.f193493d.f193499f), Integer.valueOf(aVar.f193499f)) && C46238a.m51546a(Integer.valueOf(this.f193493d.f193500g), Integer.valueOf(aVar.f193500g)) && C46238a.m51546a(Integer.valueOf(this.f193493d.f193501h), Integer.valueOf(aVar.f193501h)) && C46238a.m51546a(this.f193493d.f193502i, aVar.f193502i);
    }
}
