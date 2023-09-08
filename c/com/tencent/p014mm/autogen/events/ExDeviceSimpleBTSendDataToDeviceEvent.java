package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTSendDataToDeviceEvent */
public final class ExDeviceSimpleBTSendDataToDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40087a f107503d = new C40087a();

    /* renamed from: e */
    public C40088b f107504e = new C40088b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTSendDataToDeviceEvent$a */
    public static final class C40087a {
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTSendDataToDeviceEvent$b */
    public static final class C40088b {

        /* renamed from: a */
        public boolean f107505a;
    }

    public ExDeviceSimpleBTSendDataToDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTSendDataToDeviceEvent)) {
            return false;
        }
        ExDeviceSimpleBTSendDataToDeviceEvent exDeviceSimpleBTSendDataToDeviceEvent = (ExDeviceSimpleBTSendDataToDeviceEvent) iEvent;
        C40087a aVar = exDeviceSimpleBTSendDataToDeviceEvent.f107503d;
        this.f107503d.getClass();
        aVar.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        this.f107503d.getClass();
        if (!C46238a.m51546a((Object) null, (Object) null)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f107504e.f107505a), Boolean.valueOf(exDeviceSimpleBTSendDataToDeviceEvent.f107504e.f107505a));
    }
}
