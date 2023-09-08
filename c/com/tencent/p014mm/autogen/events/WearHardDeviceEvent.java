package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.WearHardDeviceEvent */
public final class WearHardDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40185a f107826d = new C40185a();

    /* renamed from: com.tencent.mm.autogen.events.WearHardDeviceEvent$a */
    public static final class C40185a {

        /* renamed from: a */
        public int f107827a;

        /* renamed from: b */
        public boolean f107828b;

        /* renamed from: c */
        public String f107829c;

        /* renamed from: d */
        public String f107830d;

        /* renamed from: e */
        public byte[] f107831e;
    }

    public WearHardDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof WearHardDeviceEvent)) {
            return false;
        }
        C40185a aVar = ((WearHardDeviceEvent) iEvent).f107826d;
        return C46238a.m51546a(Integer.valueOf(this.f107826d.f107827a), Integer.valueOf(aVar.f107827a)) && C46238a.m51546a(Boolean.valueOf(this.f107826d.f107828b), Boolean.valueOf(aVar.f107828b)) && C46238a.m51546a(this.f107826d.f107829c, aVar.f107829c) && C46238a.m51546a(this.f107826d.f107830d, aVar.f107830d) && C46238a.m51546a(this.f107826d.f107831e, aVar.f107831e);
    }
}
