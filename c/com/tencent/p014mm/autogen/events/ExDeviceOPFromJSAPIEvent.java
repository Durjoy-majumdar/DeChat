package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent */
public final class ExDeviceOPFromJSAPIEvent extends IEvent {

    /* renamed from: d */
    public C1020a f9110d = new C1020a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceOPFromJSAPIEvent$a */
    public static final class C1020a {

        /* renamed from: a */
        public int f9111a = 0;
    }

    public ExDeviceOPFromJSAPIEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceOPFromJSAPIEvent)) {
            return false;
        }
        return C46238a.m51546a(Integer.valueOf(this.f9110d.f9111a), Integer.valueOf(((ExDeviceOPFromJSAPIEvent) iEvent).f9110d.f9111a));
    }
}
