package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent */
public final class ExDeviceLanDeviceRecvDataEvent extends IEvent {

    /* renamed from: d */
    public C114673a f343551d = new C114673a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceRecvDataEvent$a */
    public static final class C114673a {

        /* renamed from: a */
        public String f343552a;

        /* renamed from: b */
        public String f343553b;

        /* renamed from: c */
        public byte[] f343554c;
    }

    public ExDeviceLanDeviceRecvDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceLanDeviceRecvDataEvent)) {
            return false;
        }
        C114673a aVar = ((ExDeviceLanDeviceRecvDataEvent) iEvent).f343551d;
        return C46238a.m51546a(this.f343551d.f343552a, aVar.f343552a) && C46238a.m51546a(this.f343551d.f343553b, aVar.f343553b) && C46238a.m51546a(this.f343551d.f343554c, aVar.f343554c);
    }
}
