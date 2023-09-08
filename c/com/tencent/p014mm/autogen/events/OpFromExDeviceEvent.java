package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.OpFromExDeviceEvent */
public final class OpFromExDeviceEvent extends IEvent {

    /* renamed from: d */
    public C40149a f107677d = new C40149a();

    /* renamed from: com.tencent.mm.autogen.events.OpFromExDeviceEvent$a */
    public static final class C40149a {

        /* renamed from: a */
        public int f107678a = 0;

        /* renamed from: b */
        public String f107679b;

        /* renamed from: c */
        public String f107680c;

        /* renamed from: d */
        public String f107681d;

        /* renamed from: e */
        public int f107682e;

        /* renamed from: f */
        public int f107683f;
    }

    public OpFromExDeviceEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof OpFromExDeviceEvent)) {
            return false;
        }
        C40149a aVar = ((OpFromExDeviceEvent) iEvent).f107677d;
        return C46238a.m51546a(Integer.valueOf(this.f107677d.f107678a), Integer.valueOf(aVar.f107678a)) && C46238a.m51546a(this.f107677d.f107679b, aVar.f107679b) && C46238a.m51546a(this.f107677d.f107680c, aVar.f107680c) && C46238a.m51546a(this.f107677d.f107681d, aVar.f107681d) && C46238a.m51546a(Integer.valueOf(this.f107677d.f107682e), Integer.valueOf(aVar.f107682e)) && C46238a.m51546a(Integer.valueOf(this.f107677d.f107683f), Integer.valueOf(aVar.f107683f));
    }
}
