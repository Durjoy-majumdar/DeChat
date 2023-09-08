package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetCurrentSSIDEvent */
public final class ExDeviceGetCurrentSSIDEvent extends IEvent {

    /* renamed from: d */
    public C1010a f9078d = new C1010a();

    /* renamed from: e */
    public C1011b f9079e = new C1011b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetCurrentSSIDEvent$a */
    public static final class C1010a {

        /* renamed from: a */
        public boolean f9080a = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetCurrentSSIDEvent$b */
    public static final class C1011b {

        /* renamed from: a */
        public boolean f9081a;

        /* renamed from: b */
        public String f9082b;
    }

    public ExDeviceGetCurrentSSIDEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetCurrentSSIDEvent)) {
            return false;
        }
        ExDeviceGetCurrentSSIDEvent exDeviceGetCurrentSSIDEvent = (ExDeviceGetCurrentSSIDEvent) iEvent;
        if (!C46238a.m51546a(Boolean.valueOf(this.f9078d.f9080a), Boolean.valueOf(exDeviceGetCurrentSSIDEvent.f9078d.f9080a))) {
            return false;
        }
        C1011b bVar = exDeviceGetCurrentSSIDEvent.f9079e;
        return C46238a.m51546a(Boolean.valueOf(this.f9079e.f9081a), Boolean.valueOf(bVar.f9081a)) && C46238a.m51546a(this.f9079e.f9082b, bVar.f9082b);
    }
}
