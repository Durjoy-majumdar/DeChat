package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExtStepCountEvent */
public final class ExtStepCountEvent extends IEvent {

    /* renamed from: d */
    public C40095a f107516d = new C40095a();

    /* renamed from: e */
    public C40096b f107517e = new C40096b();

    /* renamed from: com.tencent.mm.autogen.events.ExtStepCountEvent$a */
    public static final class C40095a {

        /* renamed from: a */
        public int f107518a;

        /* renamed from: b */
        public long f107519b;

        /* renamed from: c */
        public long f107520c;

        /* renamed from: d */
        public long f107521d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExtStepCountEvent$b */
    public static final class C40096b {

        /* renamed from: a */
        public String f107522a;

        /* renamed from: b */
        public boolean f107523b = false;

        /* renamed from: c */
        public int f107524c;
    }

    public ExtStepCountEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExtStepCountEvent)) {
            return false;
        }
        ExtStepCountEvent extStepCountEvent = (ExtStepCountEvent) iEvent;
        C40095a aVar = extStepCountEvent.f107516d;
        if (!C46238a.m51546a(Integer.valueOf(this.f107516d.f107518a), Integer.valueOf(aVar.f107518a)) || !C46238a.m51546a(Long.valueOf(this.f107516d.f107519b), Long.valueOf(aVar.f107519b)) || !C46238a.m51546a(Long.valueOf(this.f107516d.f107520c), Long.valueOf(aVar.f107520c)) || !C46238a.m51546a(Long.valueOf(this.f107516d.f107521d), Long.valueOf(aVar.f107521d))) {
            return false;
        }
        C40096b bVar = extStepCountEvent.f107517e;
        return C46238a.m51546a(this.f107517e.f107522a, bVar.f107522a) && C46238a.m51546a(Boolean.valueOf(this.f107517e.f107523b), Boolean.valueOf(bVar.f107523b)) && C46238a.m51546a(Integer.valueOf(this.f107517e.f107524c), Integer.valueOf(bVar.f107524c));
    }
}
