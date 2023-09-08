package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent */
public final class ExDeviceStopScanNetworkDeviceEvent extends IEvent {

    /* renamed from: d */
    public C92489a f264744d = new C92489a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceStopScanNetworkDeviceEvent$a */
    public static final class C92489a {

        /* renamed from: a */
        public boolean f264745a;
    }

    public ExDeviceStopScanNetworkDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceStopScanNetworkDeviceEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264744d.f264745a), Boolean.valueOf(((ExDeviceStopScanNetworkDeviceEvent) iEvent).f264744d.f264745a));
    }
}
