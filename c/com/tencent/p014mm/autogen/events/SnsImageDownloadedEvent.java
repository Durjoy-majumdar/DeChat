package com.tencent.p014mm.autogen.events;

import com.tencent.p014mm.sdk.event.IEvent;
import if0.C46238a;
import te3.C101804kv2;

/* renamed from: com.tencent.mm.autogen.events.SnsImageDownloadedEvent */
public final class SnsImageDownloadedEvent extends IEvent {

    /* renamed from: d */
    public C1139a f9515d = new C1139a();

    /* renamed from: com.tencent.mm.autogen.events.SnsImageDownloadedEvent$a */
    public static final class C1139a {

        /* renamed from: a */
        public int f9516a;

        /* renamed from: b */
        public C101804kv2 f9517b;

        /* renamed from: c */
        public String f9518c;

        /* renamed from: d */
        public String f9519d;
    }

    public SnsImageDownloadedEvent() {
        this.order = false;
        this.callback = null;
    }

    public boolean compareContent(IEvent iEvent) {
        if (iEvent == null || !(iEvent instanceof SnsImageDownloadedEvent)) {
            return false;
        }
        C1139a aVar = ((SnsImageDownloadedEvent) iEvent).f9515d;
        return C46238a.m51546a(Integer.valueOf(this.f9515d.f9516a), Integer.valueOf(aVar.f9516a)) && C46238a.m51546a(this.f9515d.f9517b, aVar.f9517b) && C46238a.m51546a(this.f9515d.f9518c, aVar.f9518c) && C46238a.m51546a(this.f9515d.f9519d, aVar.f9519d);
    }
}
