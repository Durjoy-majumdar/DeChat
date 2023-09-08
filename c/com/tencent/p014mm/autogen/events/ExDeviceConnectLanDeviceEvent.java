package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent */
public final class ExDeviceConnectLanDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1008a f9072d = new C1008a();

    /* renamed from: e */
    public C1009b f9073e = new C1009b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent$a */
    public static final class C1008a {

        /* renamed from: a */
        public String f9074a;

        /* renamed from: b */
        public String f9075b;

        /* renamed from: c */
        public boolean f9076c = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectLanDeviceEvent$b */
    public static final class C1009b {

        /* renamed from: a */
        public boolean f9077a;
    }

    public ExDeviceConnectLanDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceConnectLanDeviceEvent)) {
            return false;
        }
        ExDeviceConnectLanDeviceEvent exDeviceConnectLanDeviceEvent = (ExDeviceConnectLanDeviceEvent) iEvent;
        C1008a aVar = exDeviceConnectLanDeviceEvent.f9072d;
        if (!C46238a.m51546a(this.f9072d.f9074a, aVar.f9074a) || !C46238a.m51546a(this.f9072d.f9075b, aVar.f9075b) || !C46238a.m51546a(Boolean.valueOf(this.f9072d.f9076c), Boolean.valueOf(aVar.f9076c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9073e.f9077a), Boolean.valueOf(exDeviceConnectLanDeviceEvent.f9073e.f9077a));
    }
}
