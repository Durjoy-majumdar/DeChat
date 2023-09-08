package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;

/* renamed from: com.tencent.mm.autogen.events.PreSendImgDataEvent */
public final class PreSendImgDataEvent extends IEvent {

    /* renamed from: d */
    public C40154a f107697d = new C40154a();

    /* renamed from: com.tencent.mm.autogen.events.PreSendImgDataEvent$a */
    public static final class C40154a {

        /* renamed from: a */
        public String f107698a;

        /* renamed from: b */
        public String f107699b;

        /* renamed from: c */
        public String f107700c;

        /* renamed from: d */
        public int f107701d = 0;

        /* renamed from: e */
        public int f107702e = 0;
    }

    public PreSendImgDataEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof PreSendImgDataEvent)) {
            return false;
        }
        C40154a aVar = ((PreSendImgDataEvent) iEvent).f107697d;
        if (!C46238a.m51546a(this.f107697d.f107698a, aVar.f107698a) || !C46238a.m51546a(this.f107697d.f107699b, aVar.f107699b) || !C46238a.m51546a(this.f107697d.f107700c, aVar.f107700c) || !C46238a.m51546a(Integer.valueOf(this.f107697d.f107701d), Integer.valueOf(aVar.f107701d)) || !C46238a.m51546a(Integer.valueOf(this.f107697d.f107702e), Integer.valueOf(aVar.f107702e))) {
            return false;
        }
        this.f107697d.getClass();
        if (!C46238a.m51546a(0, 0)) {
            return false;
        }
        this.f107697d.getClass();
        return C46238a.m51546a(0, 0);
    }
}
