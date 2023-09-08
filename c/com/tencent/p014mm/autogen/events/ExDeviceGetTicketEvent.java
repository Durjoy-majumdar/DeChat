package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.ExDeviceGetTicketEvent */
public final class ExDeviceGetTicketEvent extends IEvent {

    /* renamed from: d */
    public C1016a f9095d = new C1016a();

    /* renamed from: e */
    public C1017b f9096e = new C1017b();

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$a */
    public static final class C1016a {

        /* renamed from: a */
        public String f9097a;

        /* renamed from: b */
        public String f9098b;

        /* renamed from: c */
        public int f9099c;

        /* renamed from: d */
        public String f9100d;
    }

    /* renamed from: com.tencent.mm.autogen.events.ExDeviceGetTicketEvent$b */
    public static final class C1017b {

        /* renamed from: a */
        public boolean f9101a;

        /* renamed from: b */
        public String f9102b;
    }

    public ExDeviceGetTicketEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof ExDeviceGetTicketEvent)) {
            return false;
        }
        ExDeviceGetTicketEvent exDeviceGetTicketEvent = (ExDeviceGetTicketEvent) iEvent;
        C1016a aVar = exDeviceGetTicketEvent.f9095d;
        if (!C46238a.m51546a(this.f9095d.f9097a, aVar.f9097a) || !C46238a.m51546a(this.f9095d.f9098b, aVar.f9098b) || !C46238a.m51546a(Integer.valueOf(this.f9095d.f9099c), Integer.valueOf(aVar.f9099c)) || !C46238a.m51546a(this.f9095d.f9100d, aVar.f9100d)) {
            return false;
        }
        C1017b bVar = exDeviceGetTicketEvent.f9096e;
        return C46238a.m51546a(Boolean.valueOf(this.f9096e.f9101a), Boolean.valueOf(bVar.f9101a)) && C46238a.m51546a(this.f9096e.f9102b, bVar.f9102b);
    }
}
