package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent */
public final class ExDeviceConnectDeviceEvent extends IEvent {

    /* renamed from: d */
    public C1006a f9066d = new C1006a();

    /* renamed from: e */
    public C1007b f9067e = new C1007b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent$a */
    public static final class C1006a {

        /* renamed from: a */
        public String f9068a;

        /* renamed from: b */
        public String f9069b;

        /* renamed from: c */
        public boolean f9070c = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceConnectDeviceEvent$b */
    public static final class C1007b {

        /* renamed from: a */
        public boolean f9071a;
    }

    public ExDeviceConnectDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceConnectDeviceEvent)) {
            return false;
        }
        ExDeviceConnectDeviceEvent exDeviceConnectDeviceEvent = (ExDeviceConnectDeviceEvent) iEvent;
        C1006a aVar = exDeviceConnectDeviceEvent.f9066d;
        if (!C46238a.m51546a(this.f9066d.f9068a, aVar.f9068a) || !C46238a.m51546a(this.f9066d.f9069b, aVar.f9069b) || !C46238a.m51546a(Boolean.valueOf(this.f9066d.f9070c), Boolean.valueOf(aVar.f9070c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f9067e.f9071a), Boolean.valueOf(exDeviceConnectDeviceEvent.f9067e.f9071a));
    }
}
