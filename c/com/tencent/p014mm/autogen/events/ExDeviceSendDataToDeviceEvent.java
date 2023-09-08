package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToDeviceEvent */
public final class ExDeviceSendDataToDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1024a f9120d = new C1024a();

    /* renamed from: e */
    public C1025b f9121e = new C1025b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToDeviceEvent$a */
    public static final class C1024a {

        /* renamed from: a */
        public String f9122a;

        /* renamed from: b */
        public String f9123b;

        /* renamed from: c */
        public byte[] f9124c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToDeviceEvent$b */
    public static final class C1025b {

        /* renamed from: a */
        public boolean f9125a;
    }

    public ExDeviceSendDataToDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSendDataToDeviceEvent)) {
            return false;
        }
        ExDeviceSendDataToDeviceEvent exDeviceSendDataToDeviceEvent = (ExDeviceSendDataToDeviceEvent) iEvent;
        C1024a aVar = exDeviceSendDataToDeviceEvent.f9120d;
        if (!C46238a.m51546a(this.f9120d.f9122a, aVar.f9122a) || !C46238a.m51546a(this.f9120d.f9123b, aVar.f9123b) || !C46238a.m51546a(this.f9120d.f9124c, aVar.f9124c)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9121e.f9125a), Boolean.valueOf(exDeviceSendDataToDeviceEvent.f9121e.f9125a));
    }
}
