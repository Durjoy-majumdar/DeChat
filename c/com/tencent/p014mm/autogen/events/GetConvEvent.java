package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.p136ui.conversation.C74704k1;
import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.GetConvEvent */
public final class GetConvEvent extends IEvent {

    /* renamed from: d */
    public C40118a f107586d = new C40118a();

    /* renamed from: e */
    public C40119b f107587e = new C40119b();

    /* renamed from: com.tencent.mm.autogen.events.GetConvEvent$a */
    public static final class C40118a {

        /* renamed from: a */
        public C74704k1 f107588a;

        /* renamed from: b */
        public String f107589b;

        /* renamed from: c */
        public int f107590c;
    }

    /* renamed from: com.tencent.mm.autogen.events.GetConvEvent$b */
    public static final class C40119b {
    }

    public GetConvEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof GetConvEvent)) {
            return false;
        }
        GetConvEvent getConvEvent = (GetConvEvent) iEvent;
        C40118a aVar = getConvEvent.f107586d;
        if (!C46238a.m51546a(this.f107586d.f107588a, aVar.f107588a) || !C46238a.m51546a(this.f107586d.f107589b, aVar.f107589b) || !C46238a.m51546a(Integer.valueOf(this.f107586d.f107590c), Integer.valueOf(aVar.f107590c))) {
            return false;
        }
        C40119b bVar = getConvEvent.f107587e;
        this.f107587e.getClass();
        bVar.getClass();
        return C46238a.m51546a(0, 0);
    }
}
