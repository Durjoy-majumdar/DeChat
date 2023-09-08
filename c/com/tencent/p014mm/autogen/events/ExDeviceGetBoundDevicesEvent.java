package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent */
public final class ExDeviceGetBoundDevicesEvent extends IEvent {

    /* renamed from: d */
    public C40066a f107445d = new C40066a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetBoundDevicesEvent$a */
    public static final class C40066a {

        /* renamed from: a */
        public boolean f107446a = false;
    }

    public ExDeviceGetBoundDevicesEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetBoundDevicesEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107445d.f107446a), Boolean.valueOf(((ExDeviceGetBoundDevicesEvent) iEvent).f107445d.f107446a));
    }
}
