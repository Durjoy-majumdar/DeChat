package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent */
public final class ExDeviceOnRecvDataFromDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40074a f107467d = new C40074a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOnRecvDataFromDeviceEvent$a */
    public static final class C40074a {

        /* renamed from: a */
        public String f107468a;

        /* renamed from: b */
        public String f107469b;

        /* renamed from: c */
        public byte[] f107470c;
    }

    public ExDeviceOnRecvDataFromDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOnRecvDataFromDeviceEvent)) {
            return false;
        }
        C40074a aVar = ((ExDeviceOnRecvDataFromDeviceEvent) iEvent).f107467d;
        return C46238a.m51546a(this.f107467d.f107468a, aVar.f107468a) && C46238a.m51546a(this.f107467d.f107469b, aVar.f107469b) && C46238a.m51546a(this.f107467d.f107470c, aVar.f107470c);
    }
}
