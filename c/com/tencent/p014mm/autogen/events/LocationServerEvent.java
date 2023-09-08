package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.storage.C72963f4;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.LocationServerEvent */
public final class LocationServerEvent extends IEvent {

    /* renamed from: d */
    public C67729a f193728d = new C67729a();

    /* renamed from: e */
    public C67730b f193729e = new C67730b();

    /* renamed from: com.tencent.mm.autogen.events.LocationServerEvent$a */
    public static final class C67729a {

        /* renamed from: a */
        public int f193730a = 0;

        /* renamed from: b */
        public String f193731b;

        /* renamed from: c */
        public boolean f193732c = false;

        /* renamed from: d */
        public C72963f4 f193733d;
    }

    /* renamed from: com.tencent.mm.autogen.events.LocationServerEvent$b */
    public static final class C67730b {

        /* renamed from: a */
        public String f193734a;

        /* renamed from: b */
        public String f193735b;
    }

    public LocationServerEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof LocationServerEvent)) {
            return false;
        }
        LocationServerEvent locationServerEvent = (LocationServerEvent) iEvent;
        C67729a aVar = locationServerEvent.f193728d;
        if (!C46238a.m51546a(Integer.valueOf(this.f193728d.f193730a), Integer.valueOf(aVar.f193730a)) || !C46238a.m51546a(this.f193728d.f193731b, aVar.f193731b) || !C46238a.m51546a(Boolean.valueOf(this.f193728d.f193732c), Boolean.valueOf(aVar.f193732c)) || !C46238a.m51546a(this.f193728d.f193733d, aVar.f193733d)) {
            return false;
        }
        C67730b bVar = locationServerEvent.f193729e;
        return C46238a.m51546a(this.f193729e.f193734a, bVar.f193734a) && C46238a.m51546a(this.f193729e.f193735b, bVar.f193735b);
    }
}
