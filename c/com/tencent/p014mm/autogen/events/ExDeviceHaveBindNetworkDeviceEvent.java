package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent */
public final class ExDeviceHaveBindNetworkDeviceEvent extends IEvent {

    /* renamed from: d */
    public C80713a f236178d = new C80713a();

    /* renamed from: e */
    public C80714b f236179e = new C80714b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$a */
    public static final class C80713a {

        /* renamed from: a */
        public long f236180a;

        /* renamed from: b */
        public String f236181b;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent$b */
    public static final class C80714b {

        /* renamed from: a */
        public boolean f236182a;
    }

    public ExDeviceHaveBindNetworkDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceHaveBindNetworkDeviceEvent)) {
            return false;
        }
        ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = (ExDeviceHaveBindNetworkDeviceEvent) iEvent;
        C80713a aVar = exDeviceHaveBindNetworkDeviceEvent.f236178d;
        if (!C46238a.m51546a(Long.valueOf(this.f236178d.f236180a), Long.valueOf(aVar.f236180a)) || !C46238a.m51546a(this.f236178d.f236181b, aVar.f236181b)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f236179e.f236182a), Boolean.valueOf(exDeviceHaveBindNetworkDeviceEvent.f236179e.f236182a));
    }
}
