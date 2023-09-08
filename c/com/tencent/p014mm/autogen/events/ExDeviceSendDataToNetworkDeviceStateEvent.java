package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent */
public final class ExDeviceSendDataToNetworkDeviceStateEvent extends IEvent {

    /* renamed from: d */
    public C92487a f264737d = new C92487a();

    /* renamed from: e */
    public C92488b f264738e = new C92488b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent$a */
    public static final class C92487a {

        /* renamed from: a */
        public String f264739a;

        /* renamed from: b */
        public int f264740b;

        /* renamed from: c */
        public String f264741c;

        /* renamed from: d */
        public byte[] f264742d;

        /* renamed from: e */
        public byte[] f264743e;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSendDataToNetworkDeviceStateEvent$b */
    public static final class C92488b {
    }

    public ExDeviceSendDataToNetworkDeviceStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSendDataToNetworkDeviceStateEvent)) {
            return false;
        }
        ExDeviceSendDataToNetworkDeviceStateEvent exDeviceSendDataToNetworkDeviceStateEvent = (ExDeviceSendDataToNetworkDeviceStateEvent) iEvent;
        C92487a aVar = exDeviceSendDataToNetworkDeviceStateEvent.f264737d;
        if (!C46238a.m51546a(this.f264737d.f264739a, aVar.f264739a) || !C46238a.m51546a(Integer.valueOf(this.f264737d.f264740b), Integer.valueOf(aVar.f264740b)) || !C46238a.m51546a(this.f264737d.f264741c, aVar.f264741c) || !C46238a.m51546a(this.f264737d.f264742d, aVar.f264742d) || !C46238a.m51546a(this.f264737d.f264743e, aVar.f264743e)) {
            return false;
        }
        C92488b bVar = exDeviceSendDataToNetworkDeviceStateEvent.f264738e;
        this.f264738e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
