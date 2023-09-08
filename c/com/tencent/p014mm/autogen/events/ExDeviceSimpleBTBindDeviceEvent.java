package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent */
public final class ExDeviceSimpleBTBindDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40078a f107481d = new C40078a();

    /* renamed from: e */
    public C40079b f107482e = new C40079b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$a */
    public static final class C40078a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTBindDeviceEvent$b */
    public static final class C40079b {

        /* renamed from: a */
        public boolean f107483a;
    }

    public ExDeviceSimpleBTBindDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTBindDeviceEvent)) {
            return false;
        }
        ExDeviceSimpleBTBindDeviceEvent exDeviceSimpleBTBindDeviceEvent = (ExDeviceSimpleBTBindDeviceEvent) iEvent;
        C40078a aVar = exDeviceSimpleBTBindDeviceEvent.f107481d;
        this.f107481d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107481d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107481d.getClass();
        if (!C46238a.m51546a(0L, 0L)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107482e.f107483a), Boolean.valueOf(exDeviceSimpleBTBindDeviceEvent.f107482e.f107483a));
    }
}
