package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent */
public final class ExDeviceCancelNetworkDeviceTaskEvent extends IEvent {

    /* renamed from: d */
    public C92477a f264701d = new C92477a();

    /* renamed from: e */
    public C92478b f264702e = new C92478b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent$a */
    public static final class C92477a {

        /* renamed from: a */
        public String f264703a;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCancelNetworkDeviceTaskEvent$b */
    public static final class C92478b {

        /* renamed from: a */
        public boolean f264704a;
    }

    public ExDeviceCancelNetworkDeviceTaskEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceCancelNetworkDeviceTaskEvent)) {
            return false;
        }
        ExDeviceCancelNetworkDeviceTaskEvent exDeviceCancelNetworkDeviceTaskEvent = (ExDeviceCancelNetworkDeviceTaskEvent) iEvent;
        if (!C46238a.m51546a(this.f264701d.f264703a, exDeviceCancelNetworkDeviceTaskEvent.f264701d.f264703a)) {
            return false;
        }
        this.f264701d.getClass();
        Boolean bool = Boolean.FALSE;
        if (!C46238a.m51546a(bool, bool)) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264702e.f264704a), Boolean.valueOf(exDeviceCancelNetworkDeviceTaskEvent.f264702e.f264704a));
    }
}
