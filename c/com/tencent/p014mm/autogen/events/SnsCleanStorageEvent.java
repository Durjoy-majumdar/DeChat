package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.SnsCleanStorageEvent */
public final class SnsCleanStorageEvent extends IEvent {

    /* renamed from: d */
    public C28827a f78986d = new C28827a();

    /* renamed from: com.tencent.mm.autogen.events.SnsCleanStorageEvent$a */
    public static final class C28827a {

        /* renamed from: a */
        public long f78987a;

        /* renamed from: b */
        public Object f78988b;

        /* renamed from: c */
        public long f78989c;

        /* renamed from: d */
        public long f78990d;

        /* renamed from: e */
        public long f78991e;

        /* renamed from: f */
        public long f78992f;
    }

    public SnsCleanStorageEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsCleanStorageEvent)) {
            return false;
        }
        C28827a aVar = ((SnsCleanStorageEvent) iEvent).f78986d;
        return C46238a.m51546a(Long.valueOf(this.f78986d.f78987a), Long.valueOf(aVar.f78987a)) && C46238a.m51546a(this.f78986d.f78988b, aVar.f78988b) && C46238a.m51546a(Long.valueOf(this.f78986d.f78989c), Long.valueOf(aVar.f78989c)) && C46238a.m51546a(Long.valueOf(this.f78986d.f78990d), Long.valueOf(aVar.f78990d)) && C46238a.m51546a(Long.valueOf(this.f78986d.f78991e), Long.valueOf(aVar.f78991e)) && C46238a.m51546a(Long.valueOf(this.f78986d.f78992f), Long.valueOf(aVar.f78992f));
    }
}
