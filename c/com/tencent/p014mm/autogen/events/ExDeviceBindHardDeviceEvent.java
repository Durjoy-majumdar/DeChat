package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import ob0.C117747y;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent */
public final class ExDeviceBindHardDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40057a f107424d = new C40057a();

    /* renamed from: e */
    public C40058b f107425e = new C40058b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent$a */
    public static final class C40057a {

        /* renamed from: a */
        public String f107426a;

        /* renamed from: b */
        public int f107427b = 0;

        /* renamed from: c */
        public int f107428c = 0;

        /* renamed from: d */
        public C117747y f107429d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent$b */
    public static final class C40058b {

        /* renamed from: a */
        public C117747y f107430a;
    }

    public ExDeviceBindHardDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceBindHardDeviceEvent)) {
            return false;
        }
        ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = (ExDeviceBindHardDeviceEvent) iEvent;
        C40057a aVar = exDeviceBindHardDeviceEvent.f107424d;
        if (!C46238a.m51546a(this.f107424d.f107426a, aVar.f107426a) || !C46238a.m51546a(Integer.valueOf(this.f107424d.f107427b), Integer.valueOf(aVar.f107427b)) || !C46238a.m51546a(Integer.valueOf(this.f107424d.f107428c), Integer.valueOf(aVar.f107428c)) || !C46238a.m51546a(this.f107424d.f107429d, aVar.f107429d)) {
            return false;
        }
        return C46238a.m51546a(this.f107425e.f107430a, exDeviceBindHardDeviceEvent.f107425e.f107430a);
    }
}
