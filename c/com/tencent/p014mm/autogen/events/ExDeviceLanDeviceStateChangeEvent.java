package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent */
public final class ExDeviceLanDeviceStateChangeEvent extends IEvent {

    /* renamed from: d */
    public C114674a f343555d = new C114674a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceLanDeviceStateChangeEvent$a */
    public static final class C114674a {

        /* renamed from: a */
        public boolean f343556a;
    }

    public ExDeviceLanDeviceStateChangeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceLanDeviceStateChangeEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f343555d.f343556a), Boolean.valueOf(((ExDeviceLanDeviceStateChangeEvent) iEvent).f343555d.f343556a));
    }
}
