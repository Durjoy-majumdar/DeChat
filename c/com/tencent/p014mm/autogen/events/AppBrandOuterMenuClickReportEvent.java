package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent */
public final class AppBrandOuterMenuClickReportEvent extends IEvent {

    /* renamed from: d */
    public C80703a f236137d = new C80703a();

    /* renamed from: com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a */
    public static final class C80703a {

        /* renamed from: a */
        public String f236138a;

        /* renamed from: b */
        public String f236139b;

        /* renamed from: c */
        public int f236140c;

        /* renamed from: d */
        public int f236141d;

        /* renamed from: e */
        public int f236142e;

        /* renamed from: f */
        public String f236143f;

        /* renamed from: g */
        public String f236144g;

        /* renamed from: h */
        public int f236145h;

        /* renamed from: i */
        public String f236146i;

        /* renamed from: j */
        public long f236147j;

        /* renamed from: k */
        public int f236148k;

        /* renamed from: l */
        public int f236149l;

        /* renamed from: m */
        public String f236150m;
    }

    public AppBrandOuterMenuClickReportEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof AppBrandOuterMenuClickReportEvent)) {
            return false;
        }
        C80703a aVar = ((AppBrandOuterMenuClickReportEvent) iEvent).f236137d;
        if (!C46238a.m51546a(this.f236137d.f236138a, aVar.f236138a) || !C46238a.m51546a(this.f236137d.f236139b, aVar.f236139b) || !C46238a.m51546a(Integer.valueOf(this.f236137d.f236140c), Integer.valueOf(aVar.f236140c)) || !C46238a.m51546a(Integer.valueOf(this.f236137d.f236141d), Integer.valueOf(aVar.f236141d)) || !C46238a.m51546a(Integer.valueOf(this.f236137d.f236142e), Integer.valueOf(aVar.f236142e)) || !C46238a.m51546a(this.f236137d.f236143f, aVar.f236143f) || !C46238a.m51546a(this.f236137d.f236144g, aVar.f236144g) || !C46238a.m51546a(Integer.valueOf(this.f236137d.f236145h), Integer.valueOf(aVar.f236145h)) || !C46238a.m51546a(this.f236137d.f236146i, aVar.f236146i) || !C46238a.m51546a(Long.valueOf(this.f236137d.f236147j), Long.valueOf(aVar.f236147j)) || !C46238a.m51546a(Integer.valueOf(this.f236137d.f236148k), Integer.valueOf(aVar.f236148k))) {
            return false;
        }
        this.f236137d.getClass();
        return C46238a.m51546a(0, 0) && C46238a.m51546a(Integer.valueOf(this.f236137d.f236149l), Integer.valueOf(aVar.f236149l)) && C46238a.m51546a(this.f236137d.f236150m, aVar.f236150m);
    }
}
