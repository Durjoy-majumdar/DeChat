package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceScanDeviceEvent */
public final class ExDeviceScanDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1022a f9114d = new C1022a();

    /* renamed from: e */
    public C1023b f9115e = new C1023b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceScanDeviceEvent$a */
    public static final class C1022a {

        /* renamed from: a */
        public String f9116a;

        /* renamed from: b */
        public boolean f9117b = false;

        /* renamed from: c */
        public int f9118c = -1;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceScanDeviceEvent$b */
    public static final class C1023b {

        /* renamed from: a */
        public boolean f9119a;
    }

    public ExDeviceScanDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceScanDeviceEvent)) {
            return false;
        }
        ExDeviceScanDeviceEvent exDeviceScanDeviceEvent = (ExDeviceScanDeviceEvent) iEvent;
        C1022a aVar = exDeviceScanDeviceEvent.f9114d;
        if (!C46238a.m51546a(this.f9114d.f9116a, aVar.f9116a) || !C46238a.m51546a(Boolean.valueOf(this.f9114d.f9117b), Boolean.valueOf(aVar.f9117b)) || !C46238a.m51546a(Integer.valueOf(this.f9114d.f9118c), Integer.valueOf(aVar.f9118c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9115e.f9119a), Boolean.valueOf(exDeviceScanDeviceEvent.f9115e.f9119a));
    }
}
