package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnConnectStateEvent */
public final class ExDeviceSimpleBTOnConnectStateEvent extends IEvent {

    /* renamed from: d */
    public C40082a f107489d = new C40082a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnConnectStateEvent$a */
    public static final class C40082a {

        /* renamed from: a */
        public String f107490a;

        /* renamed from: b */
        public int f107491b;

        /* renamed from: c */
        public long f107492c;
    }

    public ExDeviceSimpleBTOnConnectStateEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTOnConnectStateEvent)) {
            return false;
        }
        C40082a aVar = ((ExDeviceSimpleBTOnConnectStateEvent) iEvent).f107489d;
        return C46238a.m51546a(this.f107489d.f107490a, aVar.f107490a) && C46238a.m51546a(Integer.valueOf(this.f107489d.f107491b), Integer.valueOf(aVar.f107491b)) && C46238a.m51546a(Long.valueOf(this.f107489d.f107492c), Long.valueOf(aVar.f107492c));
    }
}
