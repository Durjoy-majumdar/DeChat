package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetBoundIotDevicesEvent */
public final class ExDeviceGetBoundIotDevicesEvent extends IEvent {

    /* renamed from: d */
    public C40067a f107447d = new C40067a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetBoundIotDevicesEvent$a */
    public static final class C40067a {

        /* renamed from: a */
        public boolean f107448a = false;
    }

    public ExDeviceGetBoundIotDevicesEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetBoundIotDevicesEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107447d.f107448a), Boolean.valueOf(((ExDeviceGetBoundIotDevicesEvent) iEvent).f107447d.f107448a));
    }
}
