package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.RadarSayHiMsgEvent */
public final class RadarSayHiMsgEvent extends IEvent {

    /* renamed from: d */
    public C67765a f193859d = new C67765a();

    /* renamed from: e */
    public C67766b f193860e = new C67766b();

    /* renamed from: com.tencent.mm.autogen.events.RadarSayHiMsgEvent$a */
    public static final class C67765a {

        /* renamed from: a */
        public String f193861a;

        /* renamed from: b */
        public String f193862b;
    }

    /* renamed from: com.tencent.mm.autogen.events.RadarSayHiMsgEvent$b */
    public static final class C67766b {
    }

    public RadarSayHiMsgEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof RadarSayHiMsgEvent)) {
            return false;
        }
        RadarSayHiMsgEvent radarSayHiMsgEvent = (RadarSayHiMsgEvent) iEvent;
        C67765a aVar = radarSayHiMsgEvent.f193859d;
        if (!C46238a.m51546a(this.f193859d.f193861a, aVar.f193861a) || !C46238a.m51546a(this.f193859d.f193862b, aVar.f193862b)) {
            return false;
        }
        C67766b bVar = radarSayHiMsgEvent.f193860e;
        this.f193860e.getClass();
        Boolean bool = Boolean.FALSE;
        bVar.getClass();
        return C46238a.m51546a(bool, bool);
    }
}
