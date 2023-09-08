package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnScanResultEvent */
public final class ExDeviceSimpleBTOnScanResultEvent extends IEvent {

    /* renamed from: d */
    public C40084a f107496d = new C40084a();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceSimpleBTOnScanResultEvent$a */
    public static final class C40084a {

        /* renamed from: a */
        public String f107497a;

        /* renamed from: b */
        public String f107498b;

        /* renamed from: c */
        public boolean f107499c;
    }

    public ExDeviceSimpleBTOnScanResultEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceSimpleBTOnScanResultEvent)) {
            return false;
        }
        C40084a aVar = ((ExDeviceSimpleBTOnScanResultEvent) iEvent).f107496d;
        return C46238a.m51546a(this.f107496d.f107497a, aVar.f107497a) && C46238a.m51546a(this.f107496d.f107498b, aVar.f107498b) && C46238a.m51546a(Boolean.valueOf(this.f107496d.f107499c), Boolean.valueOf(aVar.f107499c));
    }
}
