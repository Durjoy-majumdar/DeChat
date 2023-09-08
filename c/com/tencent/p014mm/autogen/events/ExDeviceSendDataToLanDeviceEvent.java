package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent */
public final class ExDeviceSendDataToLanDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1026a f9126d = new C1026a();

    /* renamed from: e */
    public C1027b f9127e = new C1027b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$a */
    public static final class C1026a {

        /* renamed from: a */
        public String f9128a;

        /* renamed from: b */
        public String f9129b;

        /* renamed from: c */
        public String f9130c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToLanDeviceEvent$b */
    public static final class C1027b {

        /* renamed from: a */
        public boolean f9131a;
    }

    public ExDeviceSendDataToLanDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSendDataToLanDeviceEvent)) {
            return false;
        }
        ExDeviceSendDataToLanDeviceEvent exDeviceSendDataToLanDeviceEvent = (ExDeviceSendDataToLanDeviceEvent) iEvent;
        C1026a aVar = exDeviceSendDataToLanDeviceEvent.f9126d;
        if (!C46238a.m51546a(this.f9126d.f9128a, aVar.f9128a) || !C46238a.m51546a(this.f9126d.f9129b, aVar.f9129b) || !C46238a.m51546a(this.f9126d.f9130c, aVar.f9130c)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9127e.f9131a), Boolean.valueOf(exDeviceSendDataToLanDeviceEvent.f9127e.f9131a));
    }
}
