package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnRecvDataFromDeviceEvent */
public final class ExDeviceSimpleBTOnRecvDataFromDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40083a f107493d = new C40083a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnRecvDataFromDeviceEvent$a */
    public static final class C40083a {

        /* renamed from: a */
        public String f107494a;

        /* renamed from: b */
        public byte[] f107495b;
    }

    public ExDeviceSimpleBTOnRecvDataFromDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTOnRecvDataFromDeviceEvent)) {
            return false;
        }
        C40083a aVar = ((ExDeviceSimpleBTOnRecvDataFromDeviceEvent) iEvent).f107493d;
        return C46238a.m51546a(this.f107493d.f107494a, aVar.f107494a) && C46238a.m51546a(this.f107493d.f107495b, aVar.f107495b);
    }
}
