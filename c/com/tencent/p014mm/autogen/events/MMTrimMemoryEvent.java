package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.MMTrimMemoryEvent */
public final class MMTrimMemoryEvent extends IEvent {

    /* renamed from: d */
    public C80728a f236229d = new C80728a();

    /* renamed from: com.tencent.mm.autogen.events.MMTrimMemoryEvent$a */
    public static final class C80728a {

        /* renamed from: a */
        public int f236230a = 0;

        /* renamed from: b */
        public long f236231b = 0;

        /* renamed from: c */
        public long f236232c = 0;

        /* renamed from: d */
        public long f236233d = 0;

        /* renamed from: e */
        public long f236234e = 0;

        /* renamed from: f */
        public long f236235f = 0;

        /* renamed from: g */
        public long f236236g = 0;

        /* renamed from: h */
        public long f236237h = 0;

        /* renamed from: i */
        public long f236238i = 0;
    }

    public MMTrimMemoryEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof MMTrimMemoryEvent)) {
            return false;
        }
        C80728a aVar = ((MMTrimMemoryEvent) iEvent).f236229d;
        return C46238a.m51546a(Integer.valueOf(this.f236229d.f236230a), Integer.valueOf(aVar.f236230a)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236231b), Long.valueOf(aVar.f236231b)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236232c), Long.valueOf(aVar.f236232c)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236233d), Long.valueOf(aVar.f236233d)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236234e), Long.valueOf(aVar.f236234e)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236235f), Long.valueOf(aVar.f236235f)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236236g), Long.valueOf(aVar.f236236g)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236237h), Long.valueOf(aVar.f236237h)) && C46238a.m51546a(Long.valueOf(this.f236229d.f236238i), Long.valueOf(aVar.f236238i));
    }
}
