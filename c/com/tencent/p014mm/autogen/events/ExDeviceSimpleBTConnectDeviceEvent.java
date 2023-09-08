package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent */
public final class ExDeviceSimpleBTConnectDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40080a f107484d = new C40080a();

    /* renamed from: e */
    public C40081b f107485e = new C40081b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent$a */
    public static final class C40080a {

        /* renamed from: a */
        public String f107486a;

        /* renamed from: b */
        public boolean f107487b = false;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTConnectDeviceEvent$b */
    public static final class C40081b {

        /* renamed from: a */
        public boolean f107488a;
    }

    public ExDeviceSimpleBTConnectDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTConnectDeviceEvent)) {
            return false;
        }
        ExDeviceSimpleBTConnectDeviceEvent exDeviceSimpleBTConnectDeviceEvent = (ExDeviceSimpleBTConnectDeviceEvent) iEvent;
        C40080a aVar = exDeviceSimpleBTConnectDeviceEvent.f107484d;
        if (!C46238a.m51546a(this.f107484d.f107486a, aVar.f107486a) || !C46238a.m51546a(Boolean.valueOf(this.f107484d.f107487b), Boolean.valueOf(aVar.f107487b))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107485e.f107488a), Boolean.valueOf(exDeviceSimpleBTConnectDeviceEvent.f107485e.f107488a));
    }
}
