package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceUnBindHardDeviceEvent */
public final class ExDeviceUnBindHardDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40093a f107512d = new C40093a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceUnBindHardDeviceEvent$a */
    public static final class C40093a {

        /* renamed from: a */
        public String f107513a;
    }

    public ExDeviceUnBindHardDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceUnBindHardDeviceEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f107512d.f107513a, ((ExDeviceUnBindHardDeviceEvent) iEvent).f107512d.f107513a);
    }
}
