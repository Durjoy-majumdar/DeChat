package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent */
public final class GetSafeDeviceTypeEvent extends IEvent {

    /* renamed from: d */
    public C28759a f78827d = new C28759a();

    /* renamed from: com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent$a */
    public static final class C28759a {

        /* renamed from: a */
        public String f78828a;
    }

    public GetSafeDeviceTypeEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetSafeDeviceTypeEvent)) {
            return false;
        }
        return C46238a.m51546a(this.f78827d.f78828a, ((GetSafeDeviceTypeEvent) iEvent).f78827d.f78828a);
    }
}
