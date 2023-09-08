package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent */
public final class ExDeviceCheckNetworkDeviceUploadCdnEvent extends IEvent {

    /* renamed from: d */
    public C92479a f264705d = new C92479a();

    /* renamed from: e */
    public C92480b f264706e = new C92480b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent$a */
    public static final class C92479a {

        /* renamed from: a */
        public long f264707a;

        /* renamed from: b */
        public String f264708b;

        /* renamed from: c */
        public boolean f264709c;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceCheckNetworkDeviceUploadCdnEvent$b */
    public static final class C92480b {

        /* renamed from: a */
        public boolean f264710a;
    }

    public ExDeviceCheckNetworkDeviceUploadCdnEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceCheckNetworkDeviceUploadCdnEvent)) {
            return false;
        }
        ExDeviceCheckNetworkDeviceUploadCdnEvent exDeviceCheckNetworkDeviceUploadCdnEvent = (ExDeviceCheckNetworkDeviceUploadCdnEvent) iEvent;
        C92479a aVar = exDeviceCheckNetworkDeviceUploadCdnEvent.f264705d;
        if (!C46238a.m51546a(Long.valueOf(this.f264705d.f264707a), Long.valueOf(aVar.f264707a)) || !C46238a.m51546a(this.f264705d.f264708b, aVar.f264708b) || !C46238a.m51546a(Boolean.valueOf(this.f264705d.f264709c), Boolean.valueOf(aVar.f264709c))) {
            return false;
        }
        return C46238a.m51546a(Boolean.valueOf(this.f264706e.f264710a), Boolean.valueOf(exDeviceCheckNetworkDeviceUploadCdnEvent.f264706e.f264710a));
    }
}
