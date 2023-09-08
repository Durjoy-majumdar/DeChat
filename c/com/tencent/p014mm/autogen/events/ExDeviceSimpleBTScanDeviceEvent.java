package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTScanDeviceEvent */
public final class ExDeviceSimpleBTScanDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40085a f107500d = new C40085a();

    /* renamed from: e */
    public C40086b f107501e = new C40086b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTScanDeviceEvent$a */
    public static final class C40085a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTScanDeviceEvent$b */
    public static final class C40086b {

        /* renamed from: a */
        public boolean f107502a;
    }

    public ExDeviceSimpleBTScanDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTScanDeviceEvent)) {
            return false;
        }
        ExDeviceSimpleBTScanDeviceEvent exDeviceSimpleBTScanDeviceEvent = (ExDeviceSimpleBTScanDeviceEvent) iEvent;
        C40085a aVar = exDeviceSimpleBTScanDeviceEvent.f107500d;
        this.f107500d.getClass();
        Boolean bool = Boolean.FALSE;
        aVar.getClass();
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107501e.f107502a), Boolean.valueOf(exDeviceSimpleBTScanDeviceEvent.f107501e.f107502a));
    }
}
