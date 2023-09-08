package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent */
public final class ExDeviceCheckDeviceIsBoundEvent extends IEvent {

    /* renamed from: d */
    public C40062a f107435d = new C40062a();

    /* renamed from: e */
    public C40063b f107436e = new C40063b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent$a */
    public static final class C40062a {

        /* renamed from: a */
        public String f107437a;

        /* renamed from: b */
        public String f107438b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckDeviceIsBoundEvent$b */
    public static final class C40063b {

        /* renamed from: a */
        public boolean f107439a;
    }

    public ExDeviceCheckDeviceIsBoundEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceCheckDeviceIsBoundEvent)) {
            return false;
        }
        ExDeviceCheckDeviceIsBoundEvent exDeviceCheckDeviceIsBoundEvent = (ExDeviceCheckDeviceIsBoundEvent) iEvent;
        C40062a aVar = exDeviceCheckDeviceIsBoundEvent.f107435d;
        if (!C46238a.m51546a(this.f107435d.f107437a, aVar.f107437a) || !C46238a.m51546a(this.f107435d.f107438b, aVar.f107438b)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107436e.f107439a), Boolean.valueOf(exDeviceCheckDeviceIsBoundEvent.f107436e.f107439a));
    }
}
