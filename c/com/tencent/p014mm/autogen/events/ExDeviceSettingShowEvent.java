package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSettingShowEvent */
public final class ExDeviceSettingShowEvent extends IEvent {

    /* renamed from: d */
    public C40077a f107479d = new C40077a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSettingShowEvent$a */
    public static final class C40077a {

        /* renamed from: a */
        public boolean f107480a;
    }

    public ExDeviceSettingShowEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSettingShowEvent)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107479d.f107480a), Boolean.valueOf(((ExDeviceSettingShowEvent) iEvent).f107479d.f107480a));
    }
}
