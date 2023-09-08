package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent */
public final class TestPreloadPreviewNotifyEvent extends IEvent {

    /* renamed from: d */
    public C1152a f9563d = new C1152a();

    /* renamed from: com.tencent.mm.autogen.events.TestPreloadPreviewNotifyEvent$a */
    public static final class C1152a {

        /* renamed from: a */
        public int f9564a;

        /* renamed from: b */
        public int f9565b;

        /* renamed from: c */
        public int f9566c;

        /* renamed from: d */
        public long f9567d;

        /* renamed from: e */
        public long f9568e;
    }

    public TestPreloadPreviewNotifyEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof TestPreloadPreviewNotifyEvent)) {
            return false;
        }
        C1152a aVar = ((TestPreloadPreviewNotifyEvent) iEvent).f9563d;
        return C46238a.m51546a(Integer.valueOf(this.f9563d.f9564a), Integer.valueOf(aVar.f9564a)) && C46238a.m51546a(Integer.valueOf(this.f9563d.f9565b), Integer.valueOf(aVar.f9565b)) && C46238a.m51546a(Integer.valueOf(this.f9563d.f9566c), Integer.valueOf(aVar.f9566c)) && C46238a.m51546a(Long.valueOf(this.f9563d.f9567d), Long.valueOf(aVar.f9567d)) && C46238a.m51546a(Long.valueOf(this.f9563d.f9568e), Long.valueOf(aVar.f9568e));
    }
}
