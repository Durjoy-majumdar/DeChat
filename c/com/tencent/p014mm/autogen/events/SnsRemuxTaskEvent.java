package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import i72.C98608f;
import if0.C46238a;
import te3.C101783gu2;

/* renamed from: com.tencent.mm.autogen.events.SnsRemuxTaskEvent */
public final class SnsRemuxTaskEvent extends IEvent {

    /* renamed from: d */
    public C92588a f265181d = new C92588a();

    /* renamed from: e */
    public C92589b f265182e = new C92589b();

    /* renamed from: com.tencent.mm.autogen.events.SnsRemuxTaskEvent$a */
    public static final class C92588a {

        /* renamed from: a */
        public String f265183a;

        /* renamed from: b */
        public int f265184b;

        /* renamed from: c */
        public C101783gu2 f265185c;

        /* renamed from: d */
        public Runnable f265186d;

        /* renamed from: e */
        public C98608f f265187e;
    }

    /* renamed from: com.tencent.mm.autogen.events.SnsRemuxTaskEvent$b */
    public static final class C92589b {

        /* renamed from: a */
        public int f265188a;
    }

    public SnsRemuxTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsRemuxTaskEvent)) {
            return false;
        }
        SnsRemuxTaskEvent snsRemuxTaskEvent = (SnsRemuxTaskEvent) iEvent;
        C92588a aVar = snsRemuxTaskEvent.f265181d;
        if (!C46238a.m51546a(this.f265181d.f265183a, aVar.f265183a) || !C46238a.m51546a(Integer.valueOf(this.f265181d.f265184b), Integer.valueOf(aVar.f265184b)) || !C46238a.m51546a(this.f265181d.f265185c, aVar.f265185c) || !C46238a.m51546a(this.f265181d.f265186d, aVar.f265186d) || !C46238a.m51546a(this.f265181d.f265187e, aVar.f265187e)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f265182e.f265188a), Integer.valueOf(snsRemuxTaskEvent.f265182e.f265188a));
    }
}
