package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent */
public final class ExDeviceLanDeviceConnectStateEvent extends IEvent {

    /* renamed from: d */
    public C1018a f9103d = new C1018a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceConnectStateEvent$a */
    public static final class C1018a {

        /* renamed from: a */
        public String f9104a;

        /* renamed from: b */
        public int f9105b;

        /* renamed from: c */
        public String f9106c;
    }

    public ExDeviceLanDeviceConnectStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceLanDeviceConnectStateEvent)) {
            return false;
        }
        C1018a aVar = ((ExDeviceLanDeviceConnectStateEvent) iEvent).f9103d;
        return C46238a.m51546a(this.f9103d.f9104a, aVar.f9104a) && C46238a.m51546a(Integer.valueOf(this.f9103d.f9105b), Integer.valueOf(aVar.f9105b)) && C46238a.m51546a(this.f9103d.f9106c, aVar.f9106c);
    }
}
